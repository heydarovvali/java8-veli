package lesson9;

public class ClassAndObjectAndConstructors {
	public static void main(String[] args) {

		Computer comp1 = new Computer();
		Computer comp2 = new Computer("Acer");
		Computer comp3 = new Computer("Predator ", "black");

		comp1 = comp2;

		System.out.println(comp2.brand);
		System.out.println(comp3.model + " " + comp3.color);
	}

}
