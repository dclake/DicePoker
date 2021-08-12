package DicePoker;

import javax.swing.JOptionPane;

public class Player {

	private String name;
	private int winnings;
	private int bankBalance;
	
	
	public Player() {
		String output = "The constructor is being called";
		JOptionPane.showMessageDialog(null, output);
	}
	public String toString() {
		String output;
		
		output = "Hey " +this.name;
		output = output + ", your bank balance is   $" +this.bankBalance + ".";
		output = output + "\nIn this round you won $" +this.winnings +".";
	
		return output;
	}//end toString
	
	
	public void printDetails() {
		String output;
		
		output = toString();
		
		JOptionPane.showMessageDialog(null, output);
	}//end printDetails
	
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

