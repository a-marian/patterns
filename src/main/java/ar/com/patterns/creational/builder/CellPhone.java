package ar.com.patterns.creational.builder;

public class CellPhone {

    private String processor;
    private String screen;
    private String mainCamera;
    private String ultraWideCamera;
    private String battery;
    private String OperatingSystem;
    private String version;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMainCamera() {
        return mainCamera;
    }

    public void setMainCamera(String mainCamera) {
        this.mainCamera = mainCamera;
    }

    public String getUltraWideCamera() {
        return ultraWideCamera;
    }

    public void setUltraWideCamera(String ultraWideCamera) {
        this.ultraWideCamera = ultraWideCamera;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                " Product version='" + getVersion() + '\'' +
                " processor='" + getProcessor() + '\'' +
                ", screen='" + getScreen() + '\'' +
                ", mainCamera='" + getMainCamera() + '\'' +
                ", ultraWideCamera='" + getUltraWideCamera() + '\'' +
                ", battery='" + getBattery() + '\'' +
                ", OperatingSystem='" + getOperatingSystem() + '\'' +
                '}';
    }
}
