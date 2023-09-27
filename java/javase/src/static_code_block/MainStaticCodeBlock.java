package static_code_block;

public class MainStaticCodeBlock {
	
	static {
		System.out.println("static-1");
	}
	
	static {
		System.out.println("static-2");
		hello();
	}
	
	public static void hello() {
		System.out.println("hello");
	}
	
	
	
	public static void main(String[] args) {
		MainStaticCodeBlock m1 = new MainStaticCodeBlock();
		MainStaticCodeBlock m2 = new MainStaticCodeBlock();
		MainStaticCodeBlock m3 = new MainStaticCodeBlock();
		 
	}
}
