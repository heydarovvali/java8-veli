
public class MenimsetmeOperatorlari {
	public static void main(String[] args) {
		int i = 23;
		i = 5 + 4;
		System.out.println(i);
		i = 12 - 5;
		System.out.println(i);
		i = 3 * 2;
		System.out.println(i);
		i = 25 % 4;
		System.out.println(i);
		System.out.println(3 % 2);
		i += 12;
		System.out.println(i);
		i %= 4;
		System.out.println(i);

		int dr = 27;
		if (dr % 9 == 0 && dr % 7 == 0) {
			System.out.println("qaliqsiz bolunur");

		} else {
			System.out.println("qaliqla bolunur");
		}

		
		
		for (int x = 100; x <= 200; x++) {

			boolean murekkeb = false;
			for (int q = 2; q <= x/2; q++) {
				if (x % q == 0) {
					murekkeb = true;
					break;
				}
			}
			if (!murekkeb) {
				System.out.println(x + " sadedir");
			}

		}
		
		
		
		
		
		
		
		

	}
}
