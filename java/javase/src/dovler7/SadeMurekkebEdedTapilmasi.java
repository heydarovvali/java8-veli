package dovler7;

public class SadeMurekkebEdedTapilmasi {
	public static void main(String[] args) {
		   
           int eded = 12;
           boolean sadedir = true;
           for(int i = 2; i<=eded-1; i++) {
        	   if(eded % i == 0) {
        		   sadedir = false;
        		   break;
        	   }
           }
           if(sadedir) {
        	   System.out.println("sadeymis");
           }else {
        	   System.out.println("murekkebdir");
           }
	}

}
