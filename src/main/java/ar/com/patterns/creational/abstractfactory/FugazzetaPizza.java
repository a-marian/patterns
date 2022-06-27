package ar.com.patterns.creational.abstractfactory;

public class FugazzetaPizza extends Pizza{

    public FugazzetaPizza(){
        this.setCreamCheeseFilling(true);
    }

    private boolean creamCheeseFilling;

    public boolean isCreamCheeseFilling() {
        return creamCheeseFilling;
    }

    public void setCreamCheeseFilling(boolean creamCheeseFilling) {
        this.creamCheeseFilling = creamCheeseFilling;
    }

    @Override
    public String toString() {
        return "FugazzetaPizza{" +
                "name='" + getName() + '\'' +
                ", dough='" + getDough() + '\'' +
                ", sauce='" + getSauce() + '\'' +
                "creamCheeseFilling=" + creamCheeseFilling +
                '}';
    }
}
