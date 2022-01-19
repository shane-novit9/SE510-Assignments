package homework7.problem1;

public class PhantomRoom {
	int roomId;
	
	public PhantomRoom(int rmId) {
		this.roomId = rmId;
	}
	
	public void demonstrate() {
	   System.out.println("*******************************");
	   System.out.println("  Phantom Room: " + roomId +"  **");
	   System.out.println("*******************************");
	}
	public int getRoomId() { return roomId; }
}
