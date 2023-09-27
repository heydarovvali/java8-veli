package aggregation_examples;

public class Computer {
	public int id;
	public String brand;
	public String model;
	public int price;
	public int weight;
	public Ram ram;
	public Cpu cpu;
	public void printInfo() {
		System.out.println("------COMPUTER-------");
		System.out.println("id : "+id);
		System.out.println("brand : "+brand);
		System.out.println("model : "+model);
		System.out.println("price : "+price);
		System.out.println("weight : "+weight);
		
		ram.printInfo();
		cpu.printInfo();
	}

}
