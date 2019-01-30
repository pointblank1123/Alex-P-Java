import javax.swing.JOptionPane;

public class Sphere {
	private double radius;
	private double sArea;
	private double vol;
	
	public void getSRadius() {
		boolean r=true;
		while(r) {
			try {
				radius = Double.parseDouble(JOptionPane.showInputDialog("Input Radius: "));
				r=false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		
	}
	public void calcSArea() {
		sArea=(4*Math.pow(radius, 2))*Math.PI;
		JOptionPane.showMessageDialog(null, "The surface area of your sphere is: "+ sArea);
	}
	public void calcVol() {
		double ratio=4.0/3.0;
		vol=ratio*Math.PI*Math.pow(radius, 3);
		JOptionPane.showMessageDialog(null, "The volume of your sphere is: "+ vol);
	}
	
}
