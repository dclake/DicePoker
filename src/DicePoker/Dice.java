package DicePoker;

public class Dice {
	private int numberOfDice =2;
	private int counter =0;
	private int[] diceResults = new int[numberOfDice];
	private String dieReading;
	private String rollResult;
	
	private String output;
	private int winnings;

	
	static Die die1 = new Die();
	
	

	public int[] roll() {
		while (counter < diceResults.length){
			diceResults[counter] = die1.roll();
			counter++;
		}
		return diceResults;
    }
	
	public String readDice() {
		dieReading ="";
		for(int counter =0; counter < diceResults.length; counter++) {
			dieReading =dieReading + "Die "+ (counter + 1) + ": " +diceResults[counter] +"   ";
		}	
		return dieReading;
		}

    public boolean checkSequential() {
        boolean result = true;
        for (int i = 0; i < diceResults.length - 1; i++) {
            if (((diceResults[i + 1] - diceResults[i]) == 1) ||((diceResults[i + 1] - diceResults[i]) == -1))   {
            } else {
                result = false;
                break;
            }
        }
		return result;
    }
    public boolean checkEqual() {
        boolean result = true;
        for (int i = 0; i < diceResults.length - 1; i++) {
            if ((diceResults[i + 1] == diceResults[i])) {
            } else {
                result = false;
                break;
            }
        }
		return result;
    }
    
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
    public String checkRollResult() {
    	if(checkSequential() == true) {
    		setRollResult("sequential");
    		output = "The numbers are sequential. You win double your bet!";
    	
    	}
    	else if (checkEqual()==true) {
    		setRollResult("equal");
    		output = "The numbers are identical. You win triple your bet!";
    	}
    	else {
    		setRollResult("nothing");
    		output = "No winning patterns. You lost your bet";
    	}
    	return output;
    }

	public String getRollResult() {
		return rollResult;
	}

	public void setRollResult(String rollResult) {
		this.rollResult = rollResult;
	}

}
