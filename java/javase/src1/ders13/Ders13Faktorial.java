package ders13;

public class Ders13Faktorial {

	public static void main(String[] args) {

		int netice = faktorial(5);
		System.out.println(netice);

	}

	static int faktorial(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * faktorial(number - 1);
		}
	}
}
