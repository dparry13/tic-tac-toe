package ticTacToe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String playerName;
		boolean playerTurn = true;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to tic-tac-toe");
		System.out.println("Please enter your name");
		playerName = input.next();
		System.out.println(playerName + " would you like to go first? (y/n)");
		String playerFirst;
		
		//see if player wants to go first
		boolean validEntry = false;
		do {
			playerFirst = input.next();
			if (playerFirst.equals("y") || playerFirst.equals("Y")) {
				playerTurn = true;
				validEntry = true;
			} else if (playerFirst.equals("n") || playerFirst.equals("N")) {
				playerTurn = false;
				validEntry = true;
			} else {
				System.out.println("Please enter either a \"y\" or an \"n\"");
			}
		} while (!validEntry);
		//insert try and catch above
		boolean likeToPlayAgain = false;
		do {		
			GamePlay game1 = new GamePlay();
			game1.playGame(playerTurn, playerName);
			
			System.out.println("Would you like to play again? (y/n)");
			String playAgain = input.next();
		
			if (playAgain.equals("y") || playAgain.equals("Y")) {
				likeToPlayAgain = true;
			} else if (playAgain.equals("n") || playAgain.equals("N")) {
				likeToPlayAgain = false;
			}
		} while (likeToPlayAgain);
		
		System.out.println("Thank you for playing!");
		System.exit(0);
	}
}
