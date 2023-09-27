package this_keyword;

public class Person {

	int age;
	String name;
	String phone;

	void printInfo() {
		
		System.out.println("name : "+this.name);
		System.out.println("age : "+this.age);
		System.out.println("phone : "+this.phone);
		System.out.println("-------------");
		
	}

	void m1() {

	}

	public Person() {
		this("055-050");
	}

	public Person(String phone) {
		this("Hesen", phone);

	}

	public Person(String name, String phone) {
		this(14, name, phone);

	}

	public Person(int age, String name, String phone) {
		this.age = age;
		this.name = name;
		this.phone = phone;
	}
}
