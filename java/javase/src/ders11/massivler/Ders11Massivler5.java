package ders11.massivler;

import java.util.Arrays;
import java.util.Iterator;

public class Ders11Massivler5 {
	public static void main(String[] args) {

		int[] massiv = new int[6];
		massiv[0] = 5;
		massiv[1] = 7;
		massiv[2] = 8;
		massiv[3] = 1;
		massiv[4] = 9;
		massiv[5] = 77;

		System.out.println("sortdan evvel");
		for (int i : massiv) {
			System.out.println(i);
		}

		Arrays.sort(massiv);
		System.out.println("sortdan sonra");
		for (int i : massiv) {
			System.out.println(i);
		}

		Arrays.fill(massiv, 23);
		System.out.println("fill-den sonra");
		for (int i : massiv) {
			System.out.println(i);
		}

	}

}
