import java.util.*;

public class PasswordMake2 {
	
	public static void main(String []args){
		
		Random rand = new Random();
		int tal1 = rand.nextInt(25)+97;
		int tal2 = rand.nextInt(25)+97;
		
		char smal = (char)tal1;
		char smal2 = (char)tal2;
		
		int tal3 = rand.nextInt(25)+65;
		int tal4 = rand.nextInt(25)+65;
		
		char big = (char)tal3;
		char big2 = (char)tal4;
		
		int tal6 = rand.nextInt(9)+1;
		int tal7 = rand.nextInt(9)+1;
  
  
		String special = "#¤%&/()=?{[]-_+´`'*¨^§@£$} ";
		char rand1, rand2;
  
  
		rand1 = special.charAt(rand.nextInt(special.length()) );
		rand2 = special.charAt(rand.nextInt(special.length()) );
  
  
		System.out.print(smal+""+smal2);
		System.out.print(big +""+big2);
		System.out.print(tal6 +""+tal7);
		System.out.print(rand1 +""+rand2);
  
 
 }
}