package ar.com.patterns.behavioral.visitor;

public class HelpDeskWorkerVisitor implements WorkerVisitor {
    @Override
    public void doForDirector(Director director) {
        System.out.println("Give technical support to Director");
    }

    @Override
    public void doForManager(Manager manager) {
        System.out.println("Give technical support to Manager");
    }

    @Override
    public void doForAnalyst(Analyst analyst) {
        System.out.println("Give technical support to Analyst");
    }
}
