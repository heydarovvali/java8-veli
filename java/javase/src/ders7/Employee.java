package ders7;

public class Employee {
	int id;
	String name;
	String surname;
	String phone;
	//String address;
	int salary;

	Employee() {
		System.out.println("default");
	}

	Employee(String name) {
		System.out.println(name);
		this.name = name;
	}

	Employee(String name, String surname) {
		System.out.println(name + surname);
		this.name = name;
		this.surname = surname;

	}

	Employee(String name, String phone, int salary) {

		System.out.println(name + phone + salary);
		this.name = name;
		this.phone = phone;
		this.salary = salary;
	}

}
