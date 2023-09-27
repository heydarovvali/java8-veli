package super_keyword;

public class Car {

	int currentSpeed;
	int maxSpeed;
	boolean running;

	Car(boolean running) {
		currentSpeed = 10;
		maxSpeed = 240;
		this.running = true;

	}

	void start() {
		System.out.println("masin ise dusdu");
	}

	void stop() {
		System.out.println("masin dayandi");
	}
	Car(){
		
	}
}
