package evisioperatorlar;

public class operatorlar {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		System.out.println(a + b);
		System.out.println(a * b);
		
		double pi = 3.14;
		int r = 15;
		double c = 2 * pi * r;
		System.out.println(c);
		
		r = 2;
		double sahe = pi * r * r;
		System.out.println(sahe);
		
		int number = 37;
		number *=3;
		System.out.println(number);
		System.out.println(number % 5);
		
		int x = 36;
		if(x % 3==0 && x % 7==0) {
			System.out.println("qaliqsiz bolunur");
		}
		else {
			System.out.println("birinde qaliqnan birinde qaliqsiz bolunur");
		}
		
	
	}

}
