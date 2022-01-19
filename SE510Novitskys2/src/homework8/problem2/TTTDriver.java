package homework8.problem2;

import java.util.Scanner;

public class TTTDriver {
	
	public static void main(String[] args) {
		
		Subject game = new TTTGame();
		Observer state = new TTTStateObserver();
		Scanner s = new Scanner(System.in);
		int turn = 0;
		int p1X, p1Y, p2X, p2Y;
		
		greet();
		game.attach(state);
		boolean gameOver = false;
		
		do {
			System.out.println("Player one enter your row number: ");
			p1X = s.nextInt();
			System.out.print("Enter your column number: \n");
			p1Y = s.nextInt();
			if (p1X < 3 && p1Y < 3) { // Prevents array index out of bounds
				game.placeStone('X', p1X, p1Y);
			}
			System.out.println("Player two enter your row number: ");
			p2X = s.nextInt();
			System.out.print("Enter your column number: \n");
			p2Y = s.nextInt();
			if (p2X < 3 && p2Y < 3) { // Prevents array index out of bounds
				game.placeStone('O', p2X, p2Y); 
			}
			turn+=2;
			if (turn == 2) { // Add statistic watcher
				game.attach(new TTTStatObserver()); 
			}
			if (turn == 8) { // On turn 8 detach state observer and set winner to update StatObserver
				game.detach(state);
				System.out.println("Final stats:\n");
				game.setWinner('X');
				gameOver = true;
			}
		} while (!gameOver);
		
		s.close();
	}
	
	public static void greet() {
		System.out.println("----------------------");
		System.out.println("Welcome to Tic-Tac-Toe");
		System.out.println("----------------------\n");
	}
}
