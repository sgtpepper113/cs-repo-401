 /* Print my initials to the screen - Michael Earl 29/09/15 */


class initials {
    public static void main (String[] param){
	putInitials();
	System.exit(0);
    }
    public static void putInitials (){
	System.out.println("    M    M");
	System.out.println("   M M  M M");
        System.out.println("  M   MM   M");
	System.out.println("  M        M");
	System.out.println(" M          M");
	System.out.println(" M          M");
	/* Now for the E - print a blank line first... */
	System.out.println("");
	System.out.println(" EEEEEEEEEEEE");
	System.out.println(" E");
	System.out.println(" EEEEEEEEEE");
	System.out.println(" E");
	System.out.println(" EEEEEEEEEEEE");
	String ANSI_CLS = "\u001b[2J\n";
	System.out.print(ANSI_CLS);
    }
}
