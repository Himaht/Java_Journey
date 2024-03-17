
public class twodMaxRowCol {

	public static void main(String[] args) {
		int[][] numbers = {
				{2,3,5,6},
				{4,6,5,12},
				{8,5,41,7}
		};
		
		for(int i = 0; i < 4; i++) {
			int large = numbers[0][i];
			for(int j = 1; j < 3; j++) {
				if(numbers[j][i] > large) {
					large = numbers[j][i];
				}
				//System.out.println("Row : " + (i +1) + large);
			}System.out.println("col : " + (i + 1) + " is " + large);
		}
	}

}
