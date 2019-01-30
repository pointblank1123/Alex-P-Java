import javax.swing.JOptionPane;

//import java.util.Scanner;
public class Circle {
	private double radius;
	private double circ;
	private double area;
	
	//Scanner keyboard= new Scanner(System.in);
	
	public void getRadius() {
		boolean r=true;
		while (r) {
			try {
				radius= Double.parseDouble(JOptionPane.showInputDialog("Input Radius: "));
				r=false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
					
		}
		//System.out.println("Enter the Radius: ");
		//radius=keyboard.nextDouble();
	}
	public void calcCirc(){
		circ = 2*radius*Math.PI ;
		//System.out.println("The circumference is: " + circ);
		JOptionPane.showMessageDialog(null, "The circumference is: "+circ);
	}
	public void calcCArea() {
		area =  Math.pow(radius,2)*Math.PI;
		//System.out.println("The Area is: "+area);
		JOptionPane.showMessageDialog(null, "The area is: "+area);
	}
}
