package DicePoker;

public class Dice {
	static int a =0;
	static int numberOfDice =2;
	static int counter;
	static int[] diceResults = new int[numberOfDice];
//	static int [] diceResults = new int [2];

	
	
	static Die die1 = new Die();
	Die die2 = new Die();
	
	
//	public static int [] roll() {
//		for (counter = 0; counter < numberOfDice; counter++) {
//			diceResults[counter]= die1.roll();;
//			System.out.println(diceResults[counter]);
//			counter ++;
//		
//	
//	}
//		return diceResults;}
	public static void roll() {
		while (counter < diceResults.length){
			diceResults[a] = die1.roll();
			System.out.println(diceResults[a]);
			counter++;
		}
    }
}
