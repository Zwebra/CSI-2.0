import java.util.Scanner;

public class Forstaprogrammet 
{

	public static void main(String[]args)
	
	
	{
		Scanner keyboard = new Scanner(System.in);
		String underg�ng;
		boolean yesorno=true;
		
		
		System.out.println("Hello world!!! Hoppas inte jorden g�r under idag!");
		
		while (yesorno){
			System.out.println("har jorden g�tt under idag? true or false!");
					yesorno = keyboard.nextBoolean();
		
			if(yesorno == true) {
				System.out.println("�h nej!");
			}
			else if(yesorno == false){
				System.out.println("wohooo! en dag till att leva");
			
			}
		}
	}
	
	
	
	
	
	
}
