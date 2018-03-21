package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeSystem {
	static ArrayList<Employee> employees;
	static Manager steave;
	static boolean loggedIn;
	static Scanner input;
	static String currentEmployee;
	static HashMap<String, Employee> logins;

	public static void main(String[] args) {
		setup();
		while (!loggedIn) {
			login();
		}
		run();

	}

	private static void run() {
		String action = "";
		while (!action.equals("exit")) {
			if (logins.get(currentEmployee) instanceof Manager) {
				System.out.print("Welcome " + logins.get(currentEmployee).getName() + ", what would you like to do: \n"
						+ "Add Employee \nPrint Employee Information \n"
						+ "Fire Employee \nGive Employee Raise \nView Salery \nFind Manager \n:");
				action = input.nextLine().toLowerCase();
				managerAction(action);
			} else if (currentEmployee.getClass().equals(Manager.class)) {
				System.out.print("Welcome " + logins.get(currentEmployee) + ", what would you like to do: \n"
						+ "View Salery \nFind Manager \n:");
				action = input.nextLine().toLowerCase();
				employeeAction(action);
			}
		}

	}

	private static void managerAction(String action) {
		if (action.contains("add")) {
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Id: ");
			String id = input.nextLine();
			System.out.print("Password: ");
			String password = input.nextLine();
			System.out.print("Age: ");
			int age = input.nextInt();
			System.out.print("\nSalery");
			int salery = input.nextInt();
			Employee employeeTmp = new Employee()
			((Manager) logins.get(currentEmployee)).addEmployee(employeeTmp);
		}

	}

	private static void employeeAction(String action) {
		if (action.contains("salery")) {
			System.out.println(logins.get(currentEmployee).getName() + ", your salery is: " + logins.get(currentEmployee).getSalery());
			return;
		} if (action.contains("manager")) {
			System.out.println(logins.get(currentEmployee).getName() + ", your Manager is: " + logins.get(currentEmployee).getManager());
		return;
		} 
		System.out.println("Sorry that is not a valid commnad");
	}

	private static void login() {
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

	private static void setup() {
		logins = new HashMap<String, Employee>(); // uses hashmap for login password pairs
		input = new Scanner(System.in);
		loggedIn = false;
		steave = new Manager("Steave", "m1", "pass5", 56, 60000, null, employees);
		employees = new ArrayList<Employee>();
		employees.add(new Employee("John1", "e1", "pass1", 30, 35000, steave));
		employees.add(new Employee("John2", "e2", "pass2", 30, 35000, steave));
		employees.add(new Employee("John3", "e3", "pass3", 30, 35000, steave));
		employees.add(new Employee("John4", "e4", "pass4", 30, 35000, steave));

	}

}
