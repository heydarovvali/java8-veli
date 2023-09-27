package aggregation_examples;

public class MainAggregationExamples {

	public static void main(String[] args) {

		Computer dell = new Computer();
		dell.brand = "Dell";
		dell.model = "Insprion";
		dell.price = 1000;
		dell.id = 1;
		dell.weight = 3;

		Ram r = new Ram();
		r.brand = "Hitachi";
		r.model = "g44";
		r.size = 24;
		r.id = 4;
		r.price = 80;
		dell.ram = r;

		Cpu c = new Cpu();
		c.id = 3;
		c.model = "core i9";
		c.brand = "Intel";
		c.speed = 4;
		c.price = 300;
		dell.cpu = c;
		
		dell.printInfo();

	}

}
