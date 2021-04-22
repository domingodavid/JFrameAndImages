import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MainPanel extends JPanel implements ActionListener{
	
	//handles drawing animation
	Timer animationTimer; 
	ArrayList<Duck> myDucks1;
	Duck[] 			myDucks2;
	
	
	public void paint(Graphics g) {
		//calling this line ensures the frame is redrawn
		super.paintComponent(g);
		
		//call paint methods of objects or through g.drawRect etc
		for(int i =0; i < myDucks1.size(); i++) {
			myDucks1.get(i).paint(g);
		}
		
		for(int i =0; i < myDucks2.length; i++) {
			myDucks2[i].paint(g);
		}
		
		
	}
	
	/* constructor for MainPain class */
	public MainPanel() {
		
		//Create a JFrame Object with a title bar text
		JFrame f = new JFrame("Example Drawing");
		
		//Set the size of the window
		f.setSize(800,600); //width and height
		
		//set default action for x button
		//without this, your code will run behind the scenes until
		//you force exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add this panel to the JFrame
		//allows connection with "drawing"
		f.add(this);
		
		//setup animation timer
		animationTimer = new Timer(16, this);
		
		//do not forget to start the timer
		animationTimer.start();
			
		
		//setup the arraylist and array of Duck objects
		myDucks1 = new ArrayList<Duck>();
		myDucks2 = new Duck[10];
		
		for(int i =0; i < 10 ; i++) {
			myDucks2[i] = new Duck("duck.gif");
			myDucks1.add( new Duck("duck.gif"));
		}
		
		
		f.setVisible(true);
	}

	/* this method is invoked/called by the titmer */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//call the frame to refresh
		//recall that actitonPerformed is called by the
		//timer object every 16ms
		repaint();
		
	}
	
	
	
}