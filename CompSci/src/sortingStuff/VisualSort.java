package sortingStuff;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class VisualSort extends JPanel implements ActionListener {

	Integer[] array;
	Timer time;
	
	public VisualSort(Integer[] array) {
		this.array = array;
		time = new Timer(1000, this);
		time.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintRectangles(this.array, g);
		g.drawRect(5, 5, 5, 5);
	}
	
	
	
	private void paintRectangles(Integer[] array, Graphics g) {
		System.out.println(Arrays.toString(array));
		int width = this.getWidth() / array.length;
		int x = 0;
		int height = this.getHeight();
		for(int i = 0; i < array.length; i++) {
			if(i % 2 == 0) {
				g.setColor(Color.GREEN);
			} else {
				g.setColor(Color.RED);
			}
			g.fillRect(x, height - array[i], width, height);
			System.out.println("Printed Rect at " + x + "," + "Width: " + width + "Height: " + height );
			x += width;
		}
		
	}

	


	public void actionPerformed(ActionEvent e) {
			boolean sorted = true;
			for(int i = array.length - 2; i>1; i--) {
				sorted = true;
				for(int j = 0; j <i-1; j++) {
					if(array[i].compareTo(array[j+1]) > 0) {
						sorted = false;
						int tmp = array[j];
						array[j] = array[j+1];
						array[j+1] = tmp;
						repaint();
						return;
					}
				}
				if(sorted) {
					time.stop();
				}
			}
			time.stop();
		
	}
	
	public static void main(String[] args) {
		Integer[] small = {1, 5, 2, 3};
		VisualSort test = new VisualSort(small);
		JFrame frame = new JFrame();
		frame.setTitle("Test Stuff");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(test);
		frame.setVisible(true);
	}

}
