package ar.com.patterns.behavioral.visitor;

public class Manager implements Employee {

    private String name;
    private String nameRol;
    private double salary;

    private String projectName;

    @Override
    public void accept(Visitor visitor) {
        visitor.doForManager(this);
    }
}
