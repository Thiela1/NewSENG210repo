import java.util.Scanner;

public class PizzaCrust {
	int crustPref;
	int userInput;
	double thickness;
	String crustFlavor;// added a comment
	
	// Allows customer to choose their style of crust
	// Adding comment to test conflict
	private void chooseCrust() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("How would you like your crust? \n 1. Soft\n 2. Medium\n 3. Hard");
		userInput = scnr.nextInt();
		
		if(userInput == 1) {
			System.out.println("Soft crust it is then!");
			crustPref = userInput;
		}
		else if(userInput == 2) {
			System.out.println("Solid choice, medium crust coming right up.");
			crustPref = userInput;
		}
		else if(userInput == 3) {
			System.out.println("Crisp and crunchy! Can't go wrong with hard crust.");
			crustPref = userInput;
		}
		else {
			System.out.println("Not a valid input.");
		}
	}
	// Allows customer to choose custom crust thickness
	private void chooseThickness() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter your desired crust thickness (in inches, e.g., 0.5, 1.0, 1.5): ");
		thickness = scnr.nextDouble();
		System.out.println("You've chosen a crust thickness of " + thickness + " inches.");
	}
	
	// Allows customer to choose crust flavoring
	private void chooseCrustFlavor() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Choose your crust flavoring: \n 1. Garlic\n 2. Herb\n 3. Cheese\n 4. No flavor");
		userInput = scnr.nextInt();
		
		switch (userInput) {
			case 1:
				crustFlavor = "Garlic";
				System.out.println("You've chosen Garlic flavoring.");
				break;
			case 2:
				crustFlavor = "Herb";
				System.out.println("You've chosen Herb flavoring.");
				break;
			case 3:
				crustFlavor = "Cheese";
				System.out.println("You've chosen Cheese flavoring.");
				break;
			case 4:
				crustFlavor = "No flavor";
				System.out.println("You've chosen no flavoring.");
				break;
			default:
				System.out.println("Not a valid input.");
				crustFlavor = "No flavor"; // Default option if invalid input
		//Adding comment
		//Another comment
		
	}
}
