package ders5.dovrler;

import java.util.Scanner;

public class SkanerMisal {
	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("cevrenin radiusunu yaz");
	double radius = s.nextDouble();
	double u = 2 * 3.14 * radius;
	System.out.println("cevrenin uzunu = " + u);
	}

}
