package ar.com.patterns.behavioral.templatemethod;

/** The Template Method defines the steps of an algorithm and allows subclasses
 * to provide the implementation for one or more steps.
 * This pattern defines the skeleton of an algorithm in a method,
 * deferring some steps to subclasses. Template method lets subclasses redefine
 * certain steps of an algorithm without changing the algorithm's structure.*/
public abstract class Compiler {

    public final void compile(){
        getLibraries();
        reserveRam();
        compileToTarget();
        afterCompileHook();
        compilationStatusNotification();
    }

    protected abstract void getLibraries();

    private void  reserveRam(){
        System.out.println("Ram reserved for compilation process");
    };

    protected abstract void compileToTarget();

    protected void afterCompileHook(){
        // do nothing by default
    }

    private void compilationStatusNotification(){
        System.out.println("Compilation successful");
    }
}
