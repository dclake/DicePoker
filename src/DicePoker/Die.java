package DicePoker;

public class Die {
	private int dieValue;
	private static int smallestDieSide = 1, numberOfSides = 6;

	public Die() {
		this.dieValue = 1;
	}

	//Method for rolling a die - Uses a random value of between the number of sides
	public int roll() {
		dieValue = (int)(Math.random()* numberOfSides)+ smallestDieSide;
		return dieValue;
	}

}
