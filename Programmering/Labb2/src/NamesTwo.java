import java.util.Scanner;

public class NamesTwo {
	public static void main(String []args){
		
		String name;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
			name = input.nextLine();
		System.out.println(name);
		
		// Share name
			
			printNames(name);
	
	}
	
		// New method
	
	public static void printNames(String theName){
		
		String firstname = theName.substring(0, theName.indexOf(" "));
		String surname = theName.substring(theName.indexOf(" ")+1);
		String init = "" + firstname.charAt(0) + surname.charAt(0);
		
		System.out.println("Your firstname is "+firstname);
		System.out.println("your surname is "+surname);
		System.out.println("dina inits �r: "+ init);
		

	}
}


