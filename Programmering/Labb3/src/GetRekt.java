import java.util.Scanner;

public class GetRekt {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("***FUCKYOU INC***");
		System.out.println("Enter your password");
			String pwd = input.next();
			
		boolean greger = PwdCheck.pwdCheck(pwd);	
		if (greger == true){
			System.out.println("yay!");
		}else{
			System.out.println("nay!");
		}
		
	}
	
}
