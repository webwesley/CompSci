package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeSystem {
	ArrayList<Employee> employees;
	Manager steave;
	boolean loggedIn;
	Scanner input;
	String currentEmployee;
	HashMap<String, Employee> logins;

	private void run() {
		String action = "";
		while (!action.equals("exit")) {
			if (logins.get(currentEmployee) instanceof Manager) {
				System.out.print("Welcome " + logins.get(currentEmployee).getName() + ", what would you like to do: \n"
						+ "Add Employee \nPrint Employee Information \n"
						+ "Fire Employee \nGive Employee Raise \nView Salery \nFind Manager \n:");
				action = input.nextLine().toLowerCase();
				managerAction(action);
			} else if (logins.get(currentEmployee) instanceof Employee) {
				System.out.print("Welcome " + logins.get(currentEmployee).getName() + ", what would you like to do: \n"
						+ "View Salery \nFind Manager \n:");
				action = input.nextLine().toLowerCase();
				employeeAction(action);
			}
		}

	}

	private void managerAction(String action) {
		if (action.contains("add")) {
			addEmployee();
		} else if (action.contains("print")) {
			printEmployeeInfo();
		} else if (action.contains("fire")) {
			fireEmployee();
		} else if (action.contains("raise")) {
			employeeRaise();
		} else {
			employeeAction(action);
		}
	}

	private void employeeRaise() {
		String userNameTmp = "";
		while (!(logins.containsKey(userNameTmp)
				&& logins.get(userNameTmp).getManager().equals(logins.get(currentEmployee)))) {
			System.out.println("Please input a vaild username of your employee: ");
			userNameTmp = input.nextLine();
		}
		System.out.println("What is the next salery:");
		int saleryTmp = input.nextInt();
		logins.get(userNameTmp).setSalery(saleryTmp);
	}

	private void fireEmployee() {
		String userNameTmp = "";
		while (!(logins.containsKey(userNameTmp)
				&& logins.get(userNameTmp).getManager().equals(logins.get(currentEmployee)))) {
			System.out.println("Please input a vaild username of your employee: ");
			userNameTmp = input.nextLine();
		}
		((Manager) logins.get(currentEmployee)).employees.remove(logins.get(userNameTmp));
		System.out.println("Employee " + userNameTmp + " has been fired. Here is a list of your current employees");
		((Manager) logins.get(currentEmployee)).printEmployees();
	}

	private void printEmployeeInfo() {
		String userNameTmp = "";
		while (!(logins.containsKey(userNameTmp)
				&& logins.get(userNameTmp).getManager().equals(logins.get(currentEmployee)))) {
			System.out.println("Please input a vaild username of your employee: ");
			userNameTmp = input.nextLine();
		}
		logins.get(userNameTmp).toString();
	}

	private void addEmployee() {
		System.out.print("Name:");
		String name = input.nextLine();
		System.out.print("Id:");
		String id = input.nextLine();
		System.out.print("Password:");
		String password = input.nextLine();
		System.out.print("Age:");
		int age = input.nextInt();
		System.out.print("Salery:");
		int salery = input.nextInt();
		System.out.println();
		((Manager) logins.get(currentEmployee)).addEmployee(new Employee(name, id, password, age, salery, steave));
		System.out
				.println("Congrats, " + name + "has been added to your employee List. Here is a list of your employees"
						+ ((Manager) logins.get(currentEmployee)).getEmployees() + "\n");
	}

	private void employeeAction(String action) {
		if (action.contains("salery")) {
			System.out.println(logins.get(currentEmployee).getName() + ", your salery is:$"
					+ logins.get(currentEmployee).getSalery());
			return;
		}
		if (action.contains("manager")) {
			System.out.println(logins.get(currentEmployee).getName() + ", your Manager is:"
					+ logins.get(currentEmployee).getManagerName());
			return;
		}
		if (!action.equals("exit")) {
			System.out.println("Sorry that is not a valid commnad");
		}
	}

	private void login() {
		for (int i = 0; i < employees.size(); i++) {
			logins.put(employees.get(i).getId(), employees.get(i));
		}
		logins.put(steave.getId(), steave);

		System.out.print("Username: ");
		String usrTmp = input.nextLine();
		if (logins.containsKey(usrTmp)) {
			System.out.print("Password: ");
			String passTmp = input.nextLine();
			if (passTmp.equals(logins.get(usrTmp).getPassword())) {
				loggedIn = true;
				System.out.println("Thank You For logging in, " + logins.get(usrTmp).getName() + "\n");
				currentEmployee = logins.get(usrTmp).getId();
				return;
			}
		}
		System.out.println("Sorry, either the username or the password is invalid, please try again" + "\n");

	}

	private void setup() {
		logins = new HashMap<String, Employee>(); // uses hashmap for login password pairs
		input = new Scanner(System.in);
		loggedIn = false;
		employees = new ArrayList<Employee>();
		steave = new Manager("Steave", "m1", "pass5", 56, 60000, null, employees);
		employees.add(new Employee("John1", "e1", "pass1", 30, 35000, steave));
		employees.add(new Employee("John2", "e2", "pass2", 30, 35000, steave));
		employees.add(new Employee("John3", "e3", "pass3", 30, 35000, steave));
		employees.add(new Employee("John4", "e4", "pass4", 30, 35000, steave));

	}

	public static void main(String[] args) {
		EmployeeSystem test = new EmployeeSystem();
		test.setup();
		while (!test.loggedIn) {
			test.login();
		}
		test.run();

	}

}
