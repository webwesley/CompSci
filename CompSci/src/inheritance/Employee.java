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

	@Override
	public String toString() {
		return "Employee [salery=" + salery + ", manager=" + manager + ", password=" + password + "]";
	}

	public int getSalery() {
		return salery;
	}

	public void setSalery(int salery) {
		this.salery = salery;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
