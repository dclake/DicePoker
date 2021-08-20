package DicePoker;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Player {

	private String name;//Player's Name
	private int winnings; //Player's winnings at the end of each round/bet
	private int bankBalance; //Player's bank balance



	public Player() {
	}

	public Player(String name, int bankBalance) {
		setName(name);
		setBankBalance(bankBalance);
	}

	/**	Produces string for high scores
	 * @return bankBalance, name
	 */
	public String highScore() {
		return String.format("%-19s %-40s",
				bankBalance, name);

	}

	/**Produces a String with the player's bank balance.
	 * @return balanceString
	 */
	public String playerBalanceString() {
		String balanceString;

		balanceString = "Hey " +this.name;
		balanceString =  balanceString + ", your bank balance is £" +this.bankBalance + ".";
		return balanceString;
	}

	/** Allows the player to place a varying bet amount between a predefined minimum and maximum amount
	 * @return betAmount
	 */
	public int placeBet() {

		int counter;
		int search = 0;
		int arrayStart;
		int minBet = 1, maxBet = 4;
		int [] betOptions = new int [maxBet+1];

		//Builds an array of possible bet options
		arrayStart = minBet-1;
		for (counter = 0; counter < maxBet+1; counter++) {
			betOptions[counter]=arrayStart;
			arrayStart ++;
		}
		int betAmount = 0;

		//Allows player to input data and verifies input
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

