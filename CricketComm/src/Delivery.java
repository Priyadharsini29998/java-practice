public class Delivery {
	private String batsman;
	//String name;
	private String bowler;
	

public void displayDeliveryDetails(String bowler, String batsman) {
	this.bowler=bowler;
	this.batsman = batsman;
	System.out.println("Player details of the delivery:");
	System.out.println("Bowler :"+bowler);
	System.out.println("Batsman :"+batsman);
}
public void displayDeliveryDetails(Long runs) {
	if(runs==4) {
		System.out.println("Number of runs scored in the delivery"+runs);
		System.out.println("It is a boundary");
	}
	else if(runs==6) {
		System.out.println("Number of runs scored in the delivery:"+runs);
		System.out.println("It is a sixer");
	}
	else
	{
		System.out.println("Number of runs scored in the delivery:"+runs);
	}
}

