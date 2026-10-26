import java.util.Scanner;

public class Discount{
	public static void main(String[] args){
		// Purchase amount and discount percent
		double purchase;
		double discount;
		discount = 10;
		
		// taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Purchase Amount: ");
		purchase = input.nextInt();
		
		// calculating discount and Discounted price
		double discountOf; // 10% of all the purchase that is going to be off 
		double finalPrice; // discounted price
		
		discountOf = purchase * (discount/100);
		finalPrice = purchase - discountOf; 
		
		// checking for purchase above 5000
		if (purchase >= 5000){
			System.out.println("Congratulations! You got 10% Discount on your Purchase");
			System.out.println("You Got " + discountOf + " Rs off on your purchase");
			System.out.println("Discounted Price: " + finalPrice + " Rs");
			}
			
		else{
			System.out.println("Purchase of: " + purchase + " Rs");
			}
		}
	}