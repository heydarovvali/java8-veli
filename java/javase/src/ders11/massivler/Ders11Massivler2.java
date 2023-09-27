package ders11.massivler;

import java.util.Iterator;

public class Ders11Massivler2 {
	public static void main(String[] args) {

		int[] massiv = new int[10];
		massiv[0] = 5;
		massiv[1] = 7;
		massiv[2] = 8;
		massiv[3] = 1;
		massiv[4] = 9;
		massiv[5] = 77;

		int say = massiv.length;
		int cem = 0;
		for (int i = 0; i < say; i++) {
			cem = cem + massiv[i];
		}
		System.out.println(cem);

	}
}
