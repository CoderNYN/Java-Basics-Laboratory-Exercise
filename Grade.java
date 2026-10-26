public class Grade{
	public static void main(String[] args){
		int marks;
		int percent;
		marks = 100;
		percent = marks/10;
		
		switch(percent){
			case 10:
				System.out.println("Grade: A+");
				break;
			
			case 9:
				System.out.println("Grade: A");
				break;
			
			case 8:
				System.out.println("Grade: B");
				break;
			
			case 7:
				System.out.println("Grade: C");
				break;
			
			case 6:
				System.out.println("Grade: C");
				break;
			
			case 5:
				System.out.println("Grade: D");
				break;
			
			case 4:
				System.out.println("Grade: D");
				break;
			
			case 3:
				System.out.println("Grade: E");
				break;
			
			case 2:
				System.out.println("Grade: F");
				break;
			
			case 1:
				System.out.println("Grade: F");
				break;
			
			default: 
				System.out.println("Better study hard onwards");
				break;
			}
		}
	}