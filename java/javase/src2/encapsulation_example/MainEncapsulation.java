package encapsulation_example;

public class MainEncapsulation {
	public static void main(String[] args) {

		Person p = new Person();
		p.setAge(14);

		System.out.println(p.getAge());
		p.setName("Vali");
		System.out.println(p.getName());
	}
}
