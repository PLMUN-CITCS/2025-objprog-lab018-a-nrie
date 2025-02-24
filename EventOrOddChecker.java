import java.util.Scanner;

// Group 6

public class EvenOrOddChecker {
	public static void main(String[] args) {
		int num = getIntegerInput(); //Get the number
		checkEvenOrOdd(num);	//Check the number
	}
	
	public static int getIntegerInput() {
	    Scanner userInput = new Scanner(System.in);
	    System.out.print ("Enter an integer: ");
	    int userInt = userInput.nextInt();
	    userInput.close();
	    return userInt;
	}
	
	public static void checkEvenOrOdd (int intNum) {
	    int intRemainder = intNum % 2;
	    if (intRemainder == 0) {
	        System.out.println( intNum + " is an Even number.");
	    } else {
	        System.out.println( intNum + " is an Odd number.");
	    }
	}
}

