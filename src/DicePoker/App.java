package DicePoker;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
//Declare variables
		int startBalance = 6, betCost = 1, betTotal = 5;
		int bankBalance, betAmount = 0, placeBet = 1;
		
		String betAsString;
		
		
		bankBalance=startBalance;
		JOptionPane.showMessageDialog(null,showBalance(bankBalance));
		
		placeBet = JOptionPane.showConfirmDialog (null, "Would you like to place a bet for $1","Place Bet", placeBet);
		if(placeBet == JOptionPane.YES_OPTION) { 
		    betAmount = 1;
		        if(placeBet == JOptionPane.NO_OPTION) {
		         
		        }
		}
		JOptionPane.showMessageDialog(null, betAmount);
		

	}
	public static String showBalance(int bankBalance) {
		String balanceMessage = "Your Bank balance is $"+ bankBalance;
		return balanceMessage;
				
	}

}
