package ar.com.patterns.structural.decorator;


public class DecoratorMain {

    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom();
        bedroom.checkRoomList();


        ParentsBedroom parents = new ParentsBedroom(bedroom);
        bedroom.setChooseBed("King Size");
        bedroom.setChooseBedClothes("World tematic green");
        parents.checkRoomList();
        System.out.println("Decorated parent bedroom: " + parents);
        parents.decorate();


        ChildRoom child = new ChildRoom(new Bedroom());
        child.checkRoomList();
        System.out.println("Decorated child bedroom: " + child);
        child.decorate();
    }
}
