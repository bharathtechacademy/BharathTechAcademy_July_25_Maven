package conditionalStatements;

public class ConditionalStatements {

	// Conditional Statements ==> Add Conditions along with statements

	// 1. if -else Conditional statement ==> When we don't know the result of the  condition beforehand
	// 2. switch case Conditional statement ==> When we know the result of the condition beforehand and we want to choose one of the options

	public static void main(String[] args) {

		// Example of if-else conditional statement
		boolean isCoolieMovieAvailable = false;
		boolean isWar2MovieAvailable = false;
		boolean isKhadgamMovieAvailable = true;
		
		boolean isReclinerAvailable = false;
		boolean isBolconyAvailable = false;

		if (isCoolieMovieAvailable) {
			System.out.println("Book Collie Movie Tickets");
			if (isReclinerAvailable) {
				System.out.println("Book Recliner Seats");
			} else if (isBolconyAvailable) {
				System.out.println("Book Balcony Seats");
			} else {
				System.out.println("No Recliner or Balcony Seats Available, So Book Normal Seats");
			}
		} else if (isWar2MovieAvailable) {
			System.out.println("Book War 2 Movie Tickets");
		} else if (isKhadgamMovieAvailable) {
			System.out.println("Book Khadgam Movie Tickets");
			// nested if-else
			if (isReclinerAvailable) {
				System.out.println("Book Recliner Seats");
			} else if (isBolconyAvailable) {
				System.out.println("Book Balcony Seats");
			} else {
				System.out.println("No Recliner or Balcony Seats Available, So Book Normal Seats");
			}
		} else {
			System.out.println("No Ticket Available, Go Home");
		}
		
		
		//Example switch case Conditional statement
		
/*		switch(input) {
		
		case input1:
			Code to execute if input is equal to input1;
			break;
			
		case input2:
			Code to execute if input is equal to input2;
			break;
				
		case input3:
			Code to execute if input is equal to input3;
			break;
					
		default:
			Code to execute if input does not match any of the cases;
			break;*/
		
		String day = "Sunday";
		
		String output = "";
		
		switch (day) {
			case "Monday":
				System.out.println("WeekDay");
				output = "WeekDay";
				break;
			case "Tuesday":
				System.out.println("WeekDay");
				output = "WeekDay";

				break;
			case "Wednesday":
				System.out.println("WeekDay");
				output = "WeekDay";

				break;
			case "Thursday":
				System.out.println("WeekDay");
				output = "WeekDay";

				break;
			case "Friday":
				System.out.println("WeekDay");
				output = "WeekDay";

				break;
			case "Saturday":
				System.out.println("Weekend");
				output = "Weekend";

				break;
			case "Sunday":
				System.out.println("Weekend");
				output = "Weekend";

				break;
			default:
				System.out.println("Invalid day");
						
		}
		
		//Switch case expression with String (Java 14+)
		String Output = switch (day) {
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "WeekDay";
		case "Saturday", "Sunday" -> "Weekend";
		default -> "Invalid day";
		};
	}
	
	

}
