package DicePoker;

public class Die {
	private static int face = 1;
	
	
	public int getFace() {
		return face;
	}
	
	public static int roll() {
		face = (int)(Math.random()*6);
		face = face++;
//		JOptionPane.showMessageDialog(null,rollOne);
		return face;
	}

}
