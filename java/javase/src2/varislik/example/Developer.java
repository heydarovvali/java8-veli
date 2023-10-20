package varislik.example;

public class Developer extends Person {
	double salary;

	void printInfo() {
		super.printInfo();
		System.out.println("salary : " + salary);
	}
}
