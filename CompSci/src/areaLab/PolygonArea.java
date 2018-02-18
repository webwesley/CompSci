package areaLab;

import java.util.ArrayList;
import java.util.Arrays;

public class PolygonArea {

	
	public double getArea(ArrayList<Integer[]> points) {
		if(hasNoPolygon(points)) {
			return 0;
		}
		double tmp = getTriangleArea(points);
		points.remove(1);
		return tmp + getArea(points);
		}

	private boolean hasNoPolygon(ArrayList<Integer[]> points) {
		if(points.size() > 2) {
			return false;
		}
		return true;
	}
	
	private double getTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
		double tmp =  Math.abs(x1 * (y2 - y3) + (x2 * (y3 - y1)) + (x3 * (y1 - y2))) / 2; 
		return tmp;
	}
	
	private double getTriangleArea(ArrayList<Integer[]> points) {
		return getTriangleArea(points.get(0)[0], points.get(0)[1], points.get(1)[0], points.get(1)[1], points.get(2)[0], points.get(2)[1]);
	}
}
