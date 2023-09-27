package recursiya;

public class MainFaktorial {

	public static void main(String[] args) {

		int result = f(5);
		System.out.println(result);
	}

	static int f(int i) {
		if (i == 1) {
			return 1;
		} else {
			return i* f(i - 1); //5 * 4 * 3 * 2 * 1
		}
	}
}
