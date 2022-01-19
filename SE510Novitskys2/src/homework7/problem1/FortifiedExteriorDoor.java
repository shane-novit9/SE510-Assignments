package homework7.problem1;

public class FortifiedExteriorDoor {
	int roomId;
	
	public FortifiedExteriorDoor(int roomId) {
		this.roomId = roomId;
	}
	
	public void demonstrate() { 
	   System.out.println("*********************************");
	   System.out.println("  Fortified Outside Door: from " + 
	              roomId +" to outside  *");
	   System.out.println("*********************************");
	}
}
