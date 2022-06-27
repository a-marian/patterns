package ar.com.patterns.structural.facade;

public class TripPackage {

    private Flight flight;
    private Hotel hotel;

    public Flight getFlight() {
        return flight;
    }

    public Hotel getHotel() {
        return hotel;
    }
}
