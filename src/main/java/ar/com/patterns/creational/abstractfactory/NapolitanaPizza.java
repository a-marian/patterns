package ar.com.patterns.creational.abstractfactory;

public class NapolitanaPizza extends Pizza {

    public NapolitanaPizza(){
       this.setPlumpTomatoSauce(true);
    }

    private boolean plumpTomatoSauce;

    public void setPlumpTomatoSauce(boolean plumpTomatoSauce) {
        this.plumpTomatoSauce = plumpTomatoSauce;
    }

    @Override
    public String toString() {
        return "NapolitanaPizza{" +
                "name='" + getName() + '\'' +
                ", dough='" + getDough() + '\'' +
                ", sauce='" + getSauce() + '\'' +
                "plumpTomatoSauce=" + plumpTomatoSauce +
                '}';
    }
}
