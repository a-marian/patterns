package ar.com.patterns.creational.abstractfactory;

public abstract class Pizza {

    private String name;
    private String dough;
    private String sauce;

    Pizza(){
        this.setDough("Crispier dough");
        this.setSauce("Tomato sauce");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

}
