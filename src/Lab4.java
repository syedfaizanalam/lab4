import java.util.Scanner;

public class Lab4 {
	
	public static void main(String [] args) {
	
		boolean isTrue;
		Scanner scnr = new Scanner (System.in);
		
		
		do {
			System.out.println("Enter an integer");
				
				int userInput = scnr.nextInt();
				System.out.println("Number    Squared    Cubed");
				System.out.println("======    =======    =====");
				
				
				for(int i = 1; i <= userInput; i++) 
					System.out.printf("%-10s%-11s%-11s\n", i, (i*i), (i*i*i));
				
				System.out.println("Would you like to continue(y/n)");
				String response = scnr.next();
				isTrue = response.equalsIgnoreCase("y");
				
	}
	while(isTrue);
		System.out.println("Goodbye for now.");
				
	}
}