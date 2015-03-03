import java.util.Scanner;

public class Fuelcost

{
	
	public static void main(String[]args)
		{


			Scanner keyboard = new Scanner(System.in);

			String namn;
			int klass;
			double skämighetsgrad;

			System.out.println("Vem är skämig? ");
				namn = keyboard.next();

			System.out.println("Vilket år går personen?");
				klass = keyboard.nextInt();

			System.out.println("Vilken grad är det?");
				skämighetsgrad = keyboard.nextDouble();

			System.out.println("Jahaja är " + namn + "från år " + klass + " så här skämig? " + skämighetsgrad);


		}

}

	



