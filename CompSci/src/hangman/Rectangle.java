package hangman;

import java.awt.Graphics;

import javax.swing.JComponent;

public class Rectangle extends JComponent {
	int x, y, width, height;

	public Rectangle(int x, int y, int width, int height) {
		this.x= x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public void paint(Graphics g) {
		g.fillRect(this.x, this.y, this.width, this.height);
	}

}
