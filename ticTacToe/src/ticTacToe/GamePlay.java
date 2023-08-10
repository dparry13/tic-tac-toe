package ticTacToe;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class GamePlay {

	//String[][] gameBoard = new String[3][3];
	public Map<Integer, String> gameMap = new HashMap<>();
	boolean gameWon = false;
	Scanner input = new Scanner(System.in);
	
	public GamePlay () {
		this.gameMap = gameMap;
		this.gameWon = gameWon;
		this.input = input;
	}


	public void playGame (boolean playerTurn, String playerName) {
		
		int turnNumbers = 0;

		//populate gameMap
		for (Integer i = 1; i < 10; i++) {
			gameMap.put(i,i.toString());
		}
		
		while (gameWon == false) {
			
			if (turnNumbers == 9) {
				gameWon = true;
				System.out.println("The game was a tie");
				break;
			}
		//print out game map
			System.out.println();
			for (int i = 1; i < 10; i++) {
				System.out.print(gameMap.get(i) + " ");
				if (i == 3 || i == 6 || i == 9) {
					System.out.println();
				}
			}
			
			//player turn
			if (playerTurn == true) {
				System.out.println("Your turn " + playerName);
				System.out.println("Please enter the number of where you would like to insert your token");
				int cellNumber = 0;
				boolean validEntry = true;
				
				do {
					try {
						cellNumber = input.nextInt();
					} catch (InputMismatchException e) {
						//System.out.println("Please enter a number 1-9!");
						input.nextLine();
						//cellNumber = input.nextInt();
					}
						if (cellNumber < 1 || cellNumber > 10) {
							System.out.println("Please enter a number 1-9");
							validEntry = false;
						} else {
							validEntry = true;
						}
				} while (!validEntry);
				
				//call verifyPlayerMove and update game board
				verifyPlayerMove verify = new verifyPlayerMove();
				gameMap = verify.verifyMove(cellNumber, gameMap);
				
				//call checkWinner
				CheckWin checkWin = new CheckWin();
				gameWon = checkWin.winChecker(gameWon, gameMap, playerName);
				
				//increase turn number
				turnNumbers++;
				
				//change turn
				playerTurn = false;
			}
			//CPU turn
			else {
				System.out.println();
				System.out.println("It's the CPU's turn");
				
				//call CpuTurn
				CpuTurn cpuTurn = new CpuTurn();
				gameMap = cpuTurn.takeTurnCpu(gameMap);
				
				//call checkWinner
				CheckWin checkWin = new CheckWin();
				gameWon = checkWin.winChecker(gameWon, gameMap, playerName);
				
				//increase turn numbers
				turnNumbers++;
				
				//change turn
				playerTurn = true;
			}
		}
	}
}
