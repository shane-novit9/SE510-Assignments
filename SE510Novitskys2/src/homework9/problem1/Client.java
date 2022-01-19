package homework9.problem1;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		FontDialogDirector director = new FontDialogDirector();
		Scanner in = new Scanner(System.in);
		director.showDialog();
		do {
			System.out.println("Select font(0: No Font Family, 1: Times New Romain, "
											+ "2: Apple Chancery, 3: Arial Black): ");
			int userIn = in.nextInt();
			director.handleUserInput(userIn);
			if (userIn != -1) {
				director.showDialog();
			}
		} while (director.getStatus() != 0);
		in.close();
	}
}
