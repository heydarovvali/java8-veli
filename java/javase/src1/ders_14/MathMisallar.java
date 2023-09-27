package ders_14;

public class MathMisallar {

	public static void main(String[] args) {

		double r = 6;
		double u = 2 * Math.PI * r;
		System.out.println(u);

		int g = Math.abs(-9);
		System.out.println(g);

		System.out.println(Math.floor(2.9));

		System.out.println(Math.ceil(2.9));

		System.out.println(Math.round(2.5));

		System.out.println(Math.random());

		System.out.println(Math.pow(2, 3));

		double h = yuvarlaGorek(36.5652539, 3);
		System.out.println(h);

	}

	static double yuvarlaGorek(double eded, int say) {
		eded *= Math.pow(10, say);
		eded = Math.round(eded);
		eded /= Math.pow(10, say);
		return eded;
	}

}
