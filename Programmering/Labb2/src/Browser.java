import java.util.*;


public class Browser {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String sord;
		String text;
		
		System.out.println("skriv din mening här: ");
			text = input.nextLine();
			
		System.out.println("vilket ord vill du söka efter? ");
			sord = input.nextLine();
			
		int pos1 = text.indexOf(sord);
		
		if (pos1 > -1){
			System.out.println("den finns");
		}else{
			System.out.println("den finns ej");
		}
			
		
		
		
			
		
		
	}
	
	
	
}
