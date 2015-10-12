import java.util.Random;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import com.googlecode.lanterna;
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
	Integer[][][] players = initPlayers();
	List<String> answers = new ArrayList<String>();
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
    public static String runRules(Integer[][][] players,
				  Integer playerNumber,
				  List<String> answers,
				  String correctAnswer)
    {
	for (int i=0;i < players[playerNumber-1][0].length;i++){
	    switch(players[playerNumber-1][0][i]{
		case 0:
		    break;
		case 1: //Previous answer
		    correctAnswer = answers.get(answers.size() - 1);
		    break;
		case 2:
		    correctAnswer =
		}
	}
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
	/**  
	     Inserts a string into the buffer at the specified row and column


	 **/
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
    public static Integer[][] initPlayers(){
	final Integer PLAYERCOUNT = 4;
	final Integer PLAYERPARAMCOUNT = 2;
	final Integer MAXRULES = 5;
	// set up some keywords representing indexes on the arrays
	final Integer IDXRULES = 0; //index for the rules array
	final Integer IDXSCORE = 1; //index for the score array
	final Integer IDXSCOREVAL = 0; //index for the actual score value in the score array
	final Integer IDXSCOREMLT = 1; //index for the score multiplier in the score array
        Integer players = new Integer[PLAYERCOUNT][PLAYERPARAMCOUNT][MAXRULES];
	for (int p=0;p < PLAYERCOUNT;p++){
	    players[p][IDXSCORE][IDXSCOREVAL] = 0;
	    players[p][IDXSCORE][IDXSCOREMLT] = 1;
	    for (int r=0; r < MAXRULES;r++){
		players[p][IDXRULES][r] = 0;
	    }
	}
	return players;
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
