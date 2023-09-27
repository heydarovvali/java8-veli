package metod_function;

public class MetodlarFunksiyalar {

	public static void main(String[] args) {
		System.out.println(f(g(5,3)));
		// f(x)= 5x + 10

	}

	static int f(int x) {
		return 5 * x + 10;
	}

	static int g(int x, int y) {
		return y + 2 * x;
	}

}
