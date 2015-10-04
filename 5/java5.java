 /* Art gallery voting machine - Michael Earl 29/09/15 */
import javax.swing.*;


class vote {
    /**
       Collect votes on four different paintings
    **/

    public static void main (String[] param){
	// The following arrays are used in a way that keeps the index number consistent from array to array.
	// votecount[0], titles[0] and options[0] all refer to the same painting.
	Integer[] votecount = {0,0,0,0};
	final String[] titles = {"Mona Lisa", "Water Lilies", "The Scream", "A Young Rembrandt"};
	final String[] options = {"A","B","C","D"}; // Array containing A,B,C and D, the valid options for the vote.
	String prompt = "Vote for your favourite!\n";
	//build the voting prompt containing the titles and their corresponding options
	for (int i=0; i < titles.length; i++){
	    prompt = prompt + "Vote " + options[i] + " for " + titles [i] + "\n";
	}
	Boolean collectvotes = true;
	String vote;
	Boolean validvote;
	// our voting loop. Keeps requesting votes until collectvotes == false (set when you vote the special code 0)
	while (collectvotes){
	    validvote = false;
	    showMessage(prompt);
	    vote = getParam("Cast your vote (A, B, C or D):");
	    try {
		if (Integer.parseInt(vote) == 0){
		    
		    collectvotes = false;
		}
	    } catch (NumberFormatException e) {}
	    for (int n=0; n < options.length; n++){
		if (vote.equals(options[n])){
		    votecount[n]++;
		    validvote = true;
		}
	    }
	    if (!validvote && collectvotes){
		showMessage("Invalid vote - please try again.");
	    }
	    // build the string containing the current results...
	    String results = "The current votes are:\n";
	    for (int z=0; z < titles.length; z++) {
		results = results + votecount[z] + " : " + titles[z] + "\n";
	    }
	    showMessage(results);
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
