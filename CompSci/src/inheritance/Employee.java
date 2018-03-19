package inheritance;

public class Employee extends Person {

	private int salery;
	private Manager manager;
	private String password;
	
	public Employee(String name, String id, String password, int age, int salery, Manager manager) {
		super(name, id, age);
		this.salery = salery;
		this.manager = manager;
		this.password = password;
	}
}
