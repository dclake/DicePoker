package DicePoker;

public class Die {
	private int dieValue;
	private static int smallestDieSide = 1, numberOfSides = 6;
	
	public Die() {
		this.dieValue = 1;
	}
	
	public int setDieValue(int dieValue) {
		return dieValue;
	}
	
	public int roll() {
		dieValue = (int)(Math.random()* numberOfSides)+ smallestDieSide;
		return dieValue;
	}
	
}
