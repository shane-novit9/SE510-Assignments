package homework7.problem1;

public class FortifiedRoom {
	int roomId;
	
	public FortifiedRoom(int rmId) {
		this.roomId = rmId;
	}
	
	public void demonstrate() {
	   System.out.println("*******************************");
	   System.out.println("  Fortified Room: " + roomId +"  **");
	   System.out.println("*******************************");
	}
	public int getRoomId() { return roomId; }
}
