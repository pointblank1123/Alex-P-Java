package mousedraw;

import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MouseDraw extends JFrame {
	
	Graphics2D g2D;
	
	public MouseDraw() {
		setTitle("Artistic Creations, Alex P");
		setResizable(false);
		setSize(600,400);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				exitForm(e);
			}
		});
		getContentPane().setLayout(new GridBagLayout());
		
	}// constructor end
	
	private void exitForm(WindowEvent e) {
		g2D.dispose();
		System.exit(0);
	} 
	
}// class end