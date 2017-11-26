package bounceLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Student {
	protected String studentName;
	protected int id;
	protected boolean eligibility;

	public Student(String studentName, int id, boolean eligibility) {
		this.studentName = studentName;
		this.id = id;
		this.eligibility = eligibility;
	}

	public String getStudentName() { // accessors
		return studentName;
	}

	public int getId() {
		return id;
	}

	public boolean getEligibility() {
		return eligibility;
	}

	public void changeEligibility() { // mutators
		eligibility = !eligibility;
	}

	public int compareTo(Student o2) {
		return studentName.compareTo(o2.studentName);
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", id=" + id + ", eligibility=" + eligibility + "]";
	}

}

class Roster {
	private static final int MAX_NUM = 20;
	ArrayList<Student> masterRoster;
	ArrayList<Student> eligibleRoster;

	public Roster() {
		masterRoster = new ArrayList<Student>(MAX_NUM);
		eligibleRoster = new ArrayList<Student>(MAX_NUM);
	}

	public Roster(ArrayList<Student> tmp) {
		masterRoster = tmp;
		eligibleRoster = new ArrayList<Student>(MAX_NUM);
	}

	public boolean containsStudent(String studentName) { 
		for (int i = 0; i < masterRoster.size(); i++) {
			if (masterRoster.get(i).studentName.toLowerCase().equals(studentName.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	public String retrieveById(int id) {
		for (int i = 0; i < masterRoster.size(); i++) {
			if (masterRoster.get(i).id == id) {
				return masterRoster.get(i).studentName;
			}
		}
		return "That student is not in this roster";
	}

	public int retrieveId(String studentName) {
		for (int i = 0; i < masterRoster.size(); i++) {
			if (masterRoster.get(i).studentName.equals(studentName)) {
				return masterRoster.get(i).id;
			}
		}
		return -1;
	}

	public boolean addStudent(String studentName, int studentID, boolean eligibility) { // creates a student object,
																						// if the roster contains
																						// the same object, it
																						// returns false
		Student newStudent = new Student(studentName, studentID, eligibility);
		if (masterRoster.contains(newStudent) || masterRoster.size() == MAX_NUM) {
			return false;
		}
		masterRoster.add(newStudent);
		return true;
	}

	public boolean removeStudent(int id) { // returns true if the student was removed false if not
		for (int i = 0; i < masterRoster.size(); i++) {
			if (masterRoster.get(i).id == id) {
				masterRoster.remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean removeStudent(String name) { // returns true if the student was removed false if not
		for (int i = 0; i < masterRoster.size(); i++) {
			if (masterRoster.get(i).studentName.equals(name)) {
				masterRoster.remove(i);
				return true;
			}
		}
		return false;
	}

	public ArrayList<Student> eligibleRoster() {
		for (int i = 0; i < masterRoster.size(); i++) {
			if (masterRoster.get(i).eligibility) {
				this.eligibleRoster.add(masterRoster.get(i));
			}
		}
		return this.eligibleRoster;
	}

	public ArrayList<Student> sortedRoster() {
		@SuppressWarnings("unchecked")
		ArrayList<Student> tmp = (ArrayList<Student>) masterRoster.clone();
		tmp.sort(new Comparator<Student>() {

			public int compare(Student o1, Student o2) {

				return o1.compareTo(o2);
			}

		});
		return tmp;
	}
	
	@Override
	public String toString() {
		String tmp = "<";
		for(int i = 0; i < masterRoster.size(); i++) {
			tmp += (masterRoster.get(i).toString() + ",");
		}
		return tmp;
	}

	
}
