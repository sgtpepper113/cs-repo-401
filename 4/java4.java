 /* Interface testing - Michael Earl 29/09/15 */
import javax.swing.*;
import java.util.HashMap;


class interfaces {
    /**
       Collect error rates on a number of participants testing two user interfaces. Records a total error count for each interface
    **/

    public static void main (String[] param){
	HashMap<Integer, Integer> results = new HashMap<Integer, Integer>();
	/** store the results in a hashmap. Count the number of interfaces 
	    using the i variable and the number of participants using the p variable  **/
	for (int i=1; i<3; i++){
	    results.put(i,0);
	    for (int p=1; p<6; p++){
		try {
		    Integer datapoint = Integer.parseInt(getParam("How many mistakes did participant " + p + " make on interface " + i + "?"));
		    if (datapoint < 0){
			throw new NumberFormatException();
		    }
		    results.put(i,results.get(i) + datapoint);
		} catch (NumberFormatException e) {
		    /** Invalid input? E.g cannot be parsed as an integer, or input is negative. 
			no upper limit currently... **/
		    showMessage("Invalid input, please enter positive integers only.");
		    p--;
		}
	    }
	}
	/** spit out the results for each interface and do a quick comparison of difficulty**/
	String msg = " mistakes were made with interface ";
	showMessage(results.get(1) + msg + "1");
	showMessage(results.get(2) + msg + "2");
	if (results.get(1) < results.get(2)){
	    showMessage("Interface 1 was easier to use than interface 2");
	} else if (results.get(1) > results.get(2)){
	    showMessage("Interface 2 was easier to use than interface 1");
	} else {
	    showMessage("Interfaces 1 and 2 were equally difficult to use!");
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
}
