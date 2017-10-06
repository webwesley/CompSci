package guis;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class House extends JFrame {
	
	public House() {
		super("House");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(100, 200, 200, 100);
		g.setColor(Color.GREEN);
		g.fillRect(150, 240, 25, 60);
		g.setColor(Color.CYAN);
		g.fillPolygon(new int[] {75, 200, 325}, new int[] {200, 150, 200}, 3 );
		g.fillRect(100, 125, 25, 75);
		g.setColor(Color.DARK_GRAY);
		g.fillOval(100, 100, 25, 25);
		g.fillOval(100, 75, 25, 25);
		g.fillOval(100, 50, 25, 25);
	
		}
		
			
	}
	



