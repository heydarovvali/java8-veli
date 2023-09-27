package super_keyword;

public class Mercedes extends Car {

	void startMercedes() {
		System.out.println("startMercedes");
		super.start();
		super.maxSpeed = 400;
	}

	Mercedes() {
		super(true);
	}

	Mercedes(int a) {
		
		
		

	}

}
