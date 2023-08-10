package ticTacToe;

import java.util.Map;
import java.util.Random;

public class CpuTurn extends GamePlay {

	public CpuTurn() {
	}
		Random randomGenerator = new Random();
		int CpuSelection = randomGenerator.nextInt(9) + 1;
		
	public Map takeTurnCpu(Map gameMap) {
		boolean validCell = false;
		//System.out.print(CpuSelection);
		
		while (validCell == false) {
			if (gameMap.get(CpuSelection) == "X" || gameMap.get(CpuSelection) == "O") {
				CpuSelection = randomGenerator.nextInt(9) + 1;
			}
			else {
				gameMap.put(CpuSelection, "O");
				validCell = true;
			}
		}
		return gameMap;
	}		

}
