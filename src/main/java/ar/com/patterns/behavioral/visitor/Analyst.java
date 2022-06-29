package ar.com.patterns.behavioral.visitor;

public class Analyst implements Employee {

    private String name;
    private String nameRol;
    private double salary;




    @Override
    public void accept(Visitor visitor) {
        visitor.doForAnalyst(this);

    }
}
