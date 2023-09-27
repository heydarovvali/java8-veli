package method_overriding;

public class Bmw extends Car {

	// method overriding
	@Override
	public A start() {
		System.out.println("Bmw getmeye baslayir");
		A a = new A();
		B b = new B();
		return a;
	}

	public void startBmw() {
		System.out.println("startBmw");
	}
}
