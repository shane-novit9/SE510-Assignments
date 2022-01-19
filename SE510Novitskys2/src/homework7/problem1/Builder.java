package homework7.problem1;

public interface Builder {
	void buildRoom(int roomId);
	void buildInteriorDoor(int idOfRoom1, char wallOfRoom1, int idOfRoom2, char wallOfRoom2);
	void buildExteriorDoor(int idOfRoom, char wallOfRoom);
}
