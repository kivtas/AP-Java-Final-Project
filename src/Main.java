import processing.core.PApplet;
import processing.core.PVector;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Main extends PApplet {
	
	Projectile p;
	float x =50;
	float y = 750;
	
	public void setup() {
		size(1200, 800);
		p = new Projectile(21, 75, x, y);
	}

	public void draw() {
		background(0);

		ellipse(p.x, p.y, 20, 20);
		rect(800, 300, 45, 600);
		rect(800,200,20,100);
		ellipse(760,232,78,10);
		System.out.println("X is " + x + " and time is ");
		System.out.println("Y is " + y);
		if (key == ENTER){
			shootBall();
			
		}

	}
	
	public void shootBall(){
		x += p.getX();
		if (y <= 800){
		y += p.getY();
		} else if (y > 800) reset();
		System.out.println("X is " + x + " and time is ");
		System.out.println("Y is " + y);
		p.update();
	
		
	}
	public void reset() {
		x = 50;
		y = 750;
	}
	

}
