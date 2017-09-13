import java.util.*;
import java.math.*;
import javax.swing.JFrame;

public class FractalTree {
	
	static ArrayList<Branch> list = new ArrayList<Branch>();
	
	public static void main(String[] args) {
		int width = 800;
		int height = 800;
		int x = width / 2;
		int y = height;
		
		list.add(new Branch(x,y,Math.PI / 2,200));
		
		JFrame frame = new JFrame("Click to Grow");
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelPaint panel = new PanelPaint(list);
		
		
		//panel.paintComponent();
		
		frame.add(panel);
		
		
		
		frame.setVisible(true);
		
	}

}
