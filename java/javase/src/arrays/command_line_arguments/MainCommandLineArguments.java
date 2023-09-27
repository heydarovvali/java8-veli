package arrays.command_line_arguments;

public class MainCommandLineArguments {
	public static void main(String[] args) {
		
		int[] a = { 12, 8, 33 };
		printArray(a);

	}

	static void printArray(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}
}
