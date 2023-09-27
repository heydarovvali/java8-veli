package polymorphism;

public class Kia extends Car implements I {
	int speed = 20;
	@Override
	public void driving() {
		System.out.println(" i am kia");
	}

	@Override
	public void m1() {

		System.out.println("kia m1");
	}
}
