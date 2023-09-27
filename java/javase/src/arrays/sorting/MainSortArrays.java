package arrays.sorting;

public class MainSortArrays {
	public static void main(String[] args) {

		int[] array = { 55, 32, 78, 63, 9, 24 };
		printArray(array);
		for (int j = 1; j <= array.length - 1; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}

			printArray(array);
		}
	}

	static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
