package lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		
		List<Integer> winningNumbers = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i = 0; i < 6; i++) {
			
			while (true) {
				int winningNumber = random.nextInt(49) + 1; // Generates a number between 0 and 48 and adds 1 so that it's between 1 and 49
				if (!winningNumbers.contains(winningNumber)) {
					winningNumbers.add(winningNumber);
					break;
				}
			}
		}
		
		System.out.println(winningNumbers);
		
		System.out.println("Please enter your 6 numbers between 1 and 49");

		Scanner scanner = new Scanner(System.in);
		
		
		List<Integer> guessedNumbers = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Your current numbers are " + guessedNumbers);
			System.out.println("Please enter a number (1-49)");
			while (true) {
				try {
					String numberString = scanner.nextLine();
					int number = Integer.parseInt(numberString);
					if (number >= 1 && number <= 49) {
						guessedNumbers.add(number);
						break;
					}
					else {
						System.out.println(number + " is not between 1 and 49. Please try again.");
					}					
				}
				catch (NumberFormatException nfe) {
					System.out.println("Dude, that's not even a number, please try again :)");
				}

			}
			
		}
		
		System.out.println("The winning numbers were: " + winningNumbers);
		System.out.println("Your numbers are: " + guessedNumbers);
		
		guessedNumbers.retainAll(winningNumbers); // Take our guessed numbers list and remove all the elements of the list that are not in the winning numbers list
		System.out.println("Your matched numbers are: " + guessedNumbers);
		
		if (guessedNumbers.containsAll(winningNumbers)) {
			System.out.println("Holy crap, you actually won! How did you do that?");
		}
		else { // 1 in 49 * 48 * 47 * 46 * 45 * 44 = 10,068,347,520, so the probability of winning is 1 in 10,068,347,520 if we were checking them in the right order...
				// The number of ways these numbers can be ordered is 6! which is 6*5*4*3*2*1 = 720,
				 // So the actual odds of winning are 10,068,347,520 / 720 = 13,983,816, so your odds are 1 in 13,983,816
			System.out.println("Sorry, you lost. Probabilistically speaking, it's not surprizing at all :)");
		}
		
		scanner.close();		
		
	}

}
