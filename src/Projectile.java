
public class Projectile {
	float x;
	float y;
	double initialVelocity;
	double angle;
	double xVelocity;
	double yVelocity;
	double gravity = 0.25;
	
	public Projectile(double initialVelocity, double angle, float x, float y){
		this.initialVelocity = initialVelocity;
		this.angle = angle;
		xVelocity = initialVelocity*Math.cos(Math.toRadians(angle));
		yVelocity = -initialVelocity*Math.sin(Math.toRadians(angle));
		
		
		
		this.x = x;
		this.y = y;
	}


	public double getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
		
	}


	public double getY() {
		return y;
	}
	
	
	public void update() {
		x += xVelocity;
		yVelocity += gravity;
		y += yVelocity;
		
	}


	public void setY(float y) {
		this.y = y;
	}


	public double getxVelocity() {
		return xVelocity;
	}


	public void setxVelocity(double xVelocity) {
		this.xVelocity = xVelocity;
	}


	public double getyVelocity() {
		return yVelocity;
	}


	public void setyVelocity(double yVelocity) {
		this.yVelocity = yVelocity;
	}
	
	
	public double getRange(double initialVelocity, double angle){
		double range = ((initialVelocity)*(initialVelocity)*Math.sin(2*Math.toRadians(angle)))/9.81;
		return range;
	}
	
	
	public double getMaxHeight(double initialVelocity, double angle, double gravity){
		double height = ((initialVelocity)*(initialVelocity)*(Math.sin(Math.toRadians(angle)))*(Math.sin(Math.toRadians(angle))))/(2*gravity);
		return height;
	}
	
}
