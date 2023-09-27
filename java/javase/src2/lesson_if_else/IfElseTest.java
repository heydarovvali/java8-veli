package lesson_if_else;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {

//		int bal = -1;
//		if (bal >= 0 && bal <= 51) {
//			System.out.println("imtahandan kesilmisen");
//		} else if (bal >= 51 && bal <= 100) {
//			System.out.println("imtahandan kecmisen");
//		} else if (bal > 100) {
//			System.out.println("reqemi duzgun teyin et");
//		} else {
//			System.out.println("sifirdan kicik yazmisan");
//		}

		Scanner scan = new Scanner(System.in);
		System.out.println("istediyin bir soz daxil et");
	
		
		
		String text = scan.nextLine();
		//String text2 = "sagol";
		if (text.equals("salam")) {
			System.out.println("beraberdir");
		} else {
			System.out.println("beraberdir deyil");
		}

	}

}
