package polymorphism;

public class Car {
	int speed =10;
	public void driving() {
		System.out.println("i am car");
	}
	
	public void driving(int speed) {
		System.out.println("i am car,my speed is "+speed );
	}
}
