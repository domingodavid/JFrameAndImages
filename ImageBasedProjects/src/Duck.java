import java.awt.Graphics;

public class Duck extends Sprite {
	
	private int vx, vy; //movement
	
	public Duck(String fileName) {
		super(fileName);
		width 	= 100;
		height 	= 100;
		
		x = (int)(Math.random()*500);
		y = (int)(Math.random()*500); 
		
		// (int)(Math.random()*(range+1))+min;
		vx = (int)(Math.random()*10)-5;
		vy = (int)(Math.random()*10)-5;
	
	}
	
	public void paint(Graphics g) {
		x += vx;
		y += vy;
		if(x<0) {
			vx *= -1;
		}
		if(y<0) {
			vy *= -1;
		}
		
		super.paint(g);
	}
	
	

}
