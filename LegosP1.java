package legoMania;

import javax.swing.*;
import java.awt.*;

public class LegosP1 extends JPanel {
	static final long serialVersionUID = 42L;
	
	@Override
	public void paintComponent(Graphics g) {
		int startX = 20;
		int startY = 260;
		int legoWidth = 50;
		int legoHeight = 20;
		int baseLength = 10;
		int arcWidth = 2;
		int arcHeight = 2;
		Color redLego = Color.RED;		
		Color blueLego = Color.BLUE;
		super.paintComponent(g);

		//draw Rectangle		
		for (int i=baseLength;i>=1;i--) {
			Color color = redLego;
			for (int j = 0;j<i;j++) {				
				g.setColor(color);
				if(color == redLego)
					color = blueLego;
				else
					color = redLego;
				int gap=(baseLength-i)*(legoWidth/2);
				g.fillRoundRect(gap+(j*legoWidth)+startX, startY-(baseLength-i)*legoHeight, legoWidth, legoHeight, arcWidth, arcHeight);
				
			}
		}
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(550,325); 
	}

    public static void main(String[] args) { 
    	JFrame frame = new JFrame("Abunaw's LEGOS Block");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LegosP1 d = new LegosP1();
        JPanel panel = new JPanel();      
        panel.add(d);      
        frame.add(panel);
        frame.setSize(550,325);
        frame.setVisible(true);
    }
}
