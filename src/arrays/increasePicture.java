package arrays;

public class increasePicture {
	
	int[][] array = new int[3][3];
	
	public static int[][] magnify1(int[][] array, int factor) {
        int zeile = array.length;
        int spalte = array[0].length;

        int newHeight = zeile * factor;
        int newWidth = spalte * factor;

        int[][] magnifiedArray = new int[newHeight][newWidth];

        for (int i = 0; i < newHeight; i++) {
            for (int j = 0; j < newWidth; j++) {
                magnifiedArray[i][j] = array[i / factor][j / factor];
            }
        }

        return magnifiedArray;
    }
	
	//tag::solution[]
	  public static int[][] magnify( int[][] array, int factor ) {
	    int width = array[ 0 ].length;
	    int height = array.length;
	    int[][] result = new int[ height * factor ][ width * factor ];

	    for ( int row = 0; row < result.length; row++ ) {
	      int[] cols = result[ row ];
	      for ( int col = 0; col < cols.length; col++ )
	        cols[ col ] = array[ row / factor ][ col / factor ];
	    }
	    return result;
	  }
	

	public static void main(String[] args) {
		
		int[][] testArray = new int[ 2 ][ 5 ];
	    int[][] result = magnify( testArray, 2 );
	    

	}

}
