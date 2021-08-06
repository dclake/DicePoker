package DicePoker;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
//Declare variables
		int startBalance = 6, betCost = 1, betTotal = 5;
		int bankBalance;
		
		
		bankBalance=startBalance;
		JOptionPane.showMessageDialog(null,showBalance(bankBalance));
		


		//userChoicePennies = JOptionPane.showInputDialog("How ")
		

	}
	public static String showBalance(int bankBalance) {
		String balanceMessage = "Your Bank balance is $"+ bankBalance;
		return balanceMessage;
				
	}

}
