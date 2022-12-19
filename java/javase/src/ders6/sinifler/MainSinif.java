package ders6.sinifler;

public class MainSinif {
	public static void main(String[] args) {
		Home myHome = new Home();
		Home yourHome = new Home();
		
		
		myHome.address = "Gence";
		myHome.color = "red";
		myHome.roomCount = 3;
		
		
		yourHome.address = "Quba";
		yourHome.color = "blue";
		yourHome.roomCount = 6;
		
		System.out.println(myHome.roomCount);
		System.out.println(yourHome.roomCount);
		
	}

}
