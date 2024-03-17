
public class SumRowCol {

	public static void main(String[] args) {
		int[][] numbers = {
				{2,3,5,6},
				{4,6,5,12},
				{8,5,3,7}
		};
		int sum = 0;
		for(int i = 0; i < 4; i++){
			sum = 0;
			for(int j = 0; j < 3; j++) {
				sum += numbers[j][i];
			
			}System.out.println("Sum of columns " + (i +1) + " is " + sum);
		}
		
		 final int ROWS = 4;
	        final int COLUMNS = 4;
	        int[][] values = new int[ROWS][COLUMNS];
	        
	        for (int i = 0; i < ROWS; i++) {
	            for (int j = 0; j < COLUMNS; j++) {
	                System.out.print(values[i][j] + "\t");
	            }
	            System.out.println();
	        }
	}
}