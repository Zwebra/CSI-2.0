import java.util.Scanner;

public class Test
{
	public static void main(String[]args)
{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("Vad heter du?");
		name = keyboard.nextLine();
		
		System.out.println("How old are you?");
		age = keyboard.nextInt();
		
		System.out.println(name);
		System.out.println(age);
}
}

	
	