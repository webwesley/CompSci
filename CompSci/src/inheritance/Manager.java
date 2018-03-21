package inheritance;

import java.util.ArrayList;

public class Manager extends Employee {
	
	ArrayList<Employee> employees;
	
	public Manager (String name, String id, String password, int age, int salery, Manager manager, ArrayList<Employee> employees) {
		super(name, id, password, age, salery, manager);
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Manager [employees=" + employees + "]";
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}
	

}
