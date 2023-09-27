package random_numbers;

import java.util.Random;

public class MainRandomNumbers {
	public static void main(String[] args) {

		Random r = new Random();
		int i = r.nextInt();
		int i2 = r.nextInt(6)+1; // 0,1,2,3,4,5,6  bound 1,2,3,4,5,6
		System.out.println(i2);
		
		r.nextInt(5, 12); // 5,6,5,7,8,9,10,11 int origin, int bound
        
		
		
	}
}
