import java.util.Scanner;


public class Names {

	public static void main(String []args){
		
		String name = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
			name = input.nextLine();
		
		System.out.println(name);
		
		//Share name
		
		String firstname = name.substring(0, name.indexOf (" "));
		String eftername = name.substring(name.indexOf(" ") + 1 );
		
		System.out.println("Your firstname is "+firstname);
		System.out.println("Your last name is "+eftername);
		
	}
}