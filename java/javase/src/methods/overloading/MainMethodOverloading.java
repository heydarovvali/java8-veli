package methods.overloading;

public class MainMethodOverloading {
	public static void main(String[] args) {
         
		 MainMethodOverloading m = new  MainMethodOverloading();
		 m.sum(1, 2);
		 m.sum("g", 9);
		 
	}
	
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sum(int c,int d,int e) {
		
	}
	
	public void sum(String name,int b) {
		System.out.println(name+b);
		
	}
}


