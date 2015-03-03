import java.util.Scanner;

public class EmailCheck {
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your email: ");
			String email = input.next();
			
		input.close();
		
		boolean emailCheck = isEmail(email);
		
		if (emailCheck == true){
			System.out.println("Correct mail");
		}else{
			System.out.println("incorrect email");
			}
		
		
	}
	
	public static boolean isEmail(String email){
		
		boolean isEmail = email.matches("[A-Za-z0-9_-[.]]*@[A-Za-z0-9]*[.][a-z]*");
		return isEmail;
	}
	
}
