package dovler7;

public class SadeMurekkebEdedTapilmasi {
	public static void main(String[] args) {
		   
          int eded = 14;
          boolean sadedir = true;
          for(int i =2;i<=eded-1;i++) {
        	  if(eded % i ==0) {
        		  sadedir = false;
        		  break;
        	  }
          }
          if(sadedir) {
        	  System.out.println("sade ededdir");
          }else {
        	  System.out.println("murekkebdir");
          }
	}

}
