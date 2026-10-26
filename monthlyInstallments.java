public class monthlyInstallments{
	public static void main(String[] args){
		int loan;
		int rate;
		int time; // in months
		double amount;
		double simpleInterest;
		double monthlyInstallment;
		
		// declaring values of loan and time(in months)
		loan = 100000;
		rate = 12;
		time = 36;
		
		// year = months/12
		// SI = (principle x rate x time)/
		int year = time/12;
		simpleInterest = (loan * year * rate)/100;
		amount = simpleInterest + loan;
		monthlyInstallment = amount/time;

		System.out.println("For the Loan of " + loan + " Rs");
		System.out.println("Monthly Installment is of " + monthlyInstallment + " Rs");
		
		}
	}