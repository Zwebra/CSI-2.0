// Kalorier / minut = 0,0175 * MET * vikt ( i kg) .

 import java.util.Scanner;
 public class Calories2
 {
	 static final int METLöpning = 10;
	 static final int METBasket = 8;
	 static final int METSleep = 1;
	 static final int METStenhard = 16;
	 static final int METGardening = 5;

	 static Scanner scan = new Scanner(System.in);
	 static int vikt;  static double total_calories;


	 public static void main(String[] args)
	 {
		 System.out.println( " Kaloriförbruknings program");
		 System.out.println( " Hur mycket väger du ?");
		 vikt = scan.nextInt();


		 printMenu();
		 int choice = scan.nextInt();

 // programmet stanar kvar i loopen tills användaren matar in 0
		 while (choice != 0)
		 {
			 dispatch(choice);
			 printMenu();
			 choice = scan.nextInt();
		 }

 } 
	 // main slutar här



 // Skriver ut användar möjligheter
	 public static void printMenu()
	 {
		 System.out.println("\n Välj aktivitet. Välj 4 när du är klar med alla val");
		 System.out.println(" =========");
		 System.out.println("0: Exit ");
		 System.out.println("1: Löpning" );
		 System.out.println("2: Basket" );
		 System.out.println("3: Sova");
		 System.out.println("4: Stenhard");
		 System.out.println("5: Gardening");
		 System.out.println("6: Beräkna kalorier");

		 System.out.print("\nMata in ditt val: ");
	 }

 // metoden dispach behandlar och gör beräkningar beroende på val
	 public static void dispatch(int choice)
	 {

		 switch(choice){
		 	case 0:
		 		System.exit(0);
		 		break; case 1:
		 			System.out.println( " Hur lång tid har du sprungit ? Ange tiden i minut");
		 			int löpning_tid = scan.nextInt();
		 			total_calories = total_calories+ (0.0175 *vikt* METLöpning)*löpning_tid;
		 			break;

		 		case 2:
		 			System.out.println("Hur mycket basket har du spelat?");
		 			int basket_tid = scan.nextInt();
		 			total_calories=total_calories+ (0.0175 *vikt* METBasket)*basket_tid;
		 			break;

		 		case 3:
		 			System.out.println("Hur länge har du sovit?");
		 			int sova_tid = scan.nextInt();
		 			total_calories=total_calories+ (0.0175 *vikt* METSleep)*sova_tid;
		 			break;
		 		
		 		case 4:
		 			System.out.println("Hur länge har du tränat stenhard?");
		 			int stenhard_tid = scan.nextInt();
		 			total_calories = total_calories+ (0.0175 *vikt* METStenhard)*stenhard_tid;
		 			break;
		 			
		 		case 5: 
		 			System.out.println("Hur länge har du gardenat");
		 			int garden_int = scan.nextInt();
		 			total_calories = total_calories+ (0.0175*vikt*METGardening)*garden_int;
		 			break;
		 		
		 		case 6:

		 			System.out.println( " Förbrända kalorier är " +	total_calories);
		 			System.out.println( " Beräkningen börjar på nytt");
		 			total_calories=0;
		 			break;
		 			
		 			
		 			default:
		 				System.out.println("Sorry, fel val");
		 	}
 }


 } 