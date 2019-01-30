import javax.swing.JOptionPane;

public class fracTester {

	public static void main(String[] args) {
		
		fraction myFraction = new fraction(JOptionPane.showInputDialog("Input your first Fraction"),JOptionPane.showInputDialog("Input your second Fraction"));	
		JOptionPane.showMessageDialog(null, "The total is:"+ "\n" + myFraction.setTotal());

	}

}
