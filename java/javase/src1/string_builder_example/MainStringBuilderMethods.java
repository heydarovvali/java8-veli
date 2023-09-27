package string_builder_example;

public class MainStringBuilderMethods {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		System.out.println("capasity : " + sb.capacity()); // capasity bu o demekdirki stringBuilderin icinde 16
															// simvolluq bos yer var
		// ve setir elave edende davami elave olacaq

		System.out.println("isEmpty : " + sb.isEmpty()); // bos olub olmadigini qaytarir
		System.out.println("value : " + sb);
		sb.append(false);
		System.out.println("value : " + sb);
		System.out.println("capasity : " + sb.capacity());
		System.out.println("isEmpty : " + sb.isEmpty());
		char[] charArray = { 'A', 'B', 'C', 'D', 'E' };
		sb.append(charArray, 2, 2);
		System.out.println("value : " + sb);
		sb.append("Programming", 3, 7);
		System.out.println("value : " + sb);
		System.out.println(sb.charAt(3));
		System.out.println(sb.length());
		System.out.println("capasity : " + sb.capacity());
		sb.delete(3, 5);
		System.out.println("value : " + sb);
		sb.insert(3, false);
		System.out.println("value : " + sb);
		sb.replace(3, 7, "Python");
		System.out.println("value : " + sb);
		sb.reverse();
		System.out.println("value : " + sb);
		sb.setCharAt(2, 'A');
		System.out.println("value : " + sb);
		sb.setLength(10);
		System.out.println("value : " + sb);
		System.out.println(sb.subSequence(3, 6));
		sb.subSequence(3, 6);
		System.out.println("value : " + sb);
		// StringBuffer
		
		

	}
}
