package methods.pass_by_reference;

public class MyMethods {

	public void calculateSalary(Employee isci) {
		int salary = isci.age * 10;
		isci.salary = salary;
	}

}
