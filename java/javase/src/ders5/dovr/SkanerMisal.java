package ders5.dovr;

import java.util.Scanner;

public class SkanerMisal {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("cevrenin radiusunu yaz");
		double radius = s.nextDouble();
		double u = 2 * 3.214 * radius;
		System.out.println("cevrenin uzunu = " + u);
	
		
		
	}

}
