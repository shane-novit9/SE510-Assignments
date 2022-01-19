package homework7.problem1;

public class PhantomInteriorDoor {
	int room1, room2;
	
	public PhantomInteriorDoor(int rm1, int rm2) {
		this.room1 = rm1;
		this.room2 = rm2;
	}
	
	public void demonstrate() { 
	   System.out.println("*********************************");
	   System.out.println("  Phantom Door: between " + 
	              room1 +" and " + room2 +" *");
	   System.out.println("*********************************");
	}
}
