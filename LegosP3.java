package legoMania;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class LegosP3 extends JPanel {
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
		Color[] colors	={Color.red, Color.BLUE, Color.YELLOW,
				Color.green, Color.pink,Color.black, Color.magenta,
				Color.orange, Color.cyan};
		super.paintComponent(g);

		//draw Rectangle		
		Color color = Color.red;
		for (int i=baseLength;i>=1;i--) {			
			for (int j = 0;j<i;j++) {				
				g.setColor(color);
				Random rand = new Random();
				Color lastColor=color;
				while(true) {
					int x = rand.nextInt(colors.length);
					color = colors[x];
					if(lastColor!=color)
						break;
				}
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
        LegosP3 d = new LegosP3();
        JPanel panel = new JPanel();      
        panel.add(d);      
        frame.add(panel);
        frame.setSize(550,325);
        frame.setVisible(true);
    }
}
