import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class OutWriteArrayList {
	
 public static void main(String[] args) {
	
	 File filename = new File("../TextFiles/Friends.txt");
	 // non standard method
	 ArrayList<String> aList = new ArrayList<String>();
	 // Standard method --> ArrayList<String>
	 String friend = " ";
	 
	 while (!friend.isEmpty()) {
		 friend = JOptionPane.showInputDialog("Enter a friend's name.");
		 if (!friend.isEmpty()) { // if(!friend.isEmpty()) aList.add(friend); this also works
			 aList.add(friend);
		 }
	 }
	 try {
		 FileWriter fw = new FileWriter(filename);
		 Writer output = new BufferedWriter(fw);
		 int sz = aList.size();
		 for (int i=0; i < sz; i++) {
			 output.write(aList.get(i).toString() + "\n");
		 }
		 output.close();
	 }
	 catch (Exception e) {
		 JOptionPane.showMessageDialog(null, "Cannot create that file " + e);
	 }
 }
}
