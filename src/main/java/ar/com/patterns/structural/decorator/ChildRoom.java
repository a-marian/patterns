package ar.com.patterns.structural.decorator;

public class ChildRoom extends HouseDecorator {

    Room room;

    public ChildRoom(Room room) {
        super(room);
    }

    @Override
    public void decorate() {
        System.out.println("Paint the ceiling with stars");
    }

    @Override
    public void checkRoomList() {
        this.setAppliances("powerpoints");
        this.setRoomLighting("Two lights");
        this.setPaintColor("Outer space paints on walls");
    }

    @Override
    public String toString() {
        return "ChildRoom{" +
                "paintColor='" + getPaintColor() + '\'' +
                ", roomLighting='" + getRoomLighting() + '\'' +
                ", appliances='" + getAppliances() + '\'' +
                '}';
    }
}
