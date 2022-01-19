package homework8.problem1;

public class Image implements Graphics {
	private Color[][] pixels = null;
	private int rows, columns;

	public Image(Color[][] pixels, int rows, int columns) {
	   this.pixels = pixels;
	   this.rows = rows;
	   this.columns = columns;
	}

	public void draw() {
	   for (int i = 0; i < rows; i++) {
		  System.out.print("| ");
	      for (int j = 0; j < columns; j++) {
	         System.out.print(pixels[i][j].color + " | ");
	      }
	      System.out.println();
	   }
	   System.out.println("Hashcode: " + this.hashCode() + "\n");
	}

	public void changeColor(Point point, Color color) {
	    pixels[point.x][point.y] = color;
	}

	public Image clone() {
	    // create a new Image with a deep copy of the 
	    // 2D pixel array
		Color[][] temp = new Color[rows][columns];
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				temp[i][j] = pixels[i][j];
			}
		} 
	    return new Image(temp, rows, columns); 
	}
}