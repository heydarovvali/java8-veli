package shert.operatoru;

import java.util.Scanner;

public class ShertOperatorlari {

	public static void main(String[] args) {

		System.out.println("zehmet olmasa balinizi daxil edin");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		if (i >= 90) {
			System.out.println("baliniz AA");
		} else if (i >= 80) {
			System.out.println("baliniz BB");
		} else if (i >= 70) {
			System.out.println("baliniz CC");
		} else {
			System.out.println("baliniz FF");
		}
	}
}
