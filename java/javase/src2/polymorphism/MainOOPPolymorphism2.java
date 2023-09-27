package polymorphism;

public class MainOOPPolymorphism2 {
	public static void main(String[] args) {

		Car[] cars = new Car[3];
		cars[0] = new Kia();
		cars[1] = new Ford();
		cars[2] = new Mercedes();

		for (Car car : cars) {
			car.driving();
			System.out.println(car.speed);
		}

		Car c = new Ford();
		c.driving();
		System.out.println(c.speed);
	}
}
