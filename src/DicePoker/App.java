package DicePoker;

import javax.swing.JOptionPane;

public class App {

	private static final int betCost = 1;
	public static void main(String[] args) {
		//Declare variables
		int startBalance = 6, betCost = 1, betTotal = 5,betAmount = 1, placeBet = 1;
		int betCount = 0 ,totalBets =5;
		int bankBalance, rollOne, rollTwo, winnings;
		String balanceString;
		String playerName, resultString;
		
		String rollResults, output, resultOutput = "";
		
		Player p1 = new Player();
		
		int [] winningsTally = new int[totalBets];
		String [] roundResults = new String [5];
		
		



				
		
		
//		
    	playerName = JOptionPane.showInputDialog("What is your name?");
//
		p1.setName(playerName);
		p1.setBankBalance(startBalance);
//		
//		bankBalance=startBalance;
	
		
		while (betCount != 5) {
//			p1.printDetails();
			Dice dice = new Dice();
			dice.roll();


			balanceString = p1.playerBalanceString();
			balanceString = balanceString + "\nWould you like to place a bet of $1?";
//			
			placeBet = JOptionPane.showConfirmDialog (null, balanceString,"Place Bet", placeBet);
			
			winnings = dice.checkRollWin(betCost);
			String resultString1 = dice.checkRollResult()
					+ "\nWinnings are $" + winnings;
			
			String rollResults1 = dice.readDice() + "\n" + resultString1;
			JOptionPane.showMessageDialog(null,rollResults1, "Bet # "+ (betCount +1), JOptionPane.INFORMATION_MESSAGE);


//			winnings = rollDice(betCount);
			winningsTally[betCount] = winnings;
			p1.setBankBalance(p1.getBankBalance()+ winnings);
			++betCount;
		}

		for(int counter =0; counter < winningsTally.length; counter++) {
			resultOutput = resultOutput + "Bet # "+ (counter + 1) + ": " +winningsTally[counter] +"\n";
			System.out.println(resultOutput);
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
	
	

