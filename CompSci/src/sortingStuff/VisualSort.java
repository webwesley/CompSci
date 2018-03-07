package sortingStuff;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class VisualSort extends JPanel {

	Integer[] array;
	int resizeFactor; //just something so i can keep testing small numbers but get larger boxes
	int pointer; //just a variable to make the pointed at box highlighted
	
	public VisualSort(Integer[] array) {
		this.array = array;
		resizeFactor = 9;
		pointer = 0;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintRectangles(this.array, g);
	}
	
	
	
	private void paintRectangles(Integer[] array, Graphics g) {
		//System.out.println(Arrays.toString(array));
		int width = this.getWidth() / array.length;
		int x = 0;
		int height = this.getHeight();
		for(int i = 0; i < array.length; i++) {
			if(i == pointer) {
				g.setColor(Color.RED);
				int bottomY = height;
				int topY = height - this.resizeFactor * array[i];
				g.fillRect(x, topY, width, bottomY);
			} else {
				g.setColor(Color.BLACK);
				int bottomY = height;
				int topY = height - this.resizeFactor * array[i];
				g.drawRect(x, topY, width, bottomY);
				g.setColor(Color.BLUE);
				g.fillRect(x, topY, width, bottomY);
			}
			
			//System.out.println("Printed Rect at " + x + "," + " Width: " + width + "Height: " + height );
			x += width;
		}
		
	}


	public void bubbleSort() {
			boolean sorted = true;
			for(int i = array.length - 1; i >= 1; i--) {
				sorted = true;
				for(int j = 0; j < i; j++) {
					pointer = j;
					try {
						Thread.sleep(0);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(array[j].compareTo(array[j+1]) > 0) {
						sorted = false;
						int tmp = array[j];
						array[j] = array[j+1];
						array[j+1] = tmp;
						
					}
					paint(getGraphics());
					Toolkit.getDefaultToolkit().sync(); //this is something to make the animation on linux slightly smoother
				}
				if(sorted) {
				
					System.out.println("Done");
					return;
				}
			}
	}
	
	public void quickSort(int low, int high) {
		if(low == high) {
			return;
		} else {
			Integer pivot = array[0];
			int pivotIndex = 0;
			for(int i = low; i < high; i++ ) {
				if(pivot.compareTo(array[i]) < 0) {
					int tmp = array[i];
					array[i] = pivot;
					array[pivotIndex] = tmp;
					pivotIndex = i;
				}
			}
			quickSort()
		}
	}
	
	public static void main(String[] args) {
		Integer[] testArray = makeTestArray(200, 100);
		VisualSort test = new VisualSort(testArray);
		JFrame frame = new JFrame();
		frame.setTitle("Test Stuff");
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(test);
		frame.setVisible(true);
		test.bubbleSort();
	}

	private static Integer[] makeTestArray(int iterations, int range) {
		Integer[] tmp = new Integer[iterations];
		Random random = new Random();
		for(int i = 0; i < iterations; i++) {
			tmp[i] = random.nextInt(range - 1) + 1;
		}
		return tmp;
	}

}
