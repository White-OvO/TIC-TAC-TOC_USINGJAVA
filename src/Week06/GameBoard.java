package Week06;
//Note there is no main because javaTicTacToe already has a main
///////////////////////////////////////////////////////////////////////////////

import java.util.Arrays;

///1. Create a class with a main method -- this Lab can be implemented in just one class.
//				
//				Alternatively, you could create an object with it's own methods. 
//				(e.g. GameBoard.java)

//////////////////////////////////////////////////////////////////////////////

///2. You will need to declare a gameBoard. 
//
//
//

//////////////////////////////////////////////////////////////////////////////
public class GameBoard {

//////////////////////////////////////////////////////////////////////////////

///a. One suggestion is to create an array of length 9 to represent the board:
//
//
//9 spaces avaliable

//////////////////////////////////////////////////////////////////////////////	
	String [] board = new String[9];

//////////////////////////////////////////////////////////////////////////////	
	
//This make the game ready to start the game
//
// initialize game baord for game play
	
//////////////////////////////////////////////////////////////////////////////	
	public void initialize() {
		
//////////////////////////////////////////////////////////////////////////////
		
//creating a for loop to initialize the position of the game board
//one for the move per turn and 9 turns to end the game
//i. Just remember that arrays are 0 based, so to access the grid, 
//							the index would go from 0-8.  

//////////////////////////////////////////////////////////////////////////////		
	
		for(int i = 1; i <= 9; i++) {
//////////////////////////////////////////////////////////////////////////////

//set postion to the array for the value
//			
//
			this.board[i-1] = String.valueOf(i);
				
//////////////////////////////////////////////////////////////////////////////
		
		}
}

//////////////////////////////////////////////////////////////////////////////
	
//method to display gameboard
//display() -- to print the gameBoard
//These are boarders
	//constance of the array

//////////////////////////////////////////////////////////////////////////////
	
	public void display() {
		System.out.println("     +---+---+---+");
		System.out.println("     | " + this.board[0] + " | " + this.board[1] + " | " + this.board[2] + " | ");
		System.out.println("     +---+---+---+");
		System.out.println("     | " + this.board[3] + " | " + this.board[4] + " | " + this.board[5] + " | ");
		System.out.println("     +---+---+---+");
		System.out.println("     | " + this.board[6] + " | " + this.board[7] + " | " + this.board[8] + " | ");
		System.out.println("     +---+---+---+");


		
	}
	
	public boolean ifValidSetSquare(int squareNumber, String readInput, String player)  {
		if (this.board[squareNumber-1].equals(readInput)) {
			this.board[squareNumber-1] = player;
			return true;
			
	}else { 
		return false;
		
	}
	
	
	}
// three x's or three O's = winner
	public String checkWinStatus() {
			for(int pos = 0; pos < 8; pos++) {
				String winningCombo = "";
				
				
				switch (pos) {
					case 0:
						winningCombo = this.board[0] + this.board[1] + this.board[2];
							break; 
					case 1:
						winningCombo = this.board[3] + this.board[4] + this.board[5];
							break;
					case 2:
						winningCombo = this.board[6] + this.board[7] + this.board[8];
							break;
					case 3:
						winningCombo = this.board[0] + this.board[3] + this.board[6];
							break;
					case 4:
						winningCombo = this.board[1] + this.board[4] + this.board[7];
							break;
					case 5:
						winningCombo = this.board[2] + this.board[5] + this.board[8];
							break;
					case 6:
						winningCombo = this.board[0] + this.board[4] + this.board[8];
							break;
					case 7:
						winningCombo = this.board[2] + this.board[4] + this.board[6];
							break;
				
				
				}
				if (winningCombo.equals("XXX")) {
					return "X";
				} else if (winningCombo.equals("000")) {
					return "0";
				}
			}
		
	for (int pos = 1; pos <= 9; pos++) {
		if (Arrays.asList(this.board).contains(String.valueOf(pos))) {
			break;
		}else if (pos == 9) { //checks if we are the final opposition and if so we will return "draw" 
			return "draw" ;
			
		}
	}
	return "";
	
	}
}

