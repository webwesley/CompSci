package areaLab;

import java.util.ArrayList;

public class AreaLabTester {

	public static void main(String[] args) {
		PolygonArea test = new PolygonArea();
		ArrayList<Integer[]> testPoints = new ArrayList<Integer[]>();
		Integer[] point1 = {0, 0};
		Integer[] point2 = {2, 0};
		Integer[] point3 = {2, 2};
		Integer[] point4 = {0, 2};
		testPoints.add(point1);
		testPoints.add(point2);
		testPoints.add(point3);
		testPoints.add(point4);
		System.out.println(test.getArea(testPoints));
	}

}
