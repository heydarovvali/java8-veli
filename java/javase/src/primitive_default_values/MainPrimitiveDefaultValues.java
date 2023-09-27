package primitive_default_values;

public class MainPrimitiveDefaultValues {
	int salary = 10;
	boolean isDigit;
	char c;

	public static void main(String[] args) {

		int age = 22;
		System.out.println(age);

		int h = 224;// obyekt deyiseni-,local deyisen+
		System.out.println(h);

		MainPrimitiveDefaultValues m = new MainPrimitiveDefaultValues();
		m.salary = 222;
		System.out.println(m.salary);
		System.out.println(m.isDigit);
		System.out.println(m.c);// '\u0000'

	}
}
