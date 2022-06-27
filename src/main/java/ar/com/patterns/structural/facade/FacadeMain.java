package ar.com.patterns.structural.facade;

import java.util.Date;
import java.util.List;

/**
 * Facade pattern provides a unified interface to a set of interfaces in a subsystem
 * Facade defines a higher-level interface that makes the subsystem easier to use.*/
public class FacadeMain {
    public static void main(String[] args) {

        TripPackageFacade facade = new TripPackageFacade();

        List<TripPackage> tripPackages = facade.getTripPackages(new Date(), new Date());
        if (tripPackages != null && tripPackages.size() > 0){
            facade.bookTripPackage(tripPackages.get(0));
        }

    }
}
