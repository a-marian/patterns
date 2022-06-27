package ar.com.patterns.structural.facade;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class HotelBooker {

    public List<Hotel> getAvailableHotels(Date from, Date to){
        return Collections.emptyList();
    }

    public void  bookHotel(Hotel hotel){
            //book hotel
    }
}
