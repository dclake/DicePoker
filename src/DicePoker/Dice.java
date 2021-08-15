package DicePoker;

public class Dice {
	private int numberOfDice =2;
	private int counter =0;
	
	
	private int[] diceResults = new int[numberOfDice];
	private String diceReading;
	private String rollResult;
	private String winMessage;
	private int winnings;




	static Die die1 = new Die();

	
	/**Rolls multiple dice using the numberOfDice variable and storing results as an array
	 * @return diceResults
	 */
	public int[] roll() {
		while (counter < diceResults.length){
			diceResults[counter] = die1.roll();
			counter++;
		}
		return diceResults;
	}

	/**Reads the value of multiple dice by looping through the diceResults array and presents reading as a formatted String
	 * @return diceReading
	 */
	public String readDice() {
		diceReading ="";
		for(counter =0; counter < diceResults.length; counter++) {
			diceReading =diceReading + "Die "+ (counter + 1) + ": " +diceResults[counter] +"   ";
		}	
		return diceReading;
	}
	 
	/**Checks if values from readDice method are sequential
	 * @return boolean
	 */
	public boolean checkSequential() {
		boolean result = true;
		for (counter = 0; counter < diceResults.length - 1; counter++) {
			if (((diceResults[counter + 1] - diceResults[counter]) == 1) ||((diceResults[counter + 1] - diceResults[counter]) == -1))   {
			} else {
				result = false;
				break;
			}
		}
		return result;
	}
	 
	/**Checks if values from readDice method are equal/identical
	 * @return boolean
	 */
	public boolean checkEqual() {
		boolean result = true;
		for (int counter = 0; counter < diceResults.length - 1; counter++) {
			if ((diceResults[counter + 1] == diceResults[counter])) {
			} else {
				result = false;
				break;
			}
		}
		return result;
	}
	
	
	/**Calculates the players winnings for the dice roll
	 * @param betAmount
	 * @return winnings
	 */
	public int checkRollWin(int betAmount) {
		if(checkSequential() == true) {
			setRollResult("sequential");    	
			winnings = betAmount *2; 
		}
		else if (checkEqual()==true) {
			setRollResult("equal");
			winnings = betAmount * 3;
		}
		else {
			setRollResult("nothing");
			winnings = -betAmount;
		}
		return winnings;
	}
	
	/**Checks the results of the Dice roll and presents the appropriate text
	 * @return winMessage
	 */
	public String checkRollResult() {
		if(checkSequential() == true) {
			setRollResult("sequential");
			winMessage = "The numbers are sequential. You win double your bet!";

		}
		else if (checkEqual()==true) {
			setRollResult("equal");
			winMessage = "The numbers are identical. You win triple your bet!";
		}
		else {
			setRollResult("nothing");
			winMessage = "No winning patterns. You lost your bet";
		}
		return winMessage;
	}

	/**Get's the result of Dice roll
	 * @return rollResult
	 */
	public String getRollResult() {
		return rollResult;
	}

	/**Sets the result of Dice Roll
	 * @param rollResult
	 */
	public void setRollResult(String rollResult) {
		this.rollResult = rollResult;
	}

}
