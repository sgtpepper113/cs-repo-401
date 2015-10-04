 /* BMI Calculator - Michael Earl 29/09/15 */
import javax.swing.*;



class bmicalc {
    public static void main (String[] param){
	Integer w = Integer.parseInt(getParam("How much do you weigh in kg?: "));
        Integer h = Integer.parseInt(getParam("How tall are you in cm?: "));
	System.exit(0);
    }
    /** 
	getBmi - calculate a BMI figure based on a weight and height
	@param weight Integer weight in KG for calculating BMI
	@param height Integer height in cm for calculating BMI
    **/
    public static void getBmi (Integer weight, Integer height){
	Integer bmi = weight / ((height * height) / 10000);
	JOptionPane.showMessageDialog(null, 
				      "Your BMI is: " + Integer.toString(bmi)
				      );
    }
    public static String getParam (String prompt){
	String response = JOptionPane.showInputDialog(prompt);
	return response;
    }
}
