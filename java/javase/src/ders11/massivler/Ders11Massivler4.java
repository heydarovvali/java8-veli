package ders11.massivler;

import java.util.Iterator;

public class Ders11Massivler4 {
	public static void main(String[] args) {

		int[] massiv = new int[6];
		massiv[0] = 5;
		massiv[1] = 7;
		massiv[2] = 8;
		massiv[3] = 1;
		massiv[4] = 9;
		massiv[5] = 77;

		m1(massiv);
		int element = sum(4, 5, 6, 1, 4);
		System.out.println(element);

	}

	static void m1(int[] massivim) {
		System.out.println(massivim.length);
	}

	static int sum(int... massivimiz) {
		int cem = 0;
		for (int element : massivimiz) {
			cem += element;
		}
		return cem;

	}

}
