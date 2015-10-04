 /* Endangered animal counter thing? - Michael Earl 29/09/15 */
import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
class count {
    /**
       Collects info about animals and how many of them remain in the wild
    **/

    public static void main (String[] param){
	Boolean collectdata = true;
	String vote;
	Boolean valid;
	String animalname;
	Integer wildcount = 0;
	HashMap<String, Integer> animals = new HashMap<String, Integer>();
	// our data collection loop. Keeps requesting animals until collectdata == false (set when you vote the special code 0)
	while (collectdata){
	    valid = true;
	    animalname = getParam("Animal name:");
	    try {
		if (animalname.equals("EXTERMINATE")) {
		    throw new NumberFormatException(); //suppress the dialog for count if the exit phrase has been entered
		}
		wildcount = Integer.parseInt(getParam("# left in wild:"));
		if (wildcount < 0){
		    throw new NumberFormatException();
		}
	    } catch (NumberFormatException e) {
		valid = false; //check for invalid counts of animals (NaN, negative values etc..) also used to cancel the number collection dialog when the exit phrase is entered
	    }
	    if (animalname.equals("EXTERMINATE")) {
		// exiting, get the least endangered animal and spit it out
		    collectdata = false;
		    valid = false;
		    String least = leastEndangered(animals);
		    showMessage("The least endangered animal is the " + least + " with " + animals.get(least) + " of them left in the wild.");
	    }
	    if (valid){
		// register the animal if valid, warn the user and discard if invalid
		if (animals.containsKey(animalname)) {
		    animals.put(animalname, animals.get(animalname) + wildcount);
		} else {
		    animals.put(animalname, wildcount);
		}
	    } else if (collectdata) {
		showMessage("Invalid entry, please try again");
	    }
	}
	System.exit(0);
    }
    public static String getParam (String prompt){
	/** Helper function for getting input from the user. 
	    Takes String prompt as argument and returns user input as String**/
	String response = JOptionPane.showInputDialog(prompt);
	return response;
    }
    public static void showMessage (String prompt){
	/** Helper function for displaying content to the user.
	    Takes a String prompt as argument, no return.**/
	JOptionPane.showMessageDialog(null, prompt);
    }
    public static String leastEndangered (HashMap<String, Integer> hm){
	/**
	   V basic sorting algorithm that finds the top value in the set of keys
	   1. Get the first key and set that as your top value
	       loop{
	        2. Get the next key and compare it with the top value
		3. If the next key is higher than the top value then set next = top
		4. Get the next key from the iterator and repeat until no more keys are available
		}
	   the variable 'top' now contains the key with the highest corresponding value in the hashmap hm
	   5. return top
	 **/
	String top = "";
	String next;
	HashMap.Entry<String, Integer> i; // the iterator returns an Entry object that is part of the hashmap. Entry looks like a single row of the hashmap with 1 key val pair
	Iterator iter = hm.entrySet().iterator(); //create iterator object. hashmap is unordered so cannot loop using size and an index
	while (iter.hasNext()){
	    i = (HashMap.Entry) iter.next(); /** get the next entry into the i variable. 
						 (HashMap.Entry) tells java to explicitly cast iter.next() [Type: Object] to the [Type: HashMap.Entry] that the i variable expects
					     **/
	    next = i.getKey();
	    if (top.isEmpty()){
		top = next;
	    } else {
		if (i.getValue() > hm.get(top)) {
		    top = next;
		}
	    }
	}
	return top;
    }
}
