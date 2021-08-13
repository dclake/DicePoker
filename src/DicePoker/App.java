package DicePoker;

import javax.swing.JOptionPane;

public class App {

	private static final int betCost = 1;
	public static void main(String[] args) {
		//Declare variables
		int startBalance = 6, betCost = 1, betTotal = 5,betAmount = 1, placeBet = 1;
		int betCount = 0;
		int bankBalance, rollOne, rollTwo, winnings;
		String balanceString;
		String playerName, resultString;
		
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
			
			winnings = rollDice(betCount);
			p1.setBankBalance(p1.getBankBalance()+ winnings);
			++betCount;
		}

		

	}
	public static int rollDice(int betCount) {
		Dice dice = new Dice();
		
		dice.roll();
		int winnings = dice.checkRollWin(betCost);
		String resultString = dice.checkRollResult()
				+ "\nWinnings are $" + winnings;
		
		
	String rollResults = dice.readDice() + "\n" + resultString;
//	System.out.println(testString);

	
	JOptionPane.showMessageDialog(null,rollResults, "Bet # "+ (betCount +1), JOptionPane.INFORMATION_MESSAGE);
 return winnings;
	
	

	}
	public static String showBalance(int bankBalance) {
		String balanceMessage = "Your Bank balance is $"+ bankBalance;
		return balanceMessage;
				
	}
	
	
	
		
	}
	
	

