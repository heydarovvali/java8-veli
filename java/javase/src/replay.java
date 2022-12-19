
public class replay {
	public static void main(String[] args) {
     int eded = 41;
     boolean tipi = true;
     for(int i =2;i<=eded-1;i++) {
    	 if(eded %i==0) {
    		 tipi = false;
    		 break;
    	 }
     }
     if(tipi) {
    	 System.out.println("sadedir");
     }else {
    	 System.out.println("murekkeb eded");
     }
	}

}
