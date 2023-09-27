package primitiv_and_reference_difference;

public class MainPrimitivAndReferenceDifference {
	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.speed = 100;
		Car kia = bmw;
		kia.speed = 200;
		System.out.println(bmw.speed);

	}
}
