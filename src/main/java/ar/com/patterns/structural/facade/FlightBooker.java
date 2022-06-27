package ar.com.patterns.structural.facade;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class FlightBooker {

    public List<Flight> getAvailableFlights(Date from, Date to){
        return Collections.emptyList();
    }

    public void bookFlight(Flight flight){
        //todobook Fligh
    }
}
