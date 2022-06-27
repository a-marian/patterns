package ar.com.patterns.behavioral.strategy;

public class Navigation {

	private Route route;
	
	public Navigation(){
		route = this.getBestRoute();
	}
	
	
	private Route getBestRoute(){
		Route r1 = new RouteOne();
		Route r2 = new RouteTwo();
		
		//get traffic
		if(r1.getTraffic() == Traffic.LOW_TRAFFIC && r2.getTraffic() == Traffic.HIGH_TRAFFIC){
			System.out.println("Selecting Low traffic route - Route 1");
			return r1;
		}
		System.out.println("Selecting Route 2");
		return r2;
	}
	
	public void navigate(){
		route.getDirections();
	}
	


}




