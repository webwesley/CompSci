package bigData;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class makeGraph extends JFrame {

	JFrame frame;
	String title;

	public makeGraph(String title, int[] numbers) {
		super("makeGraph");
		this.title = title.toLowerCase();
		this.frame = new JFrame(title);
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setVisible(true);
	}

	public void paint(Graphics g) {
		if (title.equals("color")) {
		} else {
			g.drawRect(0, 5, 10, 10);

		}

	}

}
