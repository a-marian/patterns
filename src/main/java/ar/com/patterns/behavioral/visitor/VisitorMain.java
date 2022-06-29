package ar.com.patterns.behavioral.visitor;

/**
 * USer the visitor pattern when you want to add capabilities
 * to a composite of objects and encapsulation is not important.
 * */
public class VisitorMain {

    public static void main(String[] args) {
        var director = new Director();
        var manager = new Manager();
        var analyst = new Analyst();

        PrinterWorkerVisitor printer = new PrinterWorkerVisitor();
        printer.work(director, manager, analyst);

        System.out.println("------------------------------");

        HelpDeskWorkerVisitor helpDesk = new HelpDeskWorkerVisitor();
        helpDesk.work(director, manager, analyst);
    }
}
