package ar.com.patterns.structural.facade;

public class Hotel {

    public  String hotelName;
    private String city;
    private Integer stars;

    private int[] availableRooms = new int[2];

    public int[] getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int[] availableRooms) {
        this.availableRooms = availableRooms;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }
}
