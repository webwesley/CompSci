package bigData;

import java.io.IOException;
import java.util.ArrayList;

public class Counters {

	private String[] file;
    
    public Counters(String whichMethod, Data data) throws IOException
    {
    	Data myData = data;
    	   
    	
        //Constructor takes in what variable you want to do a counter for, sets the file[] array to that particular
        //array (from Data class), and runs counter() method
        if (whichMethod.equalsIgnoreCase("Body Type")) {
            file = myData.getBodyType();
            counter();
        }
        else if (whichMethod.equalsIgnoreCase("Car Maker")) {
            file = myData.getMake();
            counter();
        }
        else if (whichMethod.equalsIgnoreCase("Time")) {
            file = myData.getTime();
            counter();
        }
        else if (whichMethod.equalsIgnoreCase("Street Name")) {
            file = myData.getStreetName();
            counter();
        }
        else if (whichMethod.equalsIgnoreCase("Color")) {
            file = myData.getColor();
            counter();
        }
    }
    
    /**
     * parses through the dataset, creates an arraylist of Strings for each different type of that variable. (Example: for 
     * color, the arraylist would hold: green, red, blue, etc). Then creates a parallel arrayList of the same size, and 
     * that arrayList has a counter for each different type of that variable. 
     */
    public void counter() { 
        //creates an arraylist of Strings for each different type of that variable
        ArrayList<String> allTypes = new ArrayList<String>(); 
        for (int x = 0; x<file.length; x++) {
            if (allTypes.contains(file[x]) == false) {
                allTypes.add(file[x]);
            }
        }
        System.out.println(allTypes);
        System.out.println();
        
        //creates a parallel arrayList of the same size (allTypes.size(), below), and this arrayList has a counter for each different 
        //type of that variable. 
        int arraySize = allTypes.size();
        ArrayList<Integer> counters = new ArrayList<Integer>(arraySize);
        for (int x = 0; x<arraySize; x++) { //initializes every spot to 0
            counters.add(x);
        }
        for (int x = 0; x<file.length; x++) { //goes through dataset, adds one for every instance of a different type
            int indexInAllTypes = allTypes.indexOf(file[x]);
            int currentAmount = counters.get(indexInAllTypes);
            counters.set(indexInAllTypes, currentAmount + 1);
        }
        for (int x = 0; x < arraySize; x++) { //prints out results
            System.out.println(allTypes.get(x));
            System.out.println(counters.get(x));
            System.out.println();
        }
        
        //Below section is like a toString: it prints out number and type of most occurences
        int indexOfGreatest = -1;
        int greatestValue = 0;
        for (int x = 0; x < arraySize; x++) {
            if (counters.get(x)>greatestValue) {
                greatestValue = counters.get(x);
                indexOfGreatest = x;
            }
        }
        String greatestString = allTypes.get(indexOfGreatest);
        System.out.println("The " + greatestString + " has the greatest number of occurrences, at " + greatestValue + "."); 
    }
    

}
