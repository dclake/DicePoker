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
			placeBet = JOptionPane.showConfirmDialog (null, balanceString,"Place Bet", placeBet);
			
			winnings = rollDice();
			p1.setBankBalance(p1.getBankBalance()+ winnings);
		}

		

	}
	public static int rollDice() {
		Dice dice = new Dice();
		
		dice.roll();
		dice.checkRollResult();
	String rollResults = dice.readDice();
	JOptionPane.showMessageDialog(null,rollResults);
	int winnings = 1;
	return winnings;
	
	

	}
	public static String showBalance(int bankBalance) {
		String balanceMessage = "Your Bank balance is $"+ bankBalance;
		return balanceMessage;
				
	}
	
	
		
	}
	
	

