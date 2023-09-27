package methods.pass_by_reference;

public class MainPassByReference {
	public static void main(String[] args) {
		Employee isci = new Employee();
		isci.age = 20;
		isci.name = "Ayxan";

		MyMethods m = new MyMethods();

		System.out.println("evvel - " + isci.salary);
		m.calculateSalary(isci);
		System.out.println("sonra - " + isci.salary);
	}

}
