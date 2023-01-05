package ders8.metodlar;

import java.util.Scanner;

public class Misal3 {

	public static void main(String[] args) {
//		Misal3 m = new Misal3();
//		System.out.println("reqemi daxil et");
//		Scanner rr = new Scanner(System.in);
//		double radius = rr.nextDouble();
//		double d1 =Misal3.hesabla(radius);
//		double d2 =Misal3.hesabla(5);
//		System.out.println("d1 = "+hesabla(radius));
//		System.out.println("d2 = "+d2);
//		rr.close();
		
		
		cemle(2 , 12);
		
	}
	
	
	
	static double hesabla(double radius) {
		double pi = 3.14;
		double uzunlug = 2*pi*radius;
		//System.out.println("cevrenin uzunlugu =" +uzunlug);
		return uzunlug;
	}
	
	
	
	
	static void cemle(int a,int b) {
		int cem = a+b;
		System.out.println("cem = "+cem);
	}
	
	
	
	
}
