package DicePoker;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
//Declare variables
		int startBalance = 6, betCost = 1, betTotal = 5,betAmount = 1, placeBet = 1;
		int betCount = 0;
		int bankBalance, rollOne, rollTwo, winnings;
		String balanceString;
		String playerName;
		
		
		String rollResults, output;
		
		Player p1 = new Player();
		

//		dice.roll();
//		dice.checkSequential();
//		dice.checkEqual();
//        System.out.println("");
//        dice.checkRollResult();

				
		
		
//		
    	playerName = JOptionPane.showInputDialog("What is your name?");
//
		p1.setName(playerName);
		p1.setBankBalance(startBalance);
//		
//		bankBalance=startBalance;
	
		
		while (betCount != 5) {
//			p1.printDetails();
			balanceString = p1.playerBalanceString();
			balanceString = balanceString + "\nWould you like to place a bet of $1?";
//			
			//JOptionP
			placeBet = JOptionPane.showConfirmDialog (null, "Would you like to place a bet for $1","Place Bet", placeBet);
					rollDice();
//		
//		if (rollOne == rollTwo) {
//			winnings = betAmount *3;
//			p1.setBankBalance(bankBalance + winnings);
//			output = "You won!!! \nYou earn tripple your bet";
//			JOptionPane.showMessageDialog(null,output);
//		}
//		else {
//			if (rollOne - rollTwo == 1|| rollTwo - rollOne == 1) {
//				winnings = betAmount *2;
//				p1.setBankBalance(bankBalance + winnings);
//				output = "You won!!! \nYou earn double your bet";
//				JOptionPane.showMessageDialog(null,output);
//			}
//			else {
//			output = "You Loose!!!";
//			p1.setBankBalance(bankBalance -1);
//			JOptionPane.showMessageDialog(null,output);
//			}
//		}
//		++betCount;
		}
//
//		JOptionPane.showMessageDialog(null,showBalance(bankBalance));
//
//		
//		
		

	}
	public static void rollDice() {
		Dice dice = new Dice();
		
		dice.roll();
		dice.checkRollResult();
	String rollResults = dice.readDice();
	JOptionPane.showMessageDialog(null,rollResults);

	}
	public static String showBalance(int bankBalance) {
		String balanceMessage = "Your Bank balance is $"+ bankBalance;
		return balanceMessage;
				
	}
	
	
		
	}
	
	

