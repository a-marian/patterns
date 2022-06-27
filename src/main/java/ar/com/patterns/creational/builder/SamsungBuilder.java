package ar.com.patterns.creational.builder;

public class SamsungBuilder  extends CellPhoneBuilder {

    @Override
    public void buildOperatingSystem() {
        cellPhone.setOperatingSystem("Android");
        cellPhone.setVersion("Samsung Galaxy S22 Ultra");
    }

    @Override
    public void buildCamera() {
        cellPhone.setMainCamera("Main 108 MP: f/1.8 | PDAF | OIS");
        cellPhone.setUltraWideCamera("Ultrawide 12 MP: f/2.2 | 120° FOV");
    }

    @Override
    public void buildProcessor() {
        cellPhone.setProcessor("Qualcomm Snapdragon 8 Gen 1\n" +
                "1x ARM Cortex-X2 @ 3.0 GHz\n" +
                "3x ARM Cortex-A710 @ 2.5 GHz\n" +
                "4x ARM Cortex-A510 @ 1.8 GHz\n" +
                "Qualcomm Adreno");
    }

    @Override
    public void buildBattery() {
        cellPhone.setBattery("5000 mAh\n" +
                "Wired charging: 45W USB PD 3.0\n" +
                "Wireless charging: 15W Qi\n" +
                "Wireless reverse charging: 4.5W\n" +
                "Charger not included");
    }

    @Override
    public void buildScreen() {
        cellPhone.setScreen("6.8\" OLED \"Dynamic AMOLED 2X\"\n" +
                "1440 x 3200 pixels, 515 DPI\n" +
                "120Hz refresh rate\n" +
                "Max. brightness 1750 nits");
    }
}
