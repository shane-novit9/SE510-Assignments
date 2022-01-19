package homework7.problem1;

public class FourRoomDirector {
	private Builder builder;
	int numOfRooms = 4;
	FourRoomDirector(Builder builder) {
		this.builder = builder;
	}
	public void startBuilding() {
	   for (int i = 0; i < numOfRooms; i++) {
	       builder.buildRoom(i+1);
	   }
	   builder.buildInteriorDoor(1, 'E', 2, 'W');
	   builder.buildInteriorDoor(2, 'S', 4, 'N');
	   builder.buildInteriorDoor(3, 'E', 4, 'W');
	   builder.buildExteriorDoor(1, 'W');
	   builder.buildExteriorDoor(3, 'S');
	}
}
