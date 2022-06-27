package ar.com.patterns.structural.decorator;

public class Bedroom extends Room {

    private String chooseBed;
    private String chooseBedClothes;

    public Bedroom() {
    }

    @Override
    public void checkRoomList() {
        setRoomLighting("none");
       setChooseBedClothes("Choose");
       setChooseBed("Single");
    }

    public String getChooseBed() {
        return chooseBed;
    }

    public void setChooseBed(String chooseBed) {
        this.chooseBed = chooseBed;
    }

    public String getChooseBedClothes() {
        return chooseBedClothes;
    }

    public void setChooseBedClothes(String chooseBedClothes) {
        this.chooseBedClothes = chooseBedClothes;
    }
    
}
