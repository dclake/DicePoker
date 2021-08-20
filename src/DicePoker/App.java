package DicePoker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		//Declare variables
		int startBalance = 6; //Sets the starting Bank Balance
		int allowedBets = 5; //Sets the number of bets allowed
		int betCount = 0; //Counter used for bets
		int winnings, betAmount;
		String balanceString;
		String playerName;

		String rollResults ="", resultOutput = "";
		String numbersRolled;
		String newGameText;
		String parsedHighScore;


		ArrayList<Player> player = new ArrayList<Player>();//Create Array list for players which is used for high scores

		newGameText = "Welcome to Dice Poker.\n"
				+ "Would you like to play a new game?";
		while (true) {

			if (JOptionPane.showConfirmDialog(null, newGameText, "New Game",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

				playerName = JOptionPane.showInputDialog("What is your name?");
				Player p1 = new Player(); //create a new player object for use only within this loop


				p1.setName(playerName);
				p1.setBankBalance(startBalance);
				ArrayList<Results> playerResult = new ArrayList<Results>();
				
				//Allow player to place bet only while end if you run out of money, or you have no more attempts left (you made all five bets)
				while ((betCount != allowedBets) && (p1.getBankBalance() > 0)) {

					balanceString = p1.playerBalanceString();
					balanceString = balanceString + "\nWould you like to place a bet?";

					Dice dice = new Dice();//Create new Dice object

					if (JOptionPane.showConfirmDialog(null, balanceString, "Place Bet",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

						betAmount = p1.placeBet();
						
						dice.roll();
						
						//Code for obtaining and displaying winnings
						winnings = dice.checkRollWin(betAmount);
						String resultString1 = dice.checkRollResult()
								+ "\nWinnings are £" + winnings;
						
						//Code for displaying results of roll
						numbersRolled = dice.readDice();
						rollResults = numbersRolled + "\n" + resultString1;
						JOptionPane.showMessageDialog(null,rollResults, "Bet # "+ (betCount +1), JOptionPane.INFORMATION_MESSAGE);

						p1.setBankBalance(p1.getBankBalance()+ winnings);//Set player's new bank balance
						playerResult.add(new Results(betCount+1, betAmount, numbersRolled, winnings));//Create new result object in Reults Array list
						++betCount;
					}
					else{
						break;}
				}
				//Initialize variables
				betCount =0;
				resultOutput ="";
				
				//Parse contents of Results Array list to a string
				for(Results game : playerResult) {
					resultOutput = resultOutput + game.toString() + "\n";

				}
				//Display the results as well as ending bank balance
				int bankBalance = p1.getBankBalance();
				resultOutput = resultOutput + "\n"
						+ "Bank Balance: £ "+ bankBalance;
				JOptionPane.showMessageDialog(null,resultOutput, "Game Results", JOptionPane.INFORMATION_MESSAGE);
				
				//Create new Player Object for displaying High Scores
				player.add(new Player(playerName, bankBalance));
				
				//Code executed if "No" is selected for the New Game Option
			} else {
				String byeMessage = "We're sorry to see you go so soon.\n"
						+ "Bye!!!";
				JOptionPane.showMessageDialog(null,byeMessage, "Exit", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			
			//Create an Array for parsing contents of Player array list
			String [] highScores = new String[player.size()];
			resultOutput= "";
			int counter = 0;
			for(Player game : player) {
				resultOutput = game.highScore();
				highScores[counter] = resultOutput;
				counter ++;	
			}

			//Sort player information list and parsing as text
			Arrays.sort(highScores, Collections.reverseOrder());
			parsedHighScore = "";
			for(int loop = 0; loop < highScores.length; loop++) {
				parsedHighScore = parsedHighScore + highScores[loop] +"\n ";
			}

			//Create text for High Score Table display
			String highScoreString =  String.format("%12s %-40s", "Bank Balance", "Player Name")
					+ "\n" 
					+"-----------------------------" + "\n"
					+parsedHighScore;
			//Display High Score Table
			JOptionPane.showMessageDialog(null,highScoreString, "High Score", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}









