package string_builder_example;

public class MainStringBuilderExample {

	public static void main(String[] args) {
//		String s = "";
//		System.out.println("begin");
//		for (int i = 0; i <= 10_000; i++) {
//			s = s + "Java";
//
//		}
//
//		System.out.println("end");
		
		StringBuilder sb = new StringBuilder("");
		System.out.println("begin");
		for (int i = 0; i <= 100_000_000; i++) { // 
			sb = sb.append("Java");

		}

		System.out.println("end");
	}
}
