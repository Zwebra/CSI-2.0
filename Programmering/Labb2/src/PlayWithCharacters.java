import java.util.Scanner;

public class PlayWithCharacters {

	public static void main(String []args){
		
		String hej = "hej";
		int b1 = (int) hej.charAt(0);
		int b2 = (int) hej.charAt(1);
		int b3 = (int) hej.charAt(2);
		
		b1 = b1+1;
		b2 = b2+1;
		b3 = b3+1;
		
		char a = hej.charAt(0);
		char b = hej.charAt(1);
		char c = hej.charAt(2);
		
		System.out.println(a+""+b+""+c);
		System.out.println (b1 + b2 + b3);
		System.out.println("" + (char)b1 + (char)b2 + (char)b3);
		
		String ord2 = "" + (char)b1+(char)b2+(char)b3;
		
		System.out.println(ord2);
		
	}
	
	
}
