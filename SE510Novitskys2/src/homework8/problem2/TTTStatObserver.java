package homework8.problem2;

public class TTTStatObserver implements Observer {
	
	private char winner;
	private char[][] state = new char[3][3];
	
	public void update(Subject s) {
		state = s.getBoard();
		winner = s.getWinner();
		display();
	}
	
	public void display() {
		System.out.println("X: " + getCharCount('X'));
		System.out.println("O: " + getCharCount('O'));
		System.out.println("-: " + getCharCount('-'));
		System.out.println("W: " + winner);
		System.out.println();
	}
	
	public int getCharCount(char c) {
		int charCount = 0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (state[i][j] == c) {
					charCount++;
				}
			}
		}
		return charCount;
	}
}
