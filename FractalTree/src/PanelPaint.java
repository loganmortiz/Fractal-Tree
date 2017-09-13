import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

public class PanelPaint extends JPanel{
	
	ArrayList list;
	
	public PanelPaint(ArrayList list1) {
		list = list1;
		this.addMouseListener(new MouseClick());
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0;i < list.size();i++) {
			g.drawLine(((Branch)list.get(i)).x, ((Branch)list.get(i)).y, ((Branch)list.get(i)).x2, ((Branch)list.get(i)).y2);
		}
	}
	
	private class MouseClick implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			for (int i = list.size()-1; i >= 0;i--) {
				if (!(FractalTree.list.get(i)).GetDone()){
					FractalTree.list.add(((Branch)FractalTree.list.get(i)).GrowA());
					FractalTree.list.add(((Branch)FractalTree.list.get(i)).GrowB());
					((Branch)FractalTree.list.get(i)).SetDone();
				}
			}
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
