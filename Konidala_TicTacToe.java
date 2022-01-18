package pies;
import java.util.Scanner;
public class Konidala_TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe!");
        System.out.println();
        String[][] board = new String[3][3];
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                board[r][c] = " ";
            }
        }
        String turn = "X";
        boolean playing = true;
        while(playing) {
            System.out.println("It is "+turn+"'s turn!");
            System.out.println();
            printBoard(board);
            makeMove(board, turn);
            if(checkWin(board, turn))
            	playing = false;
            else if(checkTie(board)) {
            	System.out.println("Tie!");
            	playing = false;
            }
            if(turn.equals("X"))
                turn = "O";
            else
                turn = "X";
        }
        printBoard(board);
        System.out.println("Thanks for playing!");
    }
    static void printBoard(String[][] board) {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                System.out.print(board[r][c]);
                if(c < 2)
                    System.out.print(" | ");
            }
            System.out.println();
            if(r < 2)
                System.out.println("---------");
        }
    }
    static void makeMove(String[][] board, String turn) throws ArrayIndexOutOfBoundsException {
    	@SuppressWarnings("unchecked")
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter row (0, 1, or 2): ");
        int row = scan.nextInt();
        System.out.println("Enter column (0, 1, or 2): ");
        int col = scan.nextInt();
        if(board[row][col].equals(" ")) {
            board[row][col] = turn;        
        }
    }
    static boolean checkWin(String[][] board, String turn) {
    	for(int r = 0; r < board.length; r++) {
    		for(int c = 0; c < board[r].length; c++) {
    	        if(board[0][0].equals(turn) && board[0][1].equals(turn) && board[0][2].equals(turn)) {
    	        	System.out.println(turn + " " + "wins!");
    	            return true;
    	        }
    	        else if(board[1][0].equals(turn) && board[1][1].equals(turn) && board[1][2].equals(turn)) {
    	        	System.out.println(turn + " " + "wins!");
      	            return true;
    	        }
    	        else if(board[2][0].equals(turn) && board[2][1].equals(turn) && board[2][2].equals(turn)) {
    	        	System.out.println(turn + " " + "wins!");
      	            return true;
    	        }
    	        else if(board[1][0].equals(turn) && board[1][1].equals(turn) && board[1][2].equals(turn)) {
    	        	System.out.println(turn + " " + "wins!");
      	          	return true;
    	        }
    	        else if(board[0][0].equals(turn) && board[1][1].equals(turn) && board[2][2].equals(turn)) {
    	        	System.out.println(turn + " " + "wins!");
      	            return true;
    	        }
    	        else if(board[0][2].equals(turn) && board[1][1].equals(turn) && board[2][0].equals(turn)) {
    	        	System.out.println(turn + " " + "wins!");
    	        	return true;
    	        }
    	        else if(board[0][0].equals(turn) && board[1][0].equals(turn) && board[2][0].equals(turn)) {
    	        	System.out.println(turn + " " + "wins!");
      	            return true;
    	        }
    	        else if(board[0][1].equals(turn) && board[1][1].equals(turn) && board[2][1].equals(turn)) {
    	        	System.out.println(turn + " " + "wins!");
    	        	return true;
    	        }
    	        else if(board[0][2].equals(turn) && board[1][2].equals(turn) && board[2][2].equals(turn)) {
    	        	System.out.println(turn + " " + "wins!");
    	        	return true;
    	        }
    		}
    	}
    	return false;
    }
    static boolean checkTie(String[][] board) {
    	for(int r = 0; r < 3; r++) {
    		for(int c = 0; c < 3; c++) {
    			if(board[r][c].equals(" ")) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}	
