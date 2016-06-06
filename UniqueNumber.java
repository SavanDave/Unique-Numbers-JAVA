import java.util.Scanner;

public class UniqueNumber {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] userNumber = new int[5];
		int i = 0;
		int countOfUnique = 0;

		while (i < userNumber.length) {
			System.out.println("Unique Numbers so far: " + countOfUnique);
			System.out.println("User, enter an integer:");
			int enteredNumber = keyboard.nextInt();
			boolean validNumber = isValid(enteredNumber);
			boolean uniqueNumber = isUnique(userNumber, enteredNumber);
			if (validNumber && uniqueNumber) {
				userNumber[i] = enteredNumber;
				i++;
				countOfUnique++;
				System.out.println("You have entered a valid  and unique number.");
			} else if (validNumber & !uniqueNumber) {
				userNumber[i] = enteredNumber;
				System.out.println("That is not a Unique Number");
				i++;
			} else {
				System.out.println("INVALID NUMBER, USER");
			}

		}
		System.out.println("You have entered " + countOfUnique + " unique numbers.");
		for (int row = 0; row < userNumber.length; row++) {
			System.out.print(" " + userNumber[row]);

		}

	}

	public static boolean isUnique(int[] arraySoFar, int enteredNumber) {
		boolean result = true;
		for (int i = 0; i < arraySoFar.length; i++) {
			if (arraySoFar[i] == enteredNumber) {
				result = false;
			}
			// System.out.println("These are the unique numbers so far:");
			// for (int row = 0; row<= arraySoFar.length; row++){
			// if (arraySoFar[row] != enteredNumber){
			// System.out.println(" "+ arraySoFar[row]);
			// }
			// }
		}
		return result;
	}

	public static boolean isValid(int enteredNumber) {
		boolean result;
		if (enteredNumber >= 0 && enteredNumber <= 100) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
