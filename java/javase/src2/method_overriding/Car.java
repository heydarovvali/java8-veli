package method_overriding;

public class Car {
	public B start() {
		System.out.println("masin getmeye baslayir");
		B b = new B();
		return b;
	}
}
