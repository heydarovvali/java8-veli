package ders11_massivler_evisi;

public class Ders11MassivlerEvisi {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;
		numbers[3] = 20;
		numbers[4] = 25;

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];

		}

		int length = numbers.length;
		System.out.println("massivin daxilinde olan elementlerin cemi:" + sum);

		double average = sum / length;
		System.out.println("massivin daxilinde olan elementlerin ededi ortasi:" + average);

		int enkicik = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < enkicik)
				enkicik = numbers[i];
		}

		System.out.println("massivin elementlerinden en kiciyi: " + enkicik);

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				System.out.println("massivin elementlerinden tek olanlar: " + numbers[i]);
			}
		}
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println("massivin elementlerinden cut olanlar: " + numbers[i]);
			}
		}

	}
}
