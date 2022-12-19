package ders6;

public class Dovrler {
       
	public static void main(String[] args) {
		 
		 int eded = 25251010;
		 int cem = 0;
		 while(eded != 0) {
			 int qaliq = eded%10;
			 cem = cem + qaliq;
			 eded = eded/10;
		 }
		 
		 System.out.println(cem);
		 
	}
	 
}
