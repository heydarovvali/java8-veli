package string_class_examples;

import java.util.Arrays;

public class StringClassExamples {

	public static void main(String[] args) {
		// basqa tipli deyerleri setire cevirmek
		String s = "Java programming language is good programming language";

		int i = 123;
		String a = "" + i;
		System.out.println(a);
		double d = 444.666;
		a = "" + d;
		System.out.println(a); // bu yollar professional saylmir
		boolean b = false;
		a = "" + b;
		System.out.println(a);

		a = String.valueOf(b);
		System.out.println(a);
		char[] charArray = { 'a', 'f', 'g', 'x', 'y', 'z' };
		a = String.valueOf(charArray);
		System.out.println(a);
		a = String.valueOf(charArray, 2, 3);
		System.out.println(a);

		System.out.println("--------------");

		// setirleri birlesdirmek

		String s1 = "Java";
		String s2 = "Python";

		String s3 = s1 + s2;
		System.out.println(s3);
		String s4 = s1.concat(s2);
		System.out.println(s4);

		System.out.println("--------------");

		// setirlerin istenilen indeksinde olan simvolu tapmaq
		char c = s.charAt(5);
		System.out.println(c);
		c = s.charAt(24);
		System.out.println(c);

		System.out.println("--------------");

		// setirin verilmis basqa setirle bitmesini yoxlamaq

		boolean b1 = s.endsWith("ge");
		System.out.println(b1);
		b1 = s.endsWith("lang");
		System.out.println(b1);

		System.out.println("-------------");

		// setirin basqa setire beraber olmasini yoxlamaq

		String q1 = new String("Java");// heap yaddasda saxlanilir
		String q2 = "Java"; // pool yaddasda saxlanilir
		System.out.println(q1.equals(q2));

		System.out.println("-------------");

		// setirin daxilinde basqa setirin necenci indeksde oldugunu tapmaq

		String e1 = "language";
		System.out.println(s.indexOf(e1));
		System.out.println(s.indexOf("a"));
		System.out.println(s.indexOf("lang", 20));
		System.out.println(s.lastIndexOf("lang"));

		System.out.println("-------------");

		// setirin bos olmasini yoxlamaq

		String f1 = "";
		System.out.println(f1.isBlank());
		System.out.println(f1.isEmpty());

		System.out.println("------------");

		// setirin daxilinde olan simvollarin sayini tapmaq
		// int l = s.length()
		System.out.println(s.length());

		System.out.println("------------");

		// setirin daxilindeki simvollari basqi ile evez etmek

		String t1 = "int byte short long int double int";
		String t2 = t1.replace('i', 'l');
		System.out.println(t2);
		System.out.println(t1);

		String t3 = t1.replace("int", "integer");
		System.out.println(t3);

		String t4 = t1.replaceAll("int", "integer");
		System.out.println(t4);

		String t5 = t1.replaceFirst("int", "integer");
		System.out.println(t5);

		System.out.println("---------------");

		// setiri hisselere bolmek

		String u1 = "Java language";
		String[] u1Array = u1.split("a");
		System.out.println(Arrays.toString(u1Array));

		String[] u1Array2 = u1.split("a", 3);
		System.out.println(Arrays.toString(u1Array2));

		System.out.println("---------------");

		// setirin verilmis basqa setirle baslamasini yoxlamaq

		System.out.println(s.startsWith("Jav"));

		System.out.println("---------------");

		// setirin alt setirini tapmaq
		String h1 = s.substring(20);
		System.out.println(h1);

		h1 = s.substring(5, 10);
		System.out.println(h1);

		System.out.println("---------------");

		// setiri simvol massivine cevirmek

		char[] charArray2 = s.toCharArray();
		System.out.println(Arrays.toString(charArray2));

		System.out.println("---------------");

		// setirin simvollarini kiciltmek

		String r3 = "JAVA";
		System.out.println(r3.toLowerCase() + " " + r3);

		System.out.println("---------------");

		// setirin simvollarini boyutmek

		String r4 = "java";
		System.out.println(r4.toUpperCase() + " " + r4);

		System.out.println("---------------");

		// setrileri muqayise etmek

		String k1 = "a";
		String k2 = "b";
		int i10 = k1.compareTo(k2);
		System.out.println(i10);

		k1 = "java";
		k2 = "JAva";
		i10 = k1.compareToIgnoreCase(k2);
		System.out.println(i10);

		System.out.println("---------------");

		// setirin daxilinde basqa setirin olmasini yoxlamaq

		String n1 = "Java";
		System.out.println(n1.contains("va"));

		System.out.println("---------------");

		// setirin bas ve sonunda olan bosluqlari yox etmek

		String l1 = "     Java   ";
		System.out.println(l1);
		System.out.println(l1.trim());

	}
}
