package DicePoker;

public class Dice {
	private int numberOfDice =2;
	private int counter =0;
	private int[] diceResults = new int[numberOfDice];
	private String rollResult;
	private String output;

	
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
		output = "";
		for(int counter =0; counter < diceResults.length; counter++) {
			output = output + diceResults[counter] +" ";
			System.out.println(output);


		}	
		return output;
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
    
    public void checkRollResult() {
    	if(checkSequential() == true) {
    		rollResult = "sequential";
    	}
    	else if (checkEqual()==true) {
    		rollResult = "equal";
    	}
    	else {
    		rollResult = "nothing";
    	}
    	System.out.println(rollResult);
    }

}
