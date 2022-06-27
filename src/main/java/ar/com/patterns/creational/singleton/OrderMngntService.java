package ar.com.patterns.creational.singleton;

/**
 * Define a provate static field in the singleto class
 * Make a constructor private
 * Implements public accessor function
 * Implement lazy initialization that is creation on first use inside the accessor fuction
 * MAke sure that accessor function is synchronized in case it is going to be used in multithreading env.
 *
 * */

public class OrderMngntService {

    private static OrderMngntService instance;

    private OrderMngntService (){
    }

    public static synchronized OrderMngntService getInstance() {
        if(instance == null) {
            instance =  new OrderMngntService();
        }
        return instance;
    }

    public void placeOrder() {
        System.out.println("Place order method is invoked");
    }
}
