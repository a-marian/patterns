package ar.com.patterns.behavioral.chainresponsability;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.function.Consumer;

public interface Logger {

      enum LogLevel {
        FUNCTIONAL_MESSAGE, FUNCTIONAL_ERROR, INFO, DEBUG, WARNING, ERROR;

         static LogLevel[] all (){
            return  values();
        }
    }
    default Logger setNextLevelLogger(Logger nextLevelLogger){
        return ( msg, severity ) -> {
            displayLog(msg, severity);
            nextLevelLogger.displayLog(msg, severity);
        };
    }
    void displayLog(String msg, LogLevel severity) ;

     static Logger writeLogger(LogLevel[] levels, Consumer<String> stringConsumer){
        EnumSet<LogLevel> set = EnumSet.copyOf(Arrays.asList(levels));
        return (msg, severity) -> {
          if (set.contains(severity)) {
              stringConsumer.accept(msg);
          }
        };
    }

    static Logger consoleLogger(LogLevel... levels){
        return writeLogger(levels, msg -> System.out.println("CONSOLE : "+ msg) );
    }

    static Logger fileLogger(LogLevel... levels){
        return writeLogger(levels, msg -> System.out.println("FILE : "+ msg) );
    }

    static Logger emailLogger(LogLevel... levels){
        return  writeLogger(levels, msg -> System.out.println("MAIL :" + msg));
    }

}
