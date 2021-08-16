package DicePoker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		//Declare variables
		int startBalance = 6, betAmount, placeBet = 1;
		int betCount = 0;
		int winnings;
		int newGame = 0;
		String balanceString;
		String playerName;
		//		String betString;

		String rollResults ="", resultOutput = "";
		String numbersRolled;
		String newGameText;
		String output;


		Player p1 = new Player();
		ArrayList<Player> player = new ArrayList<Player>();

		newGameText = "Welcome to Dice Poker.\n"
				+ "Would you like to play a new game?";
		while (true) {

			if (JOptionPane.showConfirmDialog(null, newGameText, "New Game",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

				playerName = JOptionPane.showInputDialog("What is your name?");

				p1.setName(playerName);
				p1.setBankBalance(startBalance);
				ArrayList<Results> playerResult = new ArrayList<Results>();


				while ((betCount != 5) && (p1.getBankBalance() > 0)) {
					Dice dice = new Dice();
					dice.roll();

					balanceString = p1.playerBalanceString();
					balanceString = balanceString + "\nWould you like to place a bet?";
					

					if (JOptionPane.showConfirmDialog(null, balanceString, "Place Bet",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

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
					else{
						break;}
					}
				betCount =0;

				for(Results game : playerResult) {
					resultOutput = resultOutput + game.toString() + "\n";

				}	
				int bankBalance = p1.getBankBalance();
				resultOutput = resultOutput + "\n"
						+ "Bank Balance: $ "+ bankBalance;
				JOptionPane.showMessageDialog(null,resultOutput, "Game Results", JOptionPane.INFORMATION_MESSAGE);

				player.add(new Player(playerName, bankBalance));


				output = "NewGame";

			} else {
				String byeMessage = "We're sorry to see you go so soon.\n"
						+ "Bye!!!";
				JOptionPane.showMessageDialog(null,byeMessage, "Exit", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);


			}
			String [] highScores = new String[player.size()];




			resultOutput= "";
			int counter = 0;
			for(Player game : player) {
				resultOutput = game.highScore();
				highScores[counter] = resultOutput;
				counter ++;	
			}	

			Arrays.sort(highScores);
			output = "";
			for(int loop = 0; loop < highScores.length; loop++) {
				output = output + highScores[loop] +"\n ";
			}



			JOptionPane.showMessageDialog(null,output, "High Score", JOptionPane.INFORMATION_MESSAGE);


		}



	}

}









