package oop_inheritance;

public class MainOOPInheritanceExample {

	public static void main(String[] args) {

		A a = new A();
		a.i = 44;
		System.out.println(a.i);
		System.out.println(a.s);
		System.out.println(a.isNew);
		

		B b = new B();
		b.i = 12;
		System.out.println(b.i);
		
		D d = new D();
		d.f=4;
		
	}
}
