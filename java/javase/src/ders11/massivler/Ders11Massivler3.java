package ders11.massivler;

import java.util.Iterator;

public class Ders11Massivler3 {
	public static void main(String[] args) {

		int[] massiv = new int[6];
		massiv[0] = 5;
		massiv[1] = 7;
		massiv[2] = 8;
		massiv[3] = 1;
		massiv[4] = 9;
		massiv[5] = 77;

		for (int j : massiv) {
			System.out.println(j);
		}

		for (int i = 0; i < massiv.length; i++) {
			System.out.println(massiv[i]);
		}

	}
}
