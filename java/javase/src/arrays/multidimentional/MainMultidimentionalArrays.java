package arrays.multidimentional;

public class MainMultidimentionalArrays {

	public static void main(String[] args) {

		int[] array = new int[4];

		int[][] array2 = new int[3][3];
		array2[0][0] = 23;
		array2[0][1] = 12;
		array2[0][2] = 33;

		array2[1][0] = 55;
		array2[1][1] = 77;
		array2[1][2] = 88;
		
		
		array2[2][0] = 11;
		array2[2][1] = 22;
		array2[2][2] = 44;
		
		for(int[] i : array2) {
			for(int j:i) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}

	}

}
