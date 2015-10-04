/**
Michael Earl - Bird recording program - 30/09/2015

**/

import javax.swing.*;

class birdwatch {
    public static void main (String[] param){
	Boolean recording = true;
	final String[] nameArray = {"Blue Tit",
				    "Blackbird",
				    "Robin",
				    "Wren",
				    "Greenfinch"}; //initialise the array of bird names
	Boolean[] resultsArray = {false,
				  false,
				  false,
				  false,
				  false}; //set up the results array with false values
	Integer choice = 100; //100 is the special code to quit
	final String recordPrompt = "Choose a bird or type 100 to quit:\n1: Blue Tit\n2: Blackbird\n3: Robin\n4: Wren\n5: Greenfinch";

	// loop for collecting values
	while (recording){
	    try {
		choice = Integer.parseInt(getParam(recordPrompt));
		if (choice < 1 || (choice > nameArray.length && choice != 100)){
		    throw new NumberFormatException();
		}
		if (choice != 100){
		    resultsArray = recordBird(resultsArray, choice);
		} else {
		    showMessage(buildResults(resultsArray, nameArray));
		    recording = false;
		}
	    } catch (NumberFormatException e) {
		showMessage("Invalid selection, please try again!"); // handle invalid values, 0, <0, >5
	    }
	}
	System.exit(0);
    }
    public static Boolean[] recordBird (Boolean[] resultsArray, Integer choice){
	// set the array index corresponding to the chosen bird to true - records a sighting of a bird
	resultsArray[choice-1] = true;
	return resultsArray;
    }
    public static String buildResults(Boolean[] resultsArray, String[] nameArray){
	// construct the results summary string for printing to the screen
	String result = "Your results:\n";
	for (int i=0;i < resultsArray.length; i++){
	    result = result + (i+1) + ":" + nameArray[i] + "     " + (resultsArray[i] ? "Yes" : "No") + "\n";
	}
	return result;
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
}
