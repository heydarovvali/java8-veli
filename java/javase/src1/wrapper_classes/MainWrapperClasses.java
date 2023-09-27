package wrapper_classes;

public class MainWrapperClasses {

	public static void main(String[] args) {

		int a = 12;
		System.out.println(a);
		
		Integer k = new Integer(12);
		System.out.println(k);
		k.byteValue();
		int b = Integer.parseInt("123");
		System.out.println(b);
		System.out.println(Integer.toHexString(23)); // ?! 23 16-liq say sisteminde 17-e beraberdir
		
	 	int t = Integer.valueOf("101",8); // 8 ustu 2 + 1
	 	System.out.println(t);
		
		boolean j = Boolean.parseBoolean("true");
		System.out.println(j);
		
		
	}

}
