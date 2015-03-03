// Kalorier / minut = 0,0175 * MET * vikt ( i kg) .

 import java.util.Scanner;
 public class Calories2
 {
	 static final int METL�pning = 10;
	 static final int METBasket = 8;
	 static final int METSleep = 1;
	 static final int METStenhard = 16;
	 static final int METGardening = 5;

	 static Scanner scan = new Scanner(System.in);
	 static int vikt;  static double total_calories;


	 public static void main(String[] args)
	 {
		 System.out.println( " Kalorif�rbruknings program");
		 System.out.println( " Hur mycket v�ger du ?");
		 vikt = scan.nextInt();


		 printMenu();
		 int choice = scan.nextInt();

 // programmet stanar kvar i loopen tills anv�ndaren matar in 0
		 while (choice != 0)
		 {
			 dispatch(choice);
			 printMenu();
			 choice = scan.nextInt();
		 }

 } 
	 // main slutar h�r



 // Skriver ut anv�ndar m�jligheter
	 public static void printMenu()
	 {
		 System.out.println("\n V�lj aktivitet. V�lj 4 n�r du �r klar med alla val");
		 System.out.println(" =========");
		 System.out.println("0: Exit ");
		 System.out.println("1: L�pning" );
		 System.out.println("2: Basket" );
		 System.out.println("3: Sova");
		 System.out.println("4: Stenhard");
		 System.out.println("5: Gardening");
		 System.out.println("6: Ber�kna kalorier");

		 System.out.print("\nMata in ditt val: ");
	 }

 // metoden dispach behandlar och g�r ber�kningar beroende p� val
	 public static void dispatch(int choice)
	 {

		 switch(choice){
		 	case 0:
		 		System.exit(0);
		 		break; case 1:
		 			System.out.println( " Hur l�ng tid har du sprungit ? Ange tiden i minut");
		 			int l�pning_tid = scan.nextInt();
		 			total_calories = total_calories+ (0.0175 *vikt* METL�pning)*l�pning_tid;
		 			break;

		 		case 2:
		 			System.out.println("Hur mycket basket har du spelat?");
		 			int basket_tid = scan.nextInt();
		 			total_calories=total_calories+ (0.0175 *vikt* METBasket)*basket_tid;
		 			break;

		 		case 3:
		 			System.out.println("Hur l�nge har du sovit?");
		 			int sova_tid = scan.nextInt();
		 			total_calories=total_calories+ (0.0175 *vikt* METSleep)*sova_tid;
		 			break;
		 		
		 		case 4:
		 			System.out.println("Hur l�nge har du tr�nat stenhard?");
		 			int stenhard_tid = scan.nextInt();
		 			total_calories = total_calories+ (0.0175 *vikt* METStenhard)*stenhard_tid;
		 			break;
		 			
		 		case 5: 
		 			System.out.println("Hur l�nge har du gardenat");
		 			int garden_int = scan.nextInt();
		 			total_calories = total_calories+ (0.0175*vikt*METGardening)*garden_int;
		 			break;
		 		
		 		case 6:

		 			System.out.println( " F�rbr�nda kalorier �r " +	total_calories);
		 			System.out.println( " Ber�kningen b�rjar p� nytt");
		 			total_calories=0;
		 			break;
		 			
		 			
		 			default:
		 				System.out.println("Sorry, fel val");
		 	}
 }


 } 