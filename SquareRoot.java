import java.lang.Math;

public class SquareRoot{
	public static void main(String[] args){
		double SquareRoot = 0;
		int num = 5;
		
		while (SquareRoot < 50){
			SquareRoot = Math.sqrt(num);
			System.out.println("Square Root of " + num + " is: " + SquareRoot);
			num++;
			// num = num + 1
			}
		}
	}