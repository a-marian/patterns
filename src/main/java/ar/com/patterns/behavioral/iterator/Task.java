package ar.com.patterns.behavioral.iterator;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public record Task (int number, String name, LocalDateTime start, LocalDateTime end) {
    private static final int identifier = 0;
    public Task(int number, String name, LocalDateTime start, LocalDateTime end){
        this.number = identifier+1;
        if(name == null || name.equals("") || name.length() < 1)
            throw new IllegalArgumentException("Enter a properly name");
        this.name = name;
        if (end.isBefore(start))
            throw  new IllegalArgumentException("start date should be earlier than end");
        this.start = start;
        this.end = end;
    }

}
