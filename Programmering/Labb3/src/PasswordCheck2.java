import java.util.Scanner;
import java.io.File;

public class PasswordCheck2 {
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	
	
	System.out.println("PASSWORD PLEASE!");
		String pwd = input.nextLine();
		
		input.close();
	
	boolean length = pwd.length()>=8;
	boolean specialChar = !pwd.matches("[A-Za-z0-9]");
	boolean upperChar = !pwd.equals(pwd.toLowerCase());
	boolean lowerChar = !pwd.equals(pwd.toUpperCase());
	
	boolean words = true;
	int testval = -1;
	
	try{
		
		Scanner ord = new Scanner(new File("ordlista_sv.txt"));
		while (ord.hasNext() && testval == -1){
			String test = ord.next();
			testval = pwd.indexOf(test);
			if(testval == 0 || pwd.matches(test + "[0-9]") || pwd.matches("[0-9]" + test)){
				words = false;
			}
		}
		ord.close();
	}catch (Exception e){}
	
	if(length == true && specialChar == true && upperChar == true && lowerChar == true && words == true){
		System.out.println("det fungerar!");
	}else{
		System.out.println("det fungerar inte!");
	}
	}
}
