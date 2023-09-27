package abstraction_example;

public class MainAbstraction {

	public static void main(String[] args) {
		 
		Car c = new Kia();
		c.start();
		Car r = new Bmw();
		r.start();
		
	}
}
