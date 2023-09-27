package ders10.praktika;

public class Praktika2 {
	public static void main(String[] args) {

		int netice = vurma(1, 2, 3, 4);
		System.out.println(netice);

	}

	static int vurma(int a, int b) {
		return a * b;
	}

	static int vurma(int a, int b, int c) {
		return vurma(a, b) * c;
	}

	static int vurma(int a, int b, int c, int d) {
		return vurma(a, b, c) * d;
	}

}
