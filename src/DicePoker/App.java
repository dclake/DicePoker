package DicePoker;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
//Declare variables
		int startBalance = 6, betCost = 1, betTotal = 5,betAmount = 1, placeBet = 1;
		int bankBalance, rollOne, rollTwo, winnings;
		int []dieOptions = {1,2,3,4,5,6};
		
		
		String rollResults, output;
		
		Die die1 = new Die();
		Die die2 = new Die();
				
		rollOne = die1.roll();
		rollTwo = die2.roll();
				
		
		
		
		bankBalance=startBalance;
		JOptionPane.showMessageDialog(null,showBalance(bankBalance));
		
		
//		rollOne = diceRoll(dieOptions);
//		rollTwo = diceRoll(dieOptions);
		
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
			bankBalance = bankBalance + betAmount;
			output = "You Loose!!!";
			JOptionPane.showMessageDialog(null,output);
			}
		}




		
//		placeBet = JOptionPane.showConfirmDialog (null, "Would you like to place a bet for $1","Place Bet", placeBet);
//		if(placeBet == JOptionPane.YES_OPTION) { 
//		    betAmount = 1;
//		        if(placeBet == JOptionPane.NO_OPTION) {
//		         
//		        }
//		}
//		JOptionPane.showMessageDialog(null, betAmount);
		

	}
	public static String showBalance(int bankBalance) {
		String balanceMessage = "Your Bank balance is $"+ bankBalance;
		return balanceMessage;
				
	}
	
	public static int diceRoll(int [] die) {
		int roll = die[(int) (Math.random()*die.length)];
//		JOptionPane.showMessageDialog(null,rollOne);
		return roll;
		
	}
	
	

}
