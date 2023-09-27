package lesson9;

public class Computer {
	int id;
	String brand;
	String model;
	String color;

	Computer() {
		System.out.println("default");

	}

	Computer(String model) {
		System.out.println(model);
		this.model = model;

	}

	Computer(String model, String color) {
		System.out.println(model + color);
		this.model = model;
		this.color = color;

	}

}
