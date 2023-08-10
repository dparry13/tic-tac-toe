package ticTacToe;

import java.util.Map;

public class CheckWin extends GamePlay {

	public CheckWin() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean winChecker(boolean gameWon, Map gameBoard, String playerName) {
		for (int i = 1; i <9; i++) {
			//check up and down from top row
			if (gameBoard.get(i) == gameBoard.get((i) + 3) && gameBoard.get(i) == gameBoard.get((i) + 6)) {
				gameWon = true;
				if (gameBoard.get(i) == "X") {
					System.out.println(playerName + " won!");
					break;
				} else {
					System.out.println("The CPU won.");
					break;
				}
			}
			//horizontal
			if ((i == 1 || i == 4 || i == 7) && gameBoard.get(i) == gameBoard.get((i) + 1) && gameBoard.get(i) == gameBoard.get((i) + 2)) {
				gameWon = true;
				if (gameBoard.get(i) == "X") {
					System.out.println(playerName + " won!");
					break;
				} else {
					System.out.println("The CPU won.");
					break;
				}
			}
			//vertical middle
			if (gameBoard.get(i) == gameBoard.get((i) + 3) && gameBoard.get(i) == gameBoard.get((i) - 3)) {
				gameWon = true;
				if (gameBoard.get(i) == "X") {
					System.out.println(playerName + " won!");
					break;
				} else {
					System.out.println("The CPU won.");
					break;
				}
			}
			//vertical bottom
			if (gameBoard.get(i) == gameBoard.get((i) - 3) && gameBoard.get(i) == gameBoard.get((i) - 6)) {
				gameWon = true;
				if (gameBoard.get(i) == "X") {
					System.out.println(playerName + " won!");
					break;
				} else {
					System.out.println("The CPU won.");
					break;
				}
			}
			//diagonal top left to bottom right
			if (gameBoard.get(i) == gameBoard.get((i) + 4) && gameBoard.get(i) == gameBoard.get((i) + 8)) {
				gameWon = true;
				if (gameBoard.get(i) == "X") {
					System.out.println(playerName + " won!");
					break;
				} else {
					System.out.println("The CPU won.");
					break;
				}
			}
			//diagonal bottom right to top left
			if ((i == 7) && gameBoard.get(i) == gameBoard.get((i) - 2) && gameBoard.get(i) ==  gameBoard.get((i) - 4)) {
				gameWon = true;
				if (gameBoard.get(i) == "X") {
					System.out.println(playerName + " won!");
					break;
				} else {
					System.out.println("The CPU won.");
					break;
				}
			}
		}
		return gameWon;
	}

}
