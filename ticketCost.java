public class ticketCost{
	public static void main(String[] args){
		// declaring age of the customer and time of the movie
		int age;
		String showTime;
		boolean atDaytime;
		boolean isAdult;
		int ticketPrice;
		
		// Ticket input
		age = 11;
		atDaytime = false; // matinee or daytime show
		
		// prices
		/*
		for adult;
		normal ticket price = 100
		matinee ticket price = 50
		
		for kids(age below 13)
		normal ticket price = 60
		matinee ticket price = 40
		*/
		
		// checking if the customer is adult or not
		if (age > 13){
			isAdult = true;
			}
		else{
			isAdult = false;
			}
		// checking if it is normal time or matinee
		// matinee means daytime show(usually cheap)
		if (atDaytime){
			// price at matinee 
			showTime = "Matinee";
			if (isAdult){
				ticketPrice = 50; //ticket price for adult
				}
			else{
				ticketPrice = 40; // ticket price for kid
				}
			}
		else{
			// price of normal show
			showTime = "Normal";
			if (isAdult){
				ticketPrice = 100;
				}
			else{
				ticketPrice = 60;
				}
			}
		
		// Displaying customer age and show time and price 
		System.out.println("Customer Age: " + age);
		System.out.println("Show Time: " + showTime);
		System.out.println("Ticket Price: " + ticketPrice);
		
		}
	}