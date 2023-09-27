package arrays_class;

import java.util.Arrays;

public class MainArrayClassExample {

	public static void main(String[] args) {

		int[] array = { 55, 23, 87, 3, 9, 122 };
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.binarySearch(array, 87));

		Arrays.fill(array, 13);
		System.out.println(Arrays.toString(array));

	}

}
