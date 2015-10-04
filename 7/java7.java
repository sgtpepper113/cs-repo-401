/**
Michael Earl - Car price calculator program - 30/09/2015

Calculate the price of car factoring in chosen options and discounts
**/
import javax.swing.*;

class carcalc {
    public static void main (String[] param){
	Boolean electric;
	Boolean solar;
	Integer discount;
	Integer total;
	// collect details about the car and calculate a price
	while(true){
	    electric = isElectric();
	    solar = isSolar();
	    discount = getDiscount(electric, solar);
	    total = getPrice(electric, solar, discount);
	}
    }
    public static Boolean isElectric (){
	// Check if electric or hybrid was chosen. return true for electric, false for hybrid
	Boolean collecting = true;
	Boolean result = false;
	String choice;
	while(collecting){
	    choice = getParam("Hybrid or Electric");
	    if (choice.equals("Hybrid") || choice.equals("hybrid")){
		result = false;
		collecting = false;
	    } else if (choice.equals("Electric") || choice.equals("electric")){
		result = true;
		collecting = false;
	    } else {
		showMessage("Invalid choice, please try again");
	    }
	}
	return result;
    }
    public static Boolean isSolar (){
	// Check if solar was chosen. return true for solar, false for no solar
	Boolean collecting = true;
	Boolean result = false;
	String choice;
	while(collecting){
	    choice = getParam("Solar panel? (Yes/No)");
	    if (choice.equals("Yes") || choice.equals("yes") || choice.equals("Y") || choice.equals("y")){
		result = true;
		collecting = false;
	    } else if (choice.equals("No") || choice.equals("no") || choice.equals("N") || choice.equals("n")){
		result = false;
		collecting = false;
	    } else {
		showMessage("Invalid choice, please try again");
	    }
	}
	return result;
	
    }
    public static Integer getDiscount(Boolean electric, Boolean solar){
	// return 500 if electric and solar options chosen, otherwise return 0
	if (electric && solar){
	    return 500;
	} else {
	    return 0;
	}
    }
    public static Integer getPrice(Boolean electric, Boolean solar, Integer discount){
	// based on the options selected for the car, calculate a price including any discount. Print a summary to the screen
	final Integer BASEPRICE = 20000;
	final Integer ELECTRICPRICE = 2000;
	final Integer SOLARPRICE = 5000;
	Integer total = BASEPRICE;
	String summary = "Base price:" + BASEPRICE + "\n";
	if (electric){
	    total = total + ELECTRICPRICE;
	    summary = summary + "Electric model:" + ELECTRICPRICE + "\n";
	}
	if (solar){
	    total = total + SOLARPRICE;
	    summary = summary + "Solar model:" + SOLARPRICE + "\n";
	}
	total = total - discount;
	if (discount > 0){
	    summary = summary + "Discount:" + discount + "\n";
	}
	summary = summary + "\nTotal:"+total;
	showMessage(summary);
	return total;	    
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
