import java.util.Random;


class boardgame {
    public static void main(String[] param){
	final String CHANCE = "+-----+\n| ? ? |\n|  ?  |\n+-----+";
	final String NORMAL = "+-----+\n|     |\n|     |\n+-----+";
	final String ADDRUL = "+-----+\n|   / |\n| \\/  |\n+-----+";
	final String REMRUL = "+-----+\n| \\ / |\n| / \\ |\n+-----+";
	final String ENDTRN = "+-----+\n| 0 0 |\n| XXX |\n+-----+";
	final String GOSTRT = "+-----+\n| GO  |\n| --> |\n+-----+";
	char[][][] buf = initBuffer();
	Integer[] board = initBoard();
	for (int i=0;i < board.length; i++){
	    String square = NORMAL;
	    switch(board[i]) {
	        case 0: square = NORMAL;
		    break;
	        case 1: square = CHANCE;
		    break;
	        case 2: square = ADDRUL;
		    break;
	        case 3: square = REMRUL;
		    break;
	        case 4: square = ENDTRN;
		    break;
	        case 5: square = GOSTRT;
		    break;
	    }
	    System.out.println(i);
	    System.out.println((i*4) + 10);
	    if (i > 9){
		buf = stringToBuffer(square, buf, 0, 10 + ((i - 9) *3), 9 * 6);
	    }  else {
	    	buf = stringToBuffer(square, buf, 0, 10,i * 6);
	    }
	}
	printBuffer(buf, 0);
	System.exit(0);
    }
    public static Integer[] initBoard(){
	/**
	   Generate a new random board for this game.
	   Board represented by an array with each element containing an integer 
	   corresponding to the square type
	   ID | Square Type | Probability
	   ---+-------------+------------
	   0  | Normal      | 0.5
	   1  | Chance      | 0.1
	   2  | Add rule    | 0.2
	   3  | Remove rule | 0.1
	   4  | End turn    | 0.1
	   5  | GO          | SPECIAL
	 **/
	final Integer BOARDLENGTH = 19;
	Integer[] board = new Integer[BOARDLENGTH];
	Integer sqType;
	Random randgen = new Random();
	
	for (int i=1; i < BOARDLENGTH; i++){
	    double rnd = randgen.nextDouble();
	    if (rnd <= 0.1){
		sqType = 1; //Chance
	    } else if (rnd <= 0.2){
		sqType = 3; //Remove Rule
	    } else if (rnd <= 0.3){
		sqType = 4; //End Turn
	    } else if (rnd <= 0.5){
		sqType = 2; //Add Rule
	    } else {
		sqType = 0; //Normal
	    }
	    board[i] = sqType;
	}
	board[0] = 5; //GO square at the start
	return board;
    }
    public static void printBuffer(char[][][] buffer, Integer bufferId){
	String out = "";
	for (int r=0; r < buffer[bufferId].length; r++){
	    for(int c=0; c < buffer[bufferId][0].length; c++){
		out = out + buffer[bufferId][r][c];
	    }
	    out = out + "\n";
	}
	    System.out.println(out);
    }
    public static char[][][] stringToBuffer(String input,
					    char[][][] buffer,
					    Integer bufferId,
					    Integer startRow,
					    Integer startCol)
    {
	char[][] buf = buffer[bufferId].clone(); //make a local copy of the buffer to work on
	try{
	    String[] rows = input.split("\n");
	    Integer cols;
	    for (int r=0; r < rows.length; r++){
		//
		for (int c=0; c < rows[r].length(); c++){
		    buf[r + startRow][c + startCol] = rows[r].charAt(c);
		}
	    }
	    buffer[bufferId] = buf;
	    return buffer;
	} catch (StringIndexOutOfBoundsException e) {
	    return buffer;
	}
	    
    }
    public static char[][][] initBuffer(){
	/**
	   Initialises a blank buffer array for rendering the game.
	   Returns a 3 dimensional array containing two buffers, each with row and column data
	   Accessed like buffer[bufferId][row][column]
	 **/
	final Integer BUFCOUNT = 2;
	final Integer ROWCOUNT = 50;
	final Integer COLCOUNT = 120;
	char[][][] buffer = new char[BUFCOUNT][ROWCOUNT][COLCOUNT];
	for (int b=0; b < BUFCOUNT; b++){
	    for(int r=0; r < ROWCOUNT; r++){
		for(int c=0; c < COLCOUNT; c++){
		    buffer[b][r][c] = ' ';
		}
	    }
	}
	return buffer;
    }
     

}
