package ders9;

public class Methods {
	public static void main(String[] args) {
		Methods m = new Methods();
		m.printName(5, "Adil");

		m.printName(4, "Ayxan");

		m.printName(3, "Cavid");
	}

	 void printName(int count, String name) {
		for (int i = 1; i <= count; i++) {
			System.out.println(name);
		}
	}
}
