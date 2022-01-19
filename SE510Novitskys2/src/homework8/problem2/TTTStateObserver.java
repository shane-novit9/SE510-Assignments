package homework8.problem2;

public class TTTStateObserver implements Observer {
	
	private char[][] state = new char[3][3];
	
	public void update(Subject s) {
		state = s.getBoard();	
		display();
	}
	
	public void display() {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(state[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
