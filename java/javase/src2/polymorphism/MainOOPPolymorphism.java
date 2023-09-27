package polymorphism;

public class MainOOPPolymorphism {
	public static void main(String[] args) {

		Car car = new Car();
		car.driving(1);

		I car2 = new Kia(); // upcasting
		car2.m1();
	}
}
