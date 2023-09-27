package recursiya;

public class MainRekursiya {

	public static void main(String[] args) {
		MainRekursiya mr = new MainRekursiya();
		mr.m(8);

	}

	void m(int i) {
		if (i == 5) {
			System.out.println(i);
		} else {
			m(5);
			System.out.println("else");
		}
	}
}	
