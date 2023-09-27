package encapsulation_example;

public class Person {
	private int age;
	private String name;
	private String surname;
	private String phone;
	private String address;

	// read
	public int getAge() { // bu(getter) deyer qaytarir
		return age;
	}

	// write
	public void setAge(int age) { // bu ise(setter)deyeri menimsedir
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
