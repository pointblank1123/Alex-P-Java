import javax.swing.JOptionPane;

//import java.util.Scanner;

public class Rectangle {
	private double side1;
	private double side2;
	private double area;
	private double per;
	private double diag;
	
	//Scanner keyboard= new Scanner(System.in);
	

	public void getRSides(){
		boolean s1=true;
		while(s1) {
			try {
				side1= Double.parseDouble(JOptionPane.showInputDialog("Input Side 1: "));
				s1=false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		//System.out.println("Input Side 1: ");
		//side1=keyboard.nextDouble();
		s1=true;
		while (s1) {
			try {
			side2= Double.parseDouble(JOptionPane.showInputDialog("Input Side 2: "));
			s1=false;
			}catch(Exception e ) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		//System.out.println("Input Side 2: ");
		//side2=keyboard.nextDouble();
	}
	public void calcRPer() {
		per=side1*2+side2*2;
		//System.out.println("The perimeter is: " +per );
		JOptionPane.showMessageDialog(null, "The perimeter is: "+per);
	}
	public void calcRArea() {
		area = side1*side2;
		//System.out.println("The Area is: "+area);
		JOptionPane.showMessageDialog(null, "The area is: "+area);
	}
	public void calcDiagonal() {
		diag= Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
		JOptionPane.showMessageDialog(null, "This rectangles diagonal is: "+ diag);
	}
}
