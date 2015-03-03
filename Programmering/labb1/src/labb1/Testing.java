package labb1;
import java.util.Scanner;
public class Testing {
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in); 	
		
	System.out.println("Vad heter du?");
	String name = input.nextLine();
	
	input.close();
	
	System.out.println("Så ditt namnt är "+ name +  "." );	
	}
}
