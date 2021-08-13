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
			System.out.println(diceResults[counter]);
			counter++;
		}
		return diceResults;
    }
	
	public String readDice() {
		dieReading ="";
		for(int counter =0; counter < diceResults.length; counter++) {
			dieReading = dieReading + "Die "+ (counter + 1) + ": " +diceResults[counter] +"\n";
			System.out.println(dieReading);


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
        if(result)
            System.out.println("True");
        else
            System.out.println("False");
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
        if(result)
            System.out.println("True");
        else
            System.out.println("False");
		return result;
    }
    
    public int checkRollWin(int betAmount) {
    	if(checkSequential() == true) {
    		rollResult = "sequential";    	
    		winnings = betAmount *2; 
    	}
    	else if (checkEqual()==true) {
    		rollResult = "equal";
    		winnings = betAmount * 3;
    	}
    	else {
    		rollResult = "nothing";
    		winnings = -betAmount;
    	}
    	System.out.println(rollResult);
    	System.out.println(winnings);
    	return winnings;
    }
    public String checkRollResult() {
    	if(checkSequential() == true) {
    		rollResult = "sequential";
    		output = "The numbers are sequential. You win double your bet!";
    	
    	}
    	else if (checkEqual()==true) {
    		rollResult = "equal";
    		output = "The numbers are identical. You win triple your bet!";
    	}
    	else {
    		rollResult = "nothing";
    		output = "No winning patterns. You lost your bet";
    	}
    	System.out.println(output);
    	return output;
    }

}
