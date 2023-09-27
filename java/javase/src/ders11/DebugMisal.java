package ders11;

public class DebugMisal {

	public static void main(String[] args) {
		System.out.println("main basladi");//breakpoint
		boolean hasHome = true;
		boolean hasDebt = true;
		boolean hasCar = false;

		if (hasDebt) {
			hasHome = true;
		} else {
			hasCar = true;
		}
		if (hasHome) {
			System.out.println("evin var");
		}
		if (hasCar) {
			System.out.println("masinin var");
		}
		if (hasDebt) {
			System.out.println("borcun var");
		}
		System.out.println("main bitdi");
	}
}
