package string_pool_exmaple;

public class StringPoolExample {

	public static void main(String[] args) {

		String name = new String("Yusif"); // heap yaddasda saxlanilir
		String name2 = "Yusif"; // string pool yaddasda saxlanilir
		String name3 = "Yusif";
		String name4 = new String("Yusif");
		System.out.println(name2 == name3); // referesn tiplilerde ise solundki olan referensle sagindaki olan
											// referensin yaddasa eyni obyekte bagli oldugunu yoxlayir

		int a = 5;
		int b = 5;
		System.out.println(a == b); // primitivlerde braberlik (beraberliyini yoxlayir)

	}
}
