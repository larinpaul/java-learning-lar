package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String[] rpslk = {"r", "p", "s", "l", "k"};
			String computerMove = rpslk[new Random().nextInt(rpslk.length)];

			String playerMove;
			
			while(true) {
				System.out.println("Please enter your more (r, p, s, l, or k)");
				playerMove = scanner.nextLine();
				if (	   playerMove.equals("r") 
						|| playerMove.equals("p") 
						|| playerMove.equals("s")
						|| playerMove.equals("l")
						|| playerMove.equals("k")
				) {
					break;
				}
				System.out.println(playerMove + " is not a valid move.");
			}
			
			System.out.println("Computer player: " + computerMove);
			
			if (playerMove.equals(computerMove)) {
				System.out.println("The game was a tie!");
			}
			
			else if (playerMove.equals("r")) {
				if (computerMove.equals("p") ) {
					System.out.println("Paper covers rock. You lose!");
				}
				else if (computerMove.equals("s")) {
					System.out.println("Rock crushes scissors. You win!");
				}
				else if (computerMove.equals("l")) {
					System.out.println("Rock crushes lizard. You win!");
				}
				else if (computerMove.equals("k")) {
					System.out.println("Spock vaporizes the rock. You lose!");
				}
			}
			
			else if (playerMove.equals("p")) {
				if (computerMove.equals("r") ) {
					System.out.println("Paper covers rock. You win!");
				}
				else if (computerMove.equals("s")) {
					System.out.println("Siccors cuts paper. You lose!");
				}
				else if (computerMove.equals("l")) {
					System.out.println("Lizard eats paper. You lose!");
				}
				else if (computerMove.equals("k")) {
					System.out.println("Paper disproves Spock. You win!");
				}
			}
			
			else if (playerMove.equals("l")) {
				if (computerMove.equals("p") ) {
					System.out.println("Lizard eats paper. You win!");
				}
				else if (computerMove.equals("r")) {
					System.out.println("Rock crushes lizard. You lose!");
				}
				else if (computerMove.equals("s")) {
					System.out.println("Scissors decapitates lizard. You lose!");
				}
				else if (computerMove.equals("k")) {
					System.out.println("Lizard poisons Spock. You win!");
				}
			}
			
			else if (playerMove.equals("k")) {
				if (computerMove.equals("p") ) {
					System.out.println("Paper disproves Spock. You lose!");
				}
				else if (computerMove.equals("r")) {
					System.out.println("Spock vaporizes rock. You win!");
				}
				else if (computerMove.equals("s")) {
					System.out.println("Spock smashes scissors. You win!");
				}
				else if (computerMove.equals("l")) {
					System.out.println("Lizard poisons Spock. You lose!");
				}
			}
			
			else if (playerMove.equals("s")) {
				if (computerMove.equals("p") ) {
					System.out.println("Scissors cuts paper. You win!");
				}
				else if (computerMove.equals("r")) {
					System.out.println("Rock crushes scissors. You lose!");
				}
				else if (computerMove.equals("l")) {
					System.out.println("Scissors decapitates lizard. You win!");
				}
				else if (computerMove.equals("k")) {
					System.out.println("Spock smashes scissors. You lose!");
				}
			}
						
			
			System.out.println("Play again? (y/n)");
			String playAgain = scanner.nextLine();
			
			if (!playAgain.equals("y")) {
				break;
			}
			
		}
	}

}
