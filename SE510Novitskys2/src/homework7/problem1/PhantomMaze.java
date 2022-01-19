package homework7.problem1;

import java.util.ArrayList;

public class PhantomMaze {
	public ArrayList<PhantomRoom> rooms 
			= new ArrayList<PhantomRoom>();
	public ArrayList<PhantomInteriorDoor> interiorDoors 
			= new ArrayList<PhantomInteriorDoor>();
	public ArrayList<PhantomExteriorDoor> exteriorDoors 
			= new ArrayList<PhantomExteriorDoor>();

	public void show() {
		for (PhantomRoom room: rooms) {
			room.demonstrate();
		}
		for (PhantomInteriorDoor door: interiorDoors) {
			door.demonstrate();
		}
		for (PhantomExteriorDoor door: exteriorDoors) {
			door.demonstrate();
		}
	}
}
