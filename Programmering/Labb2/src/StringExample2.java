
public class StringExample2 {
	

	public static void main(String[] args) {
		
		
		String text = "nicolina gillar java";
		int pos1 = text.indexOf(" ");
		int pos2 = text.indexOf(" ", pos1 + 1);
		
		String ord1 = text.substring(0,pos1);
		String ord2 = text.substring(pos1+1, pos2);
		String ord3	= text.substring(pos2+1);
		
		
		System.out.println(ord1);
		System.out.println(ord2);
		System.out.println(ord3);
		
		String nyord = "" +ord1.charAt(0)+ ord2.charAt(0)+ ord3.charAt(0);
	
		System.out.println(nyord);
}}
