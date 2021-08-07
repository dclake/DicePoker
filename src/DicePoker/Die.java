package DicePoker;

public class Die {
	private static int dieValue;
	private static int smallestDieSide = 1, largestDieSide = 6;
	
	
	public static int roll() {
		dieValue = (int)(Math.random()* largestDieSide)+ smallestDieSide;
		return dieValue;
	}
	
}
