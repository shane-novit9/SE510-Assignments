package homework8.problem2;

import java.util.ArrayList;

public class Subject {
	
	private ArrayList<Observer> list = new ArrayList<Observer>();
	
	public void attach(Observer o) { list.add(o); }
	public void detach(Observer o) { list.remove(o); }
	public void notifyObs(TTTGame g) {
		for (Observer os : list) {
			os.update(g);
		}
	} 
	public char[][] getBoard() { return null; }
	public void placeStone(char stone, int x, int y) {}
	public void setWinner(char w) {}
	public char getWinner() { return 'N'; }
}
