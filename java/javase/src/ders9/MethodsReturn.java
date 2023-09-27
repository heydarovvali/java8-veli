package ders9;

public class MethodsReturn {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();

		int g = c1.average(35, 45);
		int g1 = c2.average(15, 25);

		System.out.println(g);
		System.out.println(g1);

	}
}
