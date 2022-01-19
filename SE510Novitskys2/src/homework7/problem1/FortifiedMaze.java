package homework7.problem1;

import java.util.*;

public class FortifiedMaze {
	public ArrayList<FortifiedRoom> rooms 
			= new ArrayList<FortifiedRoom>();
	public ArrayList<FortifiedInteriorDoor> interiorDoors 
			= new ArrayList<FortifiedInteriorDoor>();
	public ArrayList<FortifiedExteriorDoor> exteriorDoors 
			= new ArrayList<FortifiedExteriorDoor>();

	public void show() {
	   for (FortifiedRoom room: rooms) {
	      room.demonstrate();
	   }
	   for (FortifiedInteriorDoor door: interiorDoors) {
	      door.demonstrate();
	   }
	   for (FortifiedExteriorDoor door: exteriorDoors) {
	      door.demonstrate();
	   }
	}
}
