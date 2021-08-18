package DicePoker;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Player {

	private String name;
	private int winnings;
	private int bankBalance;




	public Player() {
	}
	
	public Player(String name, int bankBalance) {
		setName(name);
		setBankBalance(bankBalance);
	}
	
	public String highScore() {
		return String.format("%-19s %-40s",
                bankBalance, name);
		
	}

	public String playerBalanceString() {
		String output;

		output = "Hey " +this.name;
		output = output + ", your bank balance is $" +this.bankBalance + ".";
		return output;
	}//end toString


	public String printDetails() {
		String output;

		output = toString();

		JOptionPane.showMessageDialog(null, output);
		return output;
	}//end printDetails

	public int placeBet() {
		int counter;
		int search = 0;
		int arrayStart;
		int minBet = 1, maxBet = 4;
		int [] betOptions = new int [maxBet+1];
		
		arrayStart = minBet-1;
		for (counter = 0; counter < maxBet+1; counter++) {
			betOptions[counter]=arrayStart;
			arrayStart ++;
		}
		int betAmount = 0;
		while (search <= 0){
			String betString = JOptionPane.showInputDialog("How much would you like to bet?\n"
					+ "Please select an amount between " + minBet + " and " + maxBet);
			try {
				betAmount = Integer.parseInt(betString);
				search = Arrays.binarySearch(betOptions, betAmount);
				if(search <= 0) {
					String invalidMessage = "Invalid Entry!!! \n"+ betString +" is not a number between "+minBet +" and " + maxBet +".";
					JOptionPane.showMessageDialog(null, invalidMessage,"Invalid Entry !!!", JOptionPane.ERROR_MESSAGE);
				}
				else {
					if (betAmount > bankBalance) {
						String invalidMessage = "Sorry, you cannot bet"+ betString +". Bet amount is larger than bank balance of "+ bankBalance;
						JOptionPane.showMessageDialog(null, invalidMessage,"Invalid Entry !!!", JOptionPane.ERROR_MESSAGE);
						
					}
				}
			}
			catch (NumberFormatException e) { 
				String invalidMessage = "Invalid Entry!!! \n"+ betString +" is not a number between "+minBet +" and " + maxBet +".";
				JOptionPane.showMessageDialog(null, invalidMessage,"Invalid Entry !!!", JOptionPane.ERROR_MESSAGE);
				search = 0;
			}
		}
		return betAmount;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWinnings() {
		return winnings;
	}
	public void setWinnings(int winnings) {
		this.winnings = winnings;
	}
	public int getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(int bankBalance) {
		this.bankBalance = bankBalance;
	}

}

