package ar.com.patterns.creational.builder;

public class Consumer {

    private CellPhoneBuilder cellPhoneBuilder;

    public Consumer(CellPhoneBuilder cellPhoneBuilder){
        this.cellPhoneBuilder = cellPhoneBuilder;
    }

    public CellPhone orderCellPhone(){
        return cellPhoneBuilder.getCellPhone();
    }

    public void buildCellPhone(){
        cellPhoneBuilder.createNewCellPhone();
        cellPhoneBuilder.buildBattery();
        cellPhoneBuilder.buildProcessor();
        cellPhoneBuilder.buildOperatingSystem();
        cellPhoneBuilder.buildCamera();
        cellPhoneBuilder.buildScreen();
    }
}
