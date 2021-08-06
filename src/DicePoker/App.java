package DicePoker;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
//Declare variables
		int startBalance = 6, betCost = 1, betTotal = 5,betAmount = 0, placeBet = 1;
		int bankBalance, rollOne;
		int []dieOne = {1,2,3,4,5,6};
		
		String betAsString;
		
		
		bankBalance=startBalance;
		JOptionPane.showMessageDialog(null,showBalance(bankBalance));
		
//		rollOne = dieOne[(int) (Math.random()*6)];
//		JOptionPane.showMessageDialog(null,rollOne);
		
		JOptionPane.showMessageDialog(null,diceRoll(dieOne));
		JOptionPane.showMessageDialog(null,diceRoll(dieOne));
		JOptionPane.showMessageDialog(null,diceRoll(dieOne));





		
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
