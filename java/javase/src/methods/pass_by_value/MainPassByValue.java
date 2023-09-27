package methods.pass_by_value;

public class MainPassByValue {

	public static void main(String[] args) {

		MyMethods m = new MyMethods();
		int a = 20;
		//pass by value
		System.out.println("evvel = " + a);
		m.changeAge(a);
		System.out.println("evvel = " + a);
	}

}
