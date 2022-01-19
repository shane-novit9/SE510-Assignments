package homework7.problem1;

public class PhantomBuilder implements Builder{
	private PhantomMaze maze = new PhantomMaze();
	public void buildRoom(int roomId) {
		maze.rooms.add(new PhantomRoom(roomId));		
	}
	public void buildInteriorDoor(int idOfRoom1, char wallOfRoom1, int idOfRoom2, char wallOfRoom2) {
		maze.interiorDoors.add(new PhantomInteriorDoor(idOfRoom1, idOfRoom2));		
	}
	public void buildExteriorDoor(int idOfRoom, char wallOfRoom) {
		maze.exteriorDoors.add(new PhantomExteriorDoor(idOfRoom));		
	}
	public PhantomMaze getMaze() { return maze; }
}
