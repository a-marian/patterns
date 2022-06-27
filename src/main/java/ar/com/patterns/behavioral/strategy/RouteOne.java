package ar.com.patterns.behavioral.strategy;

import java.util.Random;

public class RouteOne implements Route {

	public void getDirections() {
		// TODO Auto-generated method stub
		System.out.println("Turn left after 200 meters");
	}

	public int getTotalDistance() {
		// TODO Auto-generated method stub
		return 20;
	}

	public Enum<Traffic> getTraffic() {
		// TODO Auto-generated method stub
		Random random = new Random();
		if(random.nextBoolean() == true){
			System.out.println("High Traffic on Route 1");
			return Traffic.HIGH_TRAFFIC;
		}
		System.out.println("Low Traffic on Route 1");
		return Traffic.LOW_TRAFFIC;
	}

	
}
