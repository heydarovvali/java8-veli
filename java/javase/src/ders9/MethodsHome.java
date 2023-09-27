package ders9;

public class MethodsHome {
	public static void main(String[] args) {
		MethodsHome mh = new MethodsHome();
	   mh. printNumbers(5, 15);
	}

	static void printNumbers(int begin, int end) {
		for (int i = begin; i <= end; i++) {
			System.out.println(i);
		}
	}

}
