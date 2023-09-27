package ders9;

public class Ders9Metodlar3 {
	public static void main(String[] args) {
		Ders9Metodlar3 o = new Ders9Metodlar3();
		o.printName(-3, "Adil");
	}

	void printName(int count, String name) {
		if(count<=0) {
			System.out.println("Zehmet olmasa musbet yazzz..");
			return; 
		}
		System.out.println("bura catdi");
		for (int i = 1; i <= count; i++) {
			System.out.println(name);
		}
	}

}
