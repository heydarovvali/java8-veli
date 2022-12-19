package dovrler7;

public class SadeEdedTapilmasi {
	
	public static void main(String[] args) {
		
		int eded = 8;
		for(int i = 2;i<=eded-1;i++) {
			if(eded%i==0) {
				System.out.println("sade deyil");
				break;
			}
		}
		 
	}

}
