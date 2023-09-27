package ders12;

public class Ders12_SadeleriTapmaEV {

	public static void main(String[] args) {

		int[] numbers2 = { 5, 12, 14, 8, 99, 22, 66, 71, 32, 11 };
		System.out.println("butun massivler");
		for (int i : numbers2) {
			System.out.print(i + ", ");
		}

		int tekSay = 0;
		int cutSay = 0;

		for (int i = 0; i < numbers2.length; i++) {
			if (numbers2[i] % 2 == 0) {
				cutSay++;
			} else {
				tekSay++;
			}
		}

		System.out.println("\n" + "\n" + cutSay + (" cut") + "," + tekSay + (" tek"));
		int[] tekler = new int[tekSay];
		int[] cutler = new int[cutSay];

		int t = 0;
		int c = 0;
		
		System.out.println();


		for (int i = 0; i < numbers2.length; i++) {
			if (numbers2[i] % 2 == 0) {
				cutler[c] = numbers2[i];
				c++; // ?
			} else {
				tekler[t] = numbers2[i];
				t++;// ?
			}
		}
		System.out.println("cutler massivi");
		for (int i : cutler) {
			System.out.println(i + ", ");
		}

		System.out.println("");
		System.out.println("tekler massivi");
		for (int i : tekler) {
			System.out.println(i + ", ");
		}

		System.out.println("");

	}

}
