package constructors;

public class MainConstructors {
	
	public static void main(String[] args) {
		
		Computer hp = new Computer();
		Computer dell = new Computer();
		hp.brand = "HP";
		hp.price = 1200;
		
		System.out.println(dell.price);
		Computer asus= new Computer();
		asus.brand = "Asus";
		System.out.println(asus.brand);
		Computer acer = new Computer();
		acer.brand="Acer";
		System.out.println(acer.brand);
		
		
		// constructor = qurucu	
	}

}
