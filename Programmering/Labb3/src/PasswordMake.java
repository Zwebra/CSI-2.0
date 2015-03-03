import java.util.Random;
import java.util.Scanner;
public class PasswordMake {
	public static void main(String[]args){
	
		String pwd ="";
		Random random = new Random();
		
		
		
		while (pwd.length() < 8){
			int character = random.nextInt(90) + 30;
			pwd = pwd + (char)character;
		}
		System.out.println(pwd);
		
		kollaPwd(pwd);
		
	}
	
	public static void kollaPwd(String pwd){
		
		
		boolean upper = !pwd.equals(pwd.toLowerCase());
		boolean lower = !pwd.equals(pwd.toUpperCase());
		boolean isAtLeast8   = pwd.length() >= 8;//Checks for at least 8 characters
		boolean hasSpecial   = !pwd.matches("[A-Za-z0-9 ]*");//Checks at least one char is not alpha numeric

		if(upper == true && lower == true && isAtLeast8 == true && hasSpecial == true){
			System.out.println("Your pwd is okay");
		}else if(upper == false || lower == false || isAtLeast8 == false || hasSpecial == false){
			System.out.println("Your pwd is not okay");
		}

	}
}




