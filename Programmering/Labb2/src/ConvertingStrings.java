import java.util.Scanner;


public class ConvertingStrings {
	
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String inbirth;
		String age;
		
		System.out.println("Skriv din födelsedag: ÅÅÅÅ-MM-DD");
			inbirth = input.nextLine();
			
		age = inbirth.substring(0,4);
		
		int year = Integer.parseInt(age);
		
		System.out.println(2015-year + " år gammal är du!");
		
	}
}
