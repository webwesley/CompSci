package bounceLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Part1 {

	private static final int MAX_NUM = 20;
	private ArrayList<String> names;
	private ArrayList<Integer> idNum;
	private ArrayList<Boolean> eligibility;

	public Part1() {
		names = new ArrayList<String>(MAX_NUM);
		for(int i = 0; i < MAX_NUM; i++) {
			names.add("");
		}
		idNum = new ArrayList<Integer>(MAX_NUM);
		eligibility = new ArrayList<Boolean>(MAX_NUM);
	}
	
	public Part1(ArrayList<String> tmp) {
		names = tmp;
		idNum = new ArrayList<Integer>(MAX_NUM);
		eligibility = new ArrayList<Boolean>(MAX_NUM);
		for(int i = 0; i < names.size(); i++) {
			idNum.add(i);
			eligibility.add(true);
		}
		
	}
	
	public boolean containsStudent(String studentName) {
		return names.contains(studentName);
	}
	
	public String retrieveById(int id) {
		if(idNum.contains(id)) {
			return names.get(idNum.indexOf(id));
		} else {
			return "Student id is not in the system";
		}
	}
	
	public int retrieveId(String student) {
		if(names.contains(student)) {
			return idNum.get(names.indexOf(student));
		} else {
			return -1;
		}
	}
	
	public boolean addStudent(String studentName, int studentId, boolean eligibility) { //returns false if student was already in the list, true if the studnet was added
		if(names.contains(studentName) || idNum.contains(studentId)) {
			return false;
		} else if (names.size() < 20){
			names.add(studentName);
			idNum.add(studentId);
			this.eligibility.add(eligibility);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean removeStudent(int id) { //returns true if the student was removed, false if the student was not in the list
		if(idNum.contains(id)) {
			names.remove(idNum.indexOf(id));
			eligibility.remove(idNum.indexOf(id));
			idNum.remove(id);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean removeStudent(String name) { //returns true if the student was removed, false if the student was not in the list
		if(names.contains(name)) {
			eligibility.remove(names.indexOf(name));
			idNum.remove(names.indexOf(name));
			names.remove(name);
			return true;
		} else {
			return false;
		}
	}
	
	public ArrayList<String> eligibleRoster() { //if someone is eligible, they are added to this roster
		ArrayList<String> eligible = new ArrayList<String>();
		for(int i = 0; i < names.size(); i++) {
			if(eligibility.get(i)) {
				eligible.add(names.get(i));
			}
		}
		return eligible;
	}
	
	
	public ArrayList<String> sortedRoster() { //uses a comparator to create a sorted version of the names arraylist to return
		@SuppressWarnings("unchecked")
		ArrayList<String> tmp = (ArrayList<String>) names.clone();
		tmp.sort(new Comparator<String>(){

			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
			
		});
		return tmp;
	}
	
	public String toString() {
		String names = "<";
		String idNum = "<";
		String eligibility = "<";
		for(int i = 0; i < this.names.size() - 1; i++) {
			names += ("\"" + this.names.get(i) + "\",");
			idNum += ("\"" + this.idNum.get(i) + "\",");
			eligibility += ("\"" + this.eligibility.get(i) + "\",");
		}
		names += ("\"" + this.names.get(this.names.size() - 1) + "\">");
		idNum += ("\"" + this.idNum.get(this.idNum.size() - 1) + "\">");
		eligibility += ("\"" + this.eligibility.get(this.eligibility.size() - 1) + "\">");
		return (names + "\n" + idNum + "\n" + eligibility + "\n");
	}
	

	public static void main(String args[]) {
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("John", "Mary", "William", "Anna", "James", "Emma", "George",
				"Elizabeth", "Charles", "Margaret", "Frank", "Minnie", "Joseph", "Ida", "Henry", "Bertha", "Robert", "Clara", "Thomas")); //taken from the top ten baby names from the 1880s
		Part1 test = new Part1(names);
		System.out.println("Does the roster contain someone named Frank? " + test.containsStudent("Frank"));
		System.out.println("What student has an id number of 13? " + test.retrieveById(13));
		System.out.println("What is Minnie's id number? " + test.retrieveId("Minnie"));
		test.addStudent("Suzzie", 20, false);
		System.out.println("Added Suzzie to the lists \n" + test.toString());
		test.removeStudent(2);
		test.removeStudent("Elizabeth");
		System.out.println("Removed William From the list by id number, and Elizabeth by name: \n" + test.toString());
		test.sortedRoster();
		
		System.out.println("A Sorted Roster: \n" + String.join(", ", test.sortedRoster()));
		System.out.println("Who is eligible to go? " + String.join(", ", test.eligibleRoster()));
	}
}