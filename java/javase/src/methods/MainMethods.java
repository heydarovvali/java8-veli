package methods;

public class MainMethods {

	public static void main(String[] args) {
		System.out.println("main-1");
		System.out.println("main-2");
		MainMethods m = new MainMethods();
		m.sayHello();
		m.sayHello();

		System.out.println("main-3");
		System.out.println("main-4");
	}

	public void sayHello() {
		System.out.println("hello");
	}

}
