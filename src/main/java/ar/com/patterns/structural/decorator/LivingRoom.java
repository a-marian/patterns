package ar.com.patterns.structural.decorator;

public class LivingRoom extends HouseDecorator {

    public LivingRoom(Room room){
        super(room);
    }

    private String chooseSofa;
    private String firePlace;

    @Override
    public void checkRoomList() {
        setPaintColor("white");
        setRoomLighting("dimmers");
        setAppliances("Wall mounted TV screen, powerpoints");
    }

    public String getChooseSofa() {
        return chooseSofa;
    }

    public void setChooseSofa(String chooseSofa) {
        this.chooseSofa = chooseSofa;
    }

    public String getFirePlace() {
        return firePlace;
    }

    public void setFirePlace(String firePlace) {
        this.firePlace = firePlace;
    }

    @Override
    public void decorate() {

    }
}
