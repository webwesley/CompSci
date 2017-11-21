package hangman;

import java.awt.Graphics;

import javax.swing.*;

public class Draw extends JPanel {
	/**
	 * Draw method for hangman. Based upon the number of lives, the graphics draw another part of the the hanged man
	 */
	private static final long serialVersionUID = 1L;
	int life;

	public Draw(int life) {
		this.life = life;
	}
	
	public void removeLife() {
	this.life--;
	}

	public void paint(Graphics g) {
		switch (life) {
		case 8:
			break;
		case 7:
			g.fillRect(100, 550, 200, 50);
			break;
		case 6:
			g.fillRect(100, 550, 200, 50);
			g.fillRect(125, 150, 50, 400);
			break;
		case 5:
			
			g.fillRect(175, 150, 100, 50);
			break;
		case 4:
			g.fillRect(100, 550, 200, 50);
			g.fillRect(125, 150, 50, 400);
			g.fillRect(175, 150, 100, 50);
			g.drawLine(250, 200, 250, 250);
			break;
		case 3: 
			g.fillOval(225, 250, 50, 50);
			break;
		case 2:
					
			g.drawLine(250, 300, 250, 450);
		
			break;
		case 1:
			g.drawLine(250, 325, 200, 400);
			g.drawLine(250, 325, 300, 400);
			break;
		case 0:
			g.drawLine(250, 450, 200, 525);
			g.drawLine(250, 450, 300, 525);
		
			g.drawString("Bang! You're dead!", 100, 100);
			break;
		
		}
	}
}
