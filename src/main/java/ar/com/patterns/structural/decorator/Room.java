package ar.com.patterns.structural.decorator;

public abstract class Room {

    private String paintColor;
    private String roomLighting;
    private String appliances;

    public abstract void checkRoomList();

    public String getPaintColor() {
        return paintColor;
    }

    public void setPaintColor(String paintColor) {
        this.paintColor = paintColor;
    }

    public String getRoomLighting() {
        return roomLighting;
    }

    public void setRoomLighting(String roomLighting) {
        this.roomLighting = roomLighting;
    }

    public String getAppliances() {
        return appliances;
    }

    public void setAppliances(String appliances) {
        this.appliances = appliances;
    }

}
