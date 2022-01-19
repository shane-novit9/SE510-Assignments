package homework7.problem1;

public class FortifiedBuilder implements Builder {
	private FortifiedMaze maze = new FortifiedMaze();
	public void buildRoom(int roomId) { 
		maze.rooms.add(new FortifiedRoom(roomId)); 
	}
	public void buildInteriorDoor(int idOfRoom1, char wallOfRoom1, int idOfRoom2, char wallOfRoom2) { 
		maze.interiorDoors.add(new FortifiedInteriorDoor(idOfRoom1, idOfRoom2));
	} 
	public void buildExteriorDoor(int idOfRoom, char wallOfRoom) {
		maze.exteriorDoors.add(new FortifiedExteriorDoor(idOfRoom));
	}
	public FortifiedMaze getMaze() { return maze; }
}
