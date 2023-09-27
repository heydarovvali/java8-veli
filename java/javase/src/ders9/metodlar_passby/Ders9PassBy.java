package ders9.metodlar_passby;

public class Ders9PassBy {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 16;
		p1.name = "Ayxan";

		Person p2 = new Person();
		p2.age = 24;
		p2.name = "Hesen";

		Ders9PassBy o = new Ders9PassBy();
		o.calculateSalary(p1); // pass by reference
		o.calculateSalary(p2);

		System.out.println("p1 in maasi = " + p1.salary);
		System.out.println("p2 in maasi = " + p2.salary);

		int a = 44;
		o.m1(a);
		System.out.println(a);

	}

	void calculateSalary(Person p) {
		p.salary = p.age * 20;

	}

	void m1(int a) {
		a = 55;
	}
}
