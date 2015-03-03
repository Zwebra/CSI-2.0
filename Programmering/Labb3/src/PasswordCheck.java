import java.util.Scanner;

public class PasswordCheck {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		String pwd;
		
		System.out.println("skriv in ditt pwd: ");
			pwd = input.next();
			
			input.close();
		boolean upper = !pwd.equals(pwd.toLowerCase());
		boolean lower = !pwd.equals(pwd.toUpperCase());
		boolean isAtLeast8   = pwd.length() >= 8;//Checks for at least 8 characters
		boolean hasSpecial   = !pwd.matches("[A-Za-z0-9 ]*");//Checks at least one char is not alpha numeric

		
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(isAtLeast8);
		System.out.println(hasSpecial);

		
		if(upper == true && lower == true && isAtLeast8 == true && hasSpecial == true){
			System.out.println("Your pwd is okay");
		}else if(upper == false && lower == false && isAtLeast8 == false && hasSpecial == false){
			System.out.println("Your pwd is not okay");
		}

	}
}
