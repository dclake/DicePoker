package DicePoker;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
//Declare variables
		int startBalance = 6, betCost = 1, betTotal = 5,betAmount = 1, placeBet = 1;
		int betCount = 0;
		int bankBalance, rollOne, rollTwo, winnings;
		String balanceString;
		
		
		String rollResults, output;
		
		Die die1 = new Die();
		Die die2 = new Die();
				
		
		
		bankBalance=startBalance;

		
		
		while (betCount != 5) {
			balanceString = showBalance(bankBalance);
			balanceString = balanceString + "\n Would you like to place a bet of $1?";
			
			//JOptionP
//			placeBet = JOptionPane.showConfirmDialog (null, "Would you like to place a bet for $1","Place Bet", placeBet);
//			if(placeBet == JOptionPane.YES_OPTION) { 
//			    betAmount = 1;
//			        if(placeBet == JOptionPane.NO_OPTION) {
//			         
//			        }
//			}
//			JOptionPane.showMessageDialog(null, betAmount);
			JOptionPane.showConfirmDialog(null, balanceString, "Please Answer", JOptionPane.YES_NO_OPTION);
			
		rollOne = die1.roll();
		rollTwo = die2.roll();
		
				
		rollResults = "Die One: " + rollOne + "\nDie Two: " + rollTwo;
		
		JOptionPane.showMessageDialog(null,rollResults);
		
		if (rollOne == rollTwo) {
			winnings = betAmount *3;
			bankBalance = bankBalance + winnings;
			output = "You won!!! \nYou earn tripple your bet";
			JOptionPane.showMessageDialog(null,output);
		}
		else {
			if (rollOne - rollTwo == 1|| rollTwo - rollOne == 1) {
				winnings = betAmount *2;
				bankBalance = bankBalance + winnings;
				output = "You won!!! \nYou earn double your bet";
				JOptionPane.showMessageDialog(null,output);
			}
			else {
			output = "You Loose!!!";
			bankBalance = bankBalance -1;
			JOptionPane.showMessageDialog(null,output);
			}
		}
		++betCount;
		}

		JOptionPane.showMessageDialog(null,showBalance(bankBalance));

		
//		
		

	}
	public static String showBalance(int bankBalance) {
		String balanceMessage = "Your Bank balance is $"+ bankBalance;
		return balanceMessage;
				
	}
	
	
		
	}
	
	

