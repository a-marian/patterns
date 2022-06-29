package ar.com.patterns.behavioral.visitor;

public class PrinterWorkerVisitor implements WorkerVisitor{
    @Override
    public void doForDirector(Director director) {
        System.out.println("Print reports for Director");
    }

    @Override
    public void doForManager(Manager manager) {
        System.out.println("Print reports for Manager");
    }

    @Override
    public void doForAnalyst(Analyst analyst) {
        System.out.println("Print reports for Analyst");
    }
}
