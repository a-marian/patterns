package ar.com.patterns.behavioral.visitor;

public class Director implements Employee {

    private String name;
    private String nameRol;
    private double salary;

    private int numberProjects;

    @Override
    public void accept(Visitor visitor) {
        visitor.doForDirector(this);
    }
}
