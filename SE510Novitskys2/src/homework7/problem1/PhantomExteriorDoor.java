package homework7.problem1;

public class PhantomExteriorDoor {
	int roomId;
	
	public PhantomExteriorDoor(int roomId) {
		this.roomId = roomId;
	}
	
	public void demonstrate() { 
	   System.out.println("*********************************");
	   System.out.println("  Phantom Outside Door: from " + 
	              roomId +" to outside  *");
	   System.out.println("*********************************");
	}
}
