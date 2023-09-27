package donguler;

public class BreakContinue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
			System.out.println("ilk");
			if (i == 5) {
				continue;
			}
			
			System.out.println(i);
		}
		
		System.out.println("her zaman");
	}
}
