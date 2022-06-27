package ar.com.patterns.creational.abstractfactory;

public class CapricciosaPizza extends Pizza {

    private boolean prociutto;

    CapricciosaPizza(){
        this.prociutto = true;
    }

    public boolean isProciutto() {
        return prociutto;
    }

    public void setProciutto(boolean prociutto) {
        this.prociutto = prociutto;
    }

    @Override
    public String toString() {
        return "CapricciosaPizza{" +
                "name='" + getName() + '\'' +
                ", dough='" + getDough() + '\'' +
                ", sauce='" + getSauce() + '\'' +
                "prociutto=" + prociutto +
                '}';
    }
}
