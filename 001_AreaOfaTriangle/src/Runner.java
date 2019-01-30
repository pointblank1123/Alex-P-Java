import javax.swing.JOptionPane;

//Alex Putman
//08-28-18

public class Runner {
	public static void main(String[] args) {
		String again="Y";
		//JOptionPane.showMessageDialog(null, "Java option pane test");
		
		//Instantiate - initialize or start:
		Triangle myTriangle= new Triangle();
		Rectangle myRectangle=  new Rectangle();
		Circle myCircle= new Circle();
		Sphere mySphere= new Sphere();
		Cuboid myCuboid= new Cuboid();
		
		JOptionPane.showMessageDialog(null, "Welcome to my calculator program. Alex P. A3 09-14-18");
		
		//do{
		while(again=="Y") {
	        String[] options = {"Triangle", "Rectangle", "Circle", "Cuboid", "Sphere"};

	        int x = JOptionPane.showOptionDialog(null, "Pick which option you want to use",
	                "Click a button",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	        System.out.println(x);
			//String msg = "Enter your selection: Triangle, Circle, or Rectangle";
			//JOptionPane.showMessageDialog(null,msg);
					
			//String msg1="Enter your choice";
			//String answer= JOptionPane.showInputDialog(msg1);
			
			//String class methods for string comparison 
			
			if(x==2) {//(answer.equals("Circle")||answer.equals("circle")) {
				myCircle.getRadius();
				myCircle.calcCirc();
				myCircle.calcCArea();
			}
			else if (x==1) {//(answer.equals("Rectangle")||answer.equals("rectangle")) {
				myRectangle.getRSides();
				myRectangle.calcRPer();
				myRectangle.calcRArea();
				myRectangle.calcDiagonal();
			}
			else if (x==0) {//(answer.equals("Triangle")||answer.equals("Triangle")) {
				myTriangle.setVarsToZero();
				myTriangle.setSides();
				myTriangle.calcPerimeter();
				myTriangle.calcArea();
				myTriangle.showVars();
				myTriangle.calcAngles();
			}
			else if (x==3) { //(answer.equals("Cuboid")||answer.equals("cuboid")) {
				myCuboid.getCubeSides();
				myCuboid.calcSArea();
				myCuboid.calcVol();
			}
			else if (x==4) {//{ (answer.equals("Sphere")||answer.equals("sphere")) {
				mySphere.getSRadius();
				mySphere.calcSArea();
				mySphere.calcVol();
			}
			else {
				JOptionPane.showMessageDialog(null, "That is not an option");
			}
			again = JOptionPane.showInputDialog("Do you want to go again (Y/N)");

			if (again.equals("y")||again.equals("Y")||again.equals("yes")||again.equals("Yes")) {
				again="Y";
			}
			else {
				again="N";
			}
		}//while(again=="Y");
	}
}
