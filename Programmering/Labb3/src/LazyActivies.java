import java.util.Scanner;


public class LazyActivies {
	
	@SuppressWarnings("resource")
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int temp;
		
		System.out.println("Hello!\n What temp is it out there today?");
			temp = input.nextInt();
			
		if(temp >=80){
			System.out.println("You should go Swimming!");
		}
		else if(temp >=60 && temp <80){
			System.out.println("you should go play Tennis!");
		}	
		else if (temp >=40 && temp <60){
			System.out.println("You should go play Golf!");
		}
		else if (temp < 40){
			System.out.println("You should go Skiing");
		}
	
	
	
	
	
	}
	
}
