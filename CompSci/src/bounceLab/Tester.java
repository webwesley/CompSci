package bounceLab;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
			ArrayList<Student> rosterStudents = new ArrayList<Student>(Arrays.asList(new Student("John", 0, true),
					new Student("Marry", 1, false), new Student("Anna", 2, true), new Student("James", 3, true),
					new Student("Emma", 4, true), new Student("George", 5, false), new Student("Elizabeth", 6, true),
					new Student("Charles", 7, true), new Student("Margaret", 8, true), new Student("Frank", 9, true),
					new Student("Minnie", 10, true), new Student("Josph", 11, true), new Student("Ida", 12, false),
					new Student("Henry", 13, true), new Student("Bertha", 14, true), new Student("Robert", 15, true),
					new Student("Clara", 16, true), new Student("Thomas", 17, false)));

			Roster test = new Roster(rosterStudents);
			System.out.println("Does the roster contain someone named Frank? " + test.containsStudent("Frank"));
			System.out.println("What student has an id number of 13? " + test.retrieveById(13));
			System.out.println("What is Minnie's id number? " + test.retrieveId("Minnie"));
			System.out.println("Added Suzzie to the lists \n" + test.toString());
			test.removeStudent(2);
			test.removeStudent("Elizabeth");
			System.out.println("Removed William From the list by id number, and Elizabeth by name: \n" + test.toString());
			test.sortedRoster();

			System.out.println("A Sorted Roster: \n" + String.join(", ", test.sortedRoster().toString()));
			System.out.println("Who is eligible to go? " + String.join(", ", test.eligibleRoster().toString()));
		}

	}


