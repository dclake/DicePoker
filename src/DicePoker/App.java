package DicePoker;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		//Declare variables
		int startBalance = 6, betCost = 1, betAmount, placeBet = 1;
		//		int minBet = 1, maxBet = 4;
		//		int [] betOptions = new int [maxBet];
		int betCount = 0;
		int winnings;
		String balanceString;
		String playerName;
		String betString;

		String rollResults ="", resultOutput = "";
		String numbersRolled;

		int counter;
		int search = 0;
		int arrayStart;

		String invalidMessage;

		Player p1 = new Player();

		//		arrayStart = minBet-1;
		//		for (counter = 0; counter < maxBet; counter++) {
		//			betOptions[counter]=arrayStart;
		//			arrayStart ++;
		//		}







		playerName = JOptionPane.showInputDialog("What is your name?");

		p1.setName(playerName);
		p1.setBankBalance(startBalance);
		ArrayList<Results> playerResult = new ArrayList<Results>();


		while ((betCount != 5) && (p1.getBankBalance() > 0)) {
			Dice dice = new Dice();
			dice.roll();


			balanceString = p1.playerBalanceString();
			balanceString = balanceString + "\nWould you like to place a bet?";


			placeBet = JOptionPane.showConfirmDialog (null, balanceString,"Place Bet", placeBet);

			betAmount = p1.placeBet();
			
			winnings = dice.checkRollWin(betAmount);
			String resultString1 = dice.checkRollResult()
					+ "\nWinnings are $" + winnings;


			numbersRolled = dice.readDice();
			rollResults = numbersRolled + "\n" + resultString1;
			JOptionPane.showMessageDialog(null,rollResults, "Bet # "+ (betCount +1), JOptionPane.INFORMATION_MESSAGE);
			System.out.println(betAmount);


			p1.setBankBalance(p1.getBankBalance()+ winnings);
			playerResult.add(new Results(betCount+1, betAmount, numbersRolled, winnings));
			++betCount;
		}

		for(Results game : playerResult) {
			resultOutput = resultOutput + game.toString() + "\n";

		}	
		resultOutput = resultOutput + "\n"
				+ "Bank Balance: $ "+ p1.getBankBalance();
		JOptionPane.showMessageDialog(null,resultOutput, "Game Results", JOptionPane.INFORMATION_MESSAGE);
	}





}



