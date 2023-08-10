package ticTacToe;

import java.util.Map;

public class verifyPlayerMove extends GamePlay {
	
	public verifyPlayerMove() {
		
	}

	public Map verifyMove (int selectedCell, Map gameMap) {
		
		boolean validCell = false;
		
		while (validCell == false) {
			if (gameMap.get(selectedCell) == "X" || gameMap.get(selectedCell) == "O") {
				System.out.println("Please enter an empty location");
				selectedCell = input.nextInt();
			}
			else {
				gameMap.put(selectedCell, "X");
				//System.out.print(gameMap.get(selectedCell));
				validCell = true;
			}
		}
		return gameMap;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		switch (selectedCell) {
		case 1: 
			gameBoard[0][0] = "X";
			break;
		case 2: 
			gameBoard[0][1] = "X";
			break;
		case 3: 
			gameBoard[0][2] = "X";
			break;
		case 4:
			gameBoard[1][0] = "X";
			break;
		case 5:
			gameBoard[1][1] = "X";
			break;
		case 6:
			gameBoard[1][2] = "X";
			break;
		case 7:
			gameBoard[2][0] = "X";
			break;
		case 8:
			gameBoard[2][1] = "X";
			break;
		case 9:
			gameBoard[2][2] = "X";
			break;
		}
	}

*/}
}
