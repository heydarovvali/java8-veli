package lesson9;

public class ClassAndObjectAndConstructors {
	public static void main(String[] args) {
		Computer comp1 = new Computer();
		Computer comp2 = new Computer("Asus");
		Computer comp3 = new Computer("Asus ", "Black");
		
		
		System.out.println("----------");
		
		System.out.println(comp2.model);
		System.out.println(comp3.model + " " + comp3.color);
		
	}

}
