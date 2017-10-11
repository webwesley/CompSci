package guis;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChoseYourOwnAdventure {
	String name;
	String text;
	ChoseYourOwnAdventure choice1;
	ChoseYourOwnAdventure choice2;
	JFrame frame;

	public ChoseYourOwnAdventure(ChoseYourOwnAdventure tmp) {
		this.name = tmp.name;
		this.text = tmp.text;
		if(tmp.choice1 != null && tmp.choice2 != null) {
			this.choice1 = tmp.choice1;			
			this.choice2 = tmp.choice2;
		} 
		this.frame = new JFrame("James Howard's Space Adventure");
		frame.setVisible(false);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(new GridLayout(3, 2));

		JLabel setting = new JLabel(this.text);
		panel.add(setting);

		JButton pick1 = new JButton(this.choice1.name);
		JButton pick2 = new JButton(this.choice2.name);

		pick1.addActionListener(new Action1());
		pick2.addActionListener(new Action2());
		
		panel.add(pick1);
		panel.add(pick2);
	}

	public ChoseYourOwnAdventure(String text, String name) {
		this.name = name;
		this.frame = new JFrame("James Howard's Space Adventure");
		frame.setVisible(false);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// creates the pannelclass Action1 extends ActionListener()
		// attaches pannel to frame
		JPanel panel = new JPanel();
		frame.add(panel);

		panel.setLayout(new FlowLayout());
		JLabel setting = new JLabel(text);
		panel.add(setting);
	}

	public ChoseYourOwnAdventure(String text, String name, ChoseYourOwnAdventure choice1,
			ChoseYourOwnAdventure choice2) {
		this.name = name;
		this.text = text;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.frame = new JFrame("James Howard's Space Adventure");
		frame.setVisible(false);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// creates the pannel
		// attaches pannel to frame
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(new GridLayout(3, 2));

		JLabel setting = new JLabel(this.text);
		panel.add(setting);

		JButton pick1 = new JButton(this.choice1.name);
		JButton pick2 = new JButton(this.choice2.name);

		pick1.addActionListener(new Action1());
		pick2.addActionListener(new Action2());
		
		panel.add(pick1);
		panel.add(pick2);
	}

	public void draw() {
		frame.setVisible(true);
	}

	class Action1 implements ActionListener {


		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ChoseYourOwnAdventure tmp = new ChoseYourOwnAdventure(ChoseYourOwnAdventure.this.choice1);
			tmp.draw();
		}

	}

	class Action2 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ChoseYourOwnAdventure tmp = new ChoseYourOwnAdventure(ChoseYourOwnAdventure.this.choice2);
			tmp.draw();

		}

	}
}
