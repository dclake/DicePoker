package DicePoker;

import javax.swing.JOptionPane;

public class Results {
	private int betNumber;
	private int betAmount;
	private String numbersRolled;
	private int winnings;
	
	
	public Results(){
		
	}
	
	public Results(int betNumber, int betAmount, String numbersRolled, int winnings) {
		setBetNumber(betNumber);
		setBetAmount(betAmount);
		setNumbersRolled(numbersRolled);
		setWinnings(winnings);
	}
	public String toString() {
		String output = "";
		output = output + "Bet # " + betNumber; 
		output = output	+ "  Bet Amount: " + betAmount;
		output = output + "  Numbers Rolled: "+ numbersRolled;
		output = output + " Winnings: " + winnings;
		
	
		return output;
	}
	public void printDetails() {
		String output;
		
		output = toString();
		
		JOptionPane.showMessageDialog(null, output);
	}
	
	public int getBetAmount() {
		return betAmount;
	}
	public void setBetAmount(int betAmount) {
		this.betAmount = betAmount;
	}
	public String getNumbersRolled() {
		return numbersRolled;
	}
	public void setNumbersRolled(String numbersRolled) {
		this.numbersRolled = numbersRolled;
	}
	public int getWinnings() {
		return winnings;
	}
	public void setWinnings(int winnings) {
		this.winnings = winnings;
	}

	public int getBetNumber() {
		return betNumber;
	}

	public void setBetNumber(int betNumber) {
		this.betNumber = betNumber;
	}
	
	
	

}
