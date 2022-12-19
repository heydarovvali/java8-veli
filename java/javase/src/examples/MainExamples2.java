package examples;

public class MainExamples2 {
	public static void main(String[] args) {
		int cem = 0;
		for(int i =1;i<=20;i++) {
			if (i % 3 == 0) {
			 cem += i;
			 System.out.println(i);
			}
		}
		System.out.println(cem);
	}

}
