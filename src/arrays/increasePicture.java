package arrays;

public class increasePicture {
	
	int[][] array = new int[3][3];
	
	public static int[][] magnify(int[][] array, int factor) {
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
	

	public static void main(String[] args) {
		
		int[][] array = {{1, 2, 3},{4, 5, 6}
	        };
	        int factor = 2;

	        int[][] magnifiedArray = magnify(array, factor);

	}

}
