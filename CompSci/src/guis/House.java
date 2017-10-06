package guis;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import netscape.javascript.JSObject;

public class House {
	
	public House() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		Component rect = new Componet();
		
		panel.add(rect);
		
	}

}
