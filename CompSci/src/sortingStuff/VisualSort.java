package sortingStuff;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class VisualSort extends JPanel {

	Integer[] array;
	int resizeFactor; //just something so i can keep testing small numbers but get larger boxes
	int pointer; //just a variable to make the pointed at box highlighted
	ArrayList<ArrayList<Integer>> numbers;
	
	public VisualSort(Integer[] array) {
		this.array = array;
		resizeFactor = 1;
		pointer = 0;
		numbers = new ArrayList<ArrayList<Integer>>(10);
		for(int i = 0; i < 10; i++) {
			numbers.add(new ArrayList<Integer>());
		}
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
						Thread.sleep(1);
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
	
	public void radixSort() {
		int iterations = getIterations();
		for (int i = 0; i < iterations; i++) {
			for (int j = 0; j < array.length; j++) {
				int tmp = (int) (array[j] % Math.pow(10, i + 1) / Math.pow(10,  i));
				numbers.get(tmp).add(array[j]);
				
				
			}
			resetArray();
		}
	}
	
	private void resetArray() {
		int index = 0;
		for(int i = 0; i < numbers.size(); i++) {
			for(int j = 0; j < numbers.get(i).size(); j++) {
				array[index] = numbers.get(i).get(j);
				index++;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				repaint();
			}
		}
		numbers = new ArrayList<ArrayList<Integer>>(10); //resets the numbers double arraylist
		for(int i = 0; i < 10; i++) {
			numbers.add(new ArrayList<Integer>());
		}
		
	}

	private int getIterations() {
		return (int) Math.log10(findMaximum()) + 1;
	}


	private int findMaximum() {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int iterations = 500;
		Integer[] testArray = (Integer[]) makeTestArray(iterations, 100).toArray(new Integer[iterations]);
		VisualSort test = new VisualSort((Integer[]) testArray);
		JFrame frame = new JFrame();
		frame.setTitle("Test Stuff");
		frame.setSize(1500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(test);
		frame.setVisible(true);
		test.radixSort();
	}

	private static ArrayList<Integer> makeTestArray(int iterations, int range) {
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		for(int i = 0; i < iterations; i++) {
			tmp.add(i);
		}
		Collections.shuffle(tmp);
		return tmp;
	}

}
