import java.util.Scanner;

public class NewBmi {
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in); 
		
		final double man = 16.2;
		final double female = 5.4;
		double height;
		double fat = 0;
		int weight;
		int age;
		String sex;
		
		System.out.println("Vilket k�n �r du; man eller kvinna?: ");
			sex = input.next();
		
		System.out.println("Din �lder: ");
			age = input.nextInt();
		
		System.out.println("Din vikt: ");
			weight = input.nextInt();
			
		System.out.println("Din l�ngd: ");
			height = input.nextDouble();
			
			input.close();
		
		double bmi = weight / (height * height);
		System.out.println("BMI: " + bmi);
			
		if (sex.equals("man")){
			fat = (1.2 * bmi) + (0.23 * age) - man;
			System.out.println("h�r st�r det saker omg omg" + fat);
		}
		else if(sex.equals("female"))
		{
			fat = (1.2 * bmi) + (0.23 * age) - female;
			System.out.println("h�r st�r det saker " + fat);
		}
		
		if (sex.equals("man")){
			if (fat >= 12 && fat <=20){
				System.out.println("Ditt fett index �r normalt " + fat);
			}else {
				System.out.print("Ditt fett index �r f�r h�gt " + fat);
			}
		}else if(sex.equals("woman")){
			if (fat >= 20 && fat <= 30){
				System.out.println("Ditt fett index �r normalt " + fat);
			}else{
				System.out.println("Ditt fett index �r h�gt " + fat);
			}
	
		}
	
	}
}
	
				
					
				
				
