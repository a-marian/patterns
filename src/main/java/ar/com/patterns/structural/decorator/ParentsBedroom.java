package ar.com.patterns.structural.decorator;

public class ParentsBedroom  extends HouseDecorator {

    Room room;

    public ParentsBedroom(Room room){
        super(room);
    }

    @Override
    public void decorate() {
        System.out.println("Decorate walls with paints");
    }

    @Override
    public void checkRoomList() {
        this.setAppliances("Security alarm");
        this.setRoomLighting("Calm Light Lamps");
        this.setPaintColor("Benjamin Moore Woodlawn Blue");
    }

    @Override
    public String toString() {
        return "ParentsBedroom{" +
                "paintColor='" + getPaintColor() + '\'' +
                ", roomLighting='" + getRoomLighting() + '\'' +
                ", appliances='" + getAppliances() + '\'' +
                '}';
    }
}
