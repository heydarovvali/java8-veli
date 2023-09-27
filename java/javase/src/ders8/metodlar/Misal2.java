package ders8.metodlar;

import java.util.Scanner;

public class Misal2 {
	public static void main(String[] args) {
//		Misal2 m = new Misal2();
//		System.out.println("cevrenin radiusunu daxil et");
//		Scanner ss = new Scanner(System.in);
//		double radius = ss.nextDouble();
//		double d1 = hesabla(radius);
//		double d2 = hesabla(5);
//		System.out.println("d1 = " + d1);
//		System.out.println("d2 = " + d2);
//		// m.hesabla(radius);
//		// m.hesabla(23);
//		ss.close();
		
		double netice= cemle(2,12);
		System.out.println(netice);
	}

	static double hesabla(double radius) {
		double pi = 3.14;
		double uzunlug = 2 * pi * radius;
		// System.out.println("cevrenin uzunlugu = " + uzunlug);
		return uzunlug;
	}

	static double cemle(int a, int b) {
		int cem = a + b;
		//System.out.println("cem = " + cem);
		return cem;
	}

}
