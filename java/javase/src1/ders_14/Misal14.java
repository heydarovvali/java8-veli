package ders_14;

public class Misal14 {

	public static void main(String[] args) {

		int simvolSayi = 5;
		int say = 0;

		for (int i = 2; i <= simvolSayi; i++) {

			int p = 1;
			for (int j = 1; j <= i; i++) {
				p = p * simvolSayi; //bununlada
				
				//say+=Math.pow(simvolSayi, j); bununlada hesablamaq olur
			}
			
			say+=p;

		}

		System.out.println(say);
	}

}
