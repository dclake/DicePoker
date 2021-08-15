package DicePoker;

import java.util.ArrayList;

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
		
		String rollResults, output, resultLine = "", resultOutput = "";
		
		Player p1 = new Player();
		
		int [] betNumber = new int [totalBets];
		int [] betPlaced = new int [totalBets];
		int [] winningsTally = new int[totalBets];
		String [] numbersRolled = new String [totalBets];
//		String [] roundResults = new String [5];
		
		



				
		
		
//		
    	playerName = JOptionPane.showInputDialog("What is your name?");
//
		p1.setName(playerName);
		p1.setBankBalance(startBalance);
		ArrayList<Results> playerResult = new ArrayList<Results>();
//		while(youWantToContinue) {
		    //get a customerName
		    //get an amount
		 
		//		bankBalance=startBalance;
	
		
		while (betCount != 5) {
			betNumber[betCount] = betCount +1;
//			p1.printDetails();

			Dice dice = new Dice();
			dice.roll();


			balanceString = p1.playerBalanceString();
			balanceString = balanceString + "\nWould you like to place a bet of $1?";
//			
			placeBet = JOptionPane.showConfirmDialog (null, balanceString,"Place Bet", placeBet);
			betPlaced [betCount] = betAmount;
					
			winnings = dice.checkRollWin(betCost);
			String resultString1 = dice.checkRollResult()
					+ "\nWinnings are $" + winnings;
			winningsTally[betCount] = winnings;

			
			numbersRolled[betCount] = dice.readDice();
			String rollResults1 = numbersRolled[betCount] + "\n" + resultString1;
			JOptionPane.showMessageDialog(null,rollResults1, "Bet # "+ (betCount +1), JOptionPane.INFORMATION_MESSAGE);


//			winnings = rollDice(betCount);
			p1.setBankBalance(p1.getBankBalance()+ winnings);
			playerResult.add(new Results(betCount+1, betAmount, rollResults1, winnings));
			++betCount;
		}

		for(int counter =0; counter < winningsTally.length; counter++) {
			resultLine = resultLine + "Bet # "+ (counter + 1) 
					+ "  Bet Amount: 1 "
					+ "  Numbers Rolled: "+ numbersRolled[counter]
					+ " Winnings: " + winningsTally[counter] +"\n";
//			System.out.println(resultOutput);
			
			
		}
		

		resultOutput = resultLine + "\n"
				+ "Bank Balance: $ "+ p1.getBankBalance();
		JOptionPane.showMessageDialog(null,resultOutput, "Game Results", JOptionPane.INFORMATION_MESSAGE);
		for(Results tempStudent : playerResult) {
			tempStudent.printDetails();
		}	


	}
		

	
	public static String showBalance(int bankBalance) {
		String balanceMessage = "Your Bank balance is $"+ bankBalance;
		return balanceMessage;
				
	}
	
	
	
		
	}
	
	

