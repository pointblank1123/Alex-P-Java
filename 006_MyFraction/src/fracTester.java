import javax.swing.JOptionPane;

public class fracTester {

	public static void main(String[] args) {
<<<<<<< HEAD
		
		fraction myFraction = new fraction(JOptionPane.showInputDialog("Input your first Fraction"),JOptionPane.showInputDialog("Input your second Fraction"));	
		JOptionPane.showMessageDialog(null, "The total is:"+ "\n" + myFraction.setTotal());

	}

=======
		boolean replay = true;

		while(replay==true) {
			fraction myFraction = new fraction(JOptionPane.showInputDialog("Input your first Fraction"),JOptionPane.showInputDialog("Input your second Fraction"));	
			JOptionPane.showMessageDialog(null, "The total is:"+ "\n" + myFraction.setTotal());
			if((JOptionPane.showConfirmDialog(null,"Do you want to go again", "Again?", JOptionPane.YES_NO_OPTION))==JOptionPane.YES_OPTION) {
				replay = true;
			}
			else {
				replay = false;
			}
		}	
	}
>>>>>>> edc8e4e9d0b66c092e5349a1b635113549050039
}
