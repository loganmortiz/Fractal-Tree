import java.math.*;

public class Branch {
	
	int x,y,x2,y2;
	double size,angle;
	boolean done;
	
	public Branch(int x1, int y1,double angle1,double size1) {
		x = x1;
		y = y1;
		angle = angle1;
		size = size1;
		x2 = x - (int)(Math.cos(angle) * size);
		y2 = y - (int)(Math.sin(angle) * size);
		done = false;
	}
	
	public Branch GrowA() {
		double angleA = angle - (Math.PI / 8);
		double sizeA = size * 0.7;
		int xA = x2;
		int yA = y2;
		return new Branch(xA,yA,angleA,sizeA);
		
	}
	public Branch GrowB() {
		double angleB = angle + (Math.PI / 8);
		double sizeB = size * 0.7;
		int xB = x2;
		int yB = y2;
		return new Branch(xB,yB,angleB,sizeB);
		
	}
	public void SetDone() {
		done = true;
	}
	public boolean GetDone() {
		return done;
	}
}
