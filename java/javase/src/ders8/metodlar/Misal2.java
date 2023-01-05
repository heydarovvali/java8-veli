package ders8.metodlar;

import java.util.Scanner;

public class Misal2 {
	public static void main(String[] args) {
		Misal2 m = new Misal2();
		System.out.println("reqemi daxil et");
		Scanner rr = new Scanner(System.in);
		double radius = rr.nextDouble();
		m.hesabla(radius);
		rr.close();
	}

	void hesabla(double radius) {
		double pi = 3.14;
		double uzunlug = 2 * pi * radius;
		System.out.println("cevrenin uzunlugu = " + uzunlug);
	}
	
	
	
	
	
	
	
	
	
	
	
}
