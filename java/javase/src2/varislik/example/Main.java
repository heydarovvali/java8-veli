package varislik.example;

public class Main {
	public static void main(String[] args) {

		Person p = new Developer();
		p.name = "Adil";
		p.printInfo();
		Developer d = (Developer) p;
		d.salary = 444.0D;
		d.printInfo();

	}
}
