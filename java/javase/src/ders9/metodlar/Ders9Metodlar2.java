package ders9.metodlar;

public class Ders9Metodlar2 {
	public static void main(String[] args) {
		Ders9Metodlar2 o = new Ders9Metodlar2();
		double d = o.kokalti(4);
		System.out.println(d);

	}

	double kokalti(int eded) {
		if (eded < 0) {
			return -1;

		}

		if (eded == 0) {
			return 0;

		}
		double netice = Math.sqrt(eded);
		return netice;
	}
}
