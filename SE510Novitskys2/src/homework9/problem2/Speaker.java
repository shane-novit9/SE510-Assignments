package homework9.problem2;

public class Speaker {
	void play(String file) {
		System.out.println(file);
	}
	void beeps(int num) {
		System.out.println();
		for (int i=0; i<num; i++) {
			System.out.print("Beep..." );
		}
	}  
}
