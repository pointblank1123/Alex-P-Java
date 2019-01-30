import javax.swing.JOptionPane;

public class Cuboid {
	private double sideA;
	private double sideB;
	private double sideC;
	private double volume;
	private double surArea;
	
	public void getCubeSides() {
		boolean s=true;
		while(s) {
			try {
				sideA = Double.parseDouble(JOptionPane.showInputDialog("Input Side A: "));
				s=false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		s=true;
		while(s) {
			try {
				sideB = Double.parseDouble(JOptionPane.showInputDialog("Input Side B: "));
				s=false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		s=true;
		while(s) {
			try {
				sideC = Double.parseDouble(JOptionPane.showInputDialog("Input side C:" ));
				s=false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
	}
	public void calcVol() {
		volume=sideA*sideB*sideC;
		JOptionPane.showMessageDialog(null, "The volume of your cuboid is: "+ volume);
	}
	public void calcSArea() {
		surArea= (2*(sideA*sideB))+(2*(sideB*sideC))+(2*(sideA*sideC));
		JOptionPane.showMessageDialog(null, "The surface area of your cuboid is: "+ surArea);
		
	}
}
