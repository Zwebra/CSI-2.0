package labb1;
public class StringExample {
	public static void main(String[] args) {
		String str = "string är text ";
		String strUpper = str.toUpperCase();
		String part1 = str.substring(5,10);
		String part2 = str.substring(0, str.indexOf(" "));
		
		System.out.println("Original String: " + str);
		System.out.println("String changed to upper case: " + strUpper);
		
		System.out.println(part1); // Vad är utskriften? Varför?
		System.out.println(part2); // Vad är utskriften? varför?
	}
}