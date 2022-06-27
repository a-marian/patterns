package ar.com.patterns.creational.builder;

public class IPhoneBuilder  extends CellPhoneBuilder {

    @Override
    public void buildOperatingSystem() {
        cellPhone.setOperatingSystem("IOS");
        cellPhone.setVersion("Apple iPhone 13 Pro Max");
    }

    @Override
    public void buildCamera() {
        cellPhone.setMainCamera("Main 12 MP: f/1.5 | Dual Pixel PDAF | sensor-shift OIS");
        cellPhone.setUltraWideCamera("UltraWide 12 MP: f/1.8 | 120° FOV | PDAF");
    }

    @Override
    public void buildProcessor() {
        cellPhone.setProcessor("Apple A15 Bionic (5 nm)\n" +
                "Hexa-core:\n" +
                "2x Avalanche @ 3.23 GHz\n" +
                "4x Blizzard\n" +
                "Custom Apple 5-core GPU");
    }

    @Override
    public void buildBattery() {
        cellPhone.setBattery("4352 mAh\n" +
                "Wired charging 20 W USB PD\n" +
                "Wireless charging 15W MagSafe (7.5W Qi)\n" +
                "Charger not included");
    }

    @Override
    public void buildScreen() {
        cellPhone.setScreen("6.7-inch OLED \"Super Retina XDR with ProMotion\"\n" +
                "2778 x 1284 pixels, 458 DPI\n" +
                "120Hz refresh rate\n" +
                "1200 nits maximum brightness");
    }
}
