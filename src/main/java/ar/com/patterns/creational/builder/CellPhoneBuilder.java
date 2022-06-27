package ar.com.patterns.creational.builder;

/**
 * Use Builder pattern to encapsulate the construction of a product and allow it to be constructed in steps.
 * Encapsulated the way a complex object is constructed.
 * Allows objects to be constructed in a multistep and varying process(as oposed to one step factories).
 * Hides the internal representation of the product from the client.
 * Product implementations can be swapped in and out because the client only sees and abstract interface.
 * Often used for building composite structures.*/

public abstract class CellPhoneBuilder {

    protected CellPhone cellPhone;

    public CellPhone getCellPhone(){
        return cellPhone;
    }

    public void createNewCellPhone() {
        cellPhone = new CellPhone();
    }

    public abstract  void buildOperatingSystem();

    public abstract void buildCamera();

    public abstract void buildProcessor();

    public abstract void buildBattery();

    public abstract void buildScreen();
}
