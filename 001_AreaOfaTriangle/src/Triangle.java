//import java.util.Scanner;

import javax.swing.JOptionPane;
public class Triangle {
	// Class Variables
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
	
	//Scanner keyboard= new Scanner(System.in); 
	
	// Constructor
	public Triangle() {

	}
	// Methods
	public void setVarsToZero() {
		sideA=0.0;
		sideB=0.0;
		sideC=0.0;
		perimeter=0.0;
		theArea=0.0;
	}
	public void setSides() {
		boolean a=true;
		while(a){
			try {
				sideA =Double.parseDouble(JOptionPane.showInputDialog("Enter Side A: "));
				a= false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		//System.out.println("Enter Side A: ");
		//sideA = keyboard.nextDouble();
		boolean b=true;
		while(b) {
			try {
				sideB =Double.parseDouble(JOptionPane.showInputDialog("Enter Side B: "));
				b=false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
		//System.out.println("Enter Side B: ");
		//sideB = keyboard.nextDouble();
		boolean c=true;
		while(c) {
			try {
				sideC =Double.parseDouble(JOptionPane.showInputDialog("Enter Side C: "));
				c=false;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Please enter a Number");
			}
		}
		//System.out.println("Enter Side C: ");
		//sideC = keyboard.nextDouble();
	}
	public void calcPerimeter() {
		perimeter=sideA+sideB+sideC;
		
	}
	public void calcArea() {
		double p=0.0;
		p=perimeter/2;
		theArea=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
	}
	
	public void calcAngles() {
		double cosC=0.0;
		double cosB=0.0;
		double cosA=0.0;
		double angleA;
		double angleB;
		double angleC;
		
		cosA=(Math.pow(sideB, 2.0)+Math.pow(sideC, 2)-Math.pow(sideA, 2))/(2*sideB*sideC);
		angleA=Math.toDegrees(Math.acos(cosA));
		cosB=(Math.pow(sideA, 2.0)+Math.pow(sideC, 2)-Math.pow(sideB, 2))/(2*sideA*sideC);
		angleB=Math.toDegrees(Math.acos(cosB));
		cosC=(Math.pow(sideA, 2.0)+Math.pow(sideB, 2)-Math.pow(sideC, 2))/(2*sideA*sideB);
		angleC=Math.toDegrees(Math.acos(cosC));
		//two options:
		//Math.toDegrees
		//180/Math.PI
		String Angles="Angle A, B, C="+angleA+", "+angleB+", "+angleC;
		JOptionPane.showMessageDialog(null, Angles);

		//System.out.println("Angle A= "+ angleA);
		//System.out.println("Angle B= "+ angleB);
		//System.out.println("Angle C= "+ angleC);
	}
	public void showVars() {
		//System.out.println("Side A =" + sideA);
		//System.out.println("Side B =" + sideB);
		//System.out.println("Side C =" + sideC);
		//System.out.println("The perimeter=" + perimeter);
		//System.out.println("The area="+theArea);
		String Sidemsg="Side A, B, C = "+sideA+", "+sideB+", "+sideC;
		String Per="Perimeter: " +perimeter;
		String Area= "Area: " +theArea;
		
		if (theArea==0) {
			Area="This triangle is not possible";
		}
		
		JOptionPane.showMessageDialog(null, Sidemsg);
		JOptionPane.showMessageDialog(null, Per);
		JOptionPane.showMessageDialog(null, Area);


	}

}
