package testes;
import java.util.Scanner;


public class cumeçano_ai {
	
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your monthly salary? ");
		
		int monthlySalary = scanner.nextInt();
		
		
		System.out.println("How many hours do you work in a month? ");
		
		int hoursMonth = scanner.nextInt();
		scanner.close();
		
		
		int valueHour = monthlySalary / hoursMonth;
		
		
		
		System.out.println("The value per hour you receive is : $" + valueHour);
		
		
		
		
		

		
		
		

	}
	
}
