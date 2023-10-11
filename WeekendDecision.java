import java.util.Scanner; 

/**
 * What to do this weekend
 * @author Kurt Brown
 */
public class WeekendDecision {

	public static void main(String[] args) {
		
		int parentsVisiting; 
		int weatherGood;
		int rich; 
		Scanner input = new Scanner(System.in);
		System.out.print("Parents visiting? Enter 1 for yes, 2 for no: ");
		parentsVisiting = input.nextInt();
		System.out.print("Is the weather good? Enter 1 for yes, 2 for no: ");
		weatherGood = input.nextInt();
		System.out.print("Are you rich? Enter 1 for yes, 2 for no: ");
		rich = input.nextInt();
		
		/**
		 * Decides what to do this weekend based on user input
		 * 
		 */
		
		if(parentsVisiting == 1 && weatherGood == 1) {
			if(rich == 1 || rich == 2) {
				System.out.print("Go to the cinema");	
			}
		}
		else if(parentsVisiting == 1 && weatherGood == 2) {
			if(rich == 1 || rich == 2) {
				System.out.print("Stay in");	
			}
		}
		else if(parentsVisiting == 2 && weatherGood == 1 && rich == 1) {
			System.out.print("Go Shopping");
		}
		else if(parentsVisiting == 2 && weatherGood == 1 && rich == 2) {
			System.out.print("Stay in");
		}
		else if(parentsVisiting == 2 && weatherGood == 2 && rich == 1) {
			System.out.print("Go to the cinema");
		}
		else if(parentsVisiting == 2 && weatherGood == 2 && rich == 2) {
			System.out.print("Stay in");
		}
		
	}

}
