package ar.com.patterns.structural.facade;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * To use the facade pattern we create a class that simplifies and unifies a set of more
 * complex classes that belong to some subsystem. Unlike a lot of patterns, Facade is fairly
 * straightforward; there are no mind-bending abstraction to get your head around.*/
public class TripPackageFacade {

    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;

    {
        hotelBooker = new HotelBooker();
        flightBooker = new FlightBooker();
    }

    public List<TripPackage> getTripPackages(Date from, Date to){
       List<Flight> flights = flightBooker.getAvailableFlights(from, to);
       List<Hotel> hotels = hotelBooker.getAvailableHotels(from, to);
       // todo return match list between flights and hotels
       return Collections.emptyList();
    }

    public void bookTripPackage(TripPackage tripPackage){
       hotelBooker.bookHotel(tripPackage.getHotel());
       flightBooker.bookFlight(tripPackage.getFlight());
    }


}
