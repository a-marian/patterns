package ar.com.patterns.behavioral.visitor;

public interface WorkerVisitor  extends Visitor {

    public default void work(Employee... employees){
        for (Employee employee : employees){
            employee.accept(this);
        }
    }
}
