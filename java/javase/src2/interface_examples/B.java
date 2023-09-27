package interface_examples;

public interface B {
	void m1(); // public vw abstracdit yazmasaqda

	int h = 9; // biz yazmasaqda interfacenin icinde yaradilan deyisen avtomatik public static
				// ve
				// final olur

	default void m2() {
		System.out.println("m2");
		m5();
	}
	
	

	public static void m3() {
		System.out.println("m3 - static metod");
		m4();
	}
	
	

	private static void m4() {
		System.out.println("m4");
	}
	
	

	private void m5() {
		System.out.println();
	}

}
