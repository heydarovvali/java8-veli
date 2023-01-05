package lesson7;

public class Person {
	int id;
	String name;
	String surname;
	int age;
	String phone;

	Person(String name) {
		System.out.println(name);
		this.name = name;
	}
	
	Person(int age){
		System.out.println(age);
		this.age = age;
		
	}

}
