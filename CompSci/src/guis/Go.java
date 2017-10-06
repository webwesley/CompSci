package guis;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Go {
	
	public Go() {
		//creates Frame
		JFrame frame = new JFrame("A day in the life");
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creates the pannel
		//attaches pannel to frame
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(new GridLayout(3,2));
		
		//creates labels
		JLabel begin = new JLabel("Wake up");
		JLabel move = new JLabel("This is the move label");
		JButton choice1 = new JButton("Chocie 1 label");
		JButton choice2 = new JButton("Choice 2 label");
		
		//creates actionListener
		choice1.addActionListener(new Action1());
		choice2.addActionListener(new Action2());
		
		//Attaches the label and buttons to the panel
		
		panel.add(begin);
		panel.add(move);
		panel.add(choice1);
		panel.add(choice2);
	}
	
}

class Action1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Choice 1");
		frame.setVisible(true);
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		JLabel label = new JLabel("You picked 1");
		frame.add(label);
		
	}
}
	
class Action2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JFrame frame = new JFrame("Choice 2");
			frame.setVisible(true);
			frame.setSize(600, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel panel = new JPanel();
			frame.add(panel);
			JLabel label = new JLabel("You picked 2");
			frame.add(label);
			
		}
		
	
	
	
}
