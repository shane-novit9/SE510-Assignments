package homework7.problem1;

import java.util.*;

public class Client {
	public static void main(String args[]) {
	      Scanner scan= new Scanner(System.in);
	      System.out.println("Enter maze type (0: Fortified, 1:Phantom) : ");
	      int mazeType = scan.nextInt();
	      FourRoomDirector frd;
	      if (mazeType == 0) {
	          Builder fortBuild = new FortifiedBuilder();
	          frd = new FourRoomDirector(fortBuild);
	          frd.startBuilding();
	          FortifiedMaze finalMaze = ((FortifiedBuilder)fortBuild).getMaze();
	          finalMaze.show();
	      }
	      else if (mazeType == 1) {
	          Builder phanBuild = new PhantomBuilder();
	          frd = new FourRoomDirector(phanBuild);
	    	  frd.startBuilding();
	    	  PhantomMaze finalMaze = ((PhantomBuilder)phanBuild).getMaze();
	    	  finalMaze.show();
	      }
	      else {
	          System.out.println("invalid type");
	      }
	      scan.close();
    }
}
