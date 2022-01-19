package homework8.problem2;

public class TTTGame extends Subject {
	
	private char[][] board = new char[3][3];
	char winner;
	
	public TTTGame() {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				board[i][j] = '-';
			}
		} 
	}
	
	public char[][] getBoard() {
		return board;
	}
	
	public void placeStone(char stone, int x, int y) {
		board[x][y] = stone;
		notifyObs(this); 
	}
	
	public void setWinner(char w) {
		winner = w;
		notifyObs(this);
	}
	
	public char getWinner() {
		return winner;
	}
}
