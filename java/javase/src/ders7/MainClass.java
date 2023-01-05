package ders7;

public class MainClass {
	public static void main(String[] args) {

		Person p1 = new Person(9);
		Person p2 = new Person(3, "Adil");

		p1 = p2;
		p1.age = 20;
		p2.age = 40;
		System.out.println(p2.age);
		p1 = null;
		

	}

}
