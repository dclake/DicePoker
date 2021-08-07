package DicePoker;

public class Die {
	private static int dieValue;
	
	
	public int getDieValue() {
		return dieValue;
	}
	
	public static int roll() {
		dieValue = (int)(Math.random()*6)+1;
//		face = face++;
		return dieValue;
	}
	
}
