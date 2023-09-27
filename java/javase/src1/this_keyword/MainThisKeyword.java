package this_keyword;

public class MainThisKeyword {

	public static void main(String[] args) {

		Person p1 = new Person();

		p1.printInfo();

		Person p2 = new Person("Adil", "055-555-555");

		p2.printInfo();

		Person p3 = new Person("099");
		p3.printInfo();
	}
}
