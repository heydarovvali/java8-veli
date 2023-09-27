package arrays.varargs;

public class MainVarArgsExample {

	public static void main(String[] args) {

		int i = sum(4, 5, 9, 2, 7); // sum metoduna bu deyerleri gonderdiyimiz zaman eslinde java bu deyerler int
									// tipinde oldugu ucun int massivi yaradir ve adini ozu qoyur ve bu deyerleri
									// ora yerlesdirir ve sonra hemin massivi bura gonderir.
		System.out.println(i);

	}

	static int sum(int... i) {
		// int[] array = {4,5,9,2,7};// yeni bunu yaradir

		int result = 0;
		for (int a : i) {
			result += a;

		}
		return result;
	}
//	static int sum(int a, int b) {
//		int result = 0;
//		result = a + b;
//		return result;
//	}
//
//	static int sum(int a, int b, int c) {
//		int result = 0;
//		result = a + b + c;
//		return result;
//	}

}
