package inheritance;

import java.util.ArrayList;

public class Manager extends Person {
	
	ArrayList<Employee> employees;
	
	public Manager (String name, String id, int age, ArrayList<Employee> employees) {
		super(name, id, age);
		this.employees = employees;
	}
	

}
