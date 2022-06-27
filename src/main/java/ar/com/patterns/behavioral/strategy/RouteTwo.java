package ar.com.patterns.behavioral.strategy;

import java.util.Random;

public class RouteTwo implements Route {

	public void getDirections() {
		System.out.println("Turn Right after 150 meters");
	}

	public int getTotalDistance() {
		return 15;
	}

	public Enum<Traffic> getTraffic() {
		Random random = new Random();
		if(random.nextBoolean() == true){
			System.out.println("High Traffic on Route 2");
			return Traffic.HIGH_TRAFFIC;
		}
		System.out.println("Low Traffic on Route2");
		return Traffic.LOW_TRAFFIC;
	}

	
}
