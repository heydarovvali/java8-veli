package class_objects;

public class MainObjectCreating {

	public static void main(String[] args) {

		Car bmw = new Car();
		bmw.color = "green";
		bmw.speed = 220;

		Car kia = new Car();
		kia.color = "red";
		kia.speed = 300;

		System.out.println("Bmw speed = " + bmw.speed);
		System.out.println("Kia speed = " + kia.speed);
	}

}
