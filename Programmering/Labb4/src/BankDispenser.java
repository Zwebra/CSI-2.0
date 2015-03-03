import java.util.Scanner;
public class BankDispenser
	{
		static String namn;
		static Scanner scan = new Scanner(System.in);
		static Account account1=new Account( 1000, "Svensson Dan", 750123);
		static Kund TheFirstUser=new Kund("namn");
		public static void main(String[] args)
		{
			System.out.println("Skriv in ditt namn :");
		namn=scan.nextLine();	
		printMenu();
		int choice = scan.nextInt();
		while (choice != 0)
			{
			dispatch(choice);
			printMenu();
			choice = scan.nextInt();
			}
	}

		
public static void printMenu()
	{
			System.out.println("\n Welcome "+namn+" to MY BANK/ v�r nya kund ");
			System.out.println(" ====");
			System.out.println("0: Quit");
			System.out.println("1: Deposit" );
			System.out.println("2: Withdraw");
			System.out.println("3: Show account information");
			System.out.println("4: Skapa ett Anv�ndarkonto som du kan logga in med");
			System.out.println("5: Skapa ett l�senord");
			System.out.println("6: Generera ett kontonummer");
			System.out.println("7: Ta reda p� ditt kontonummer");
			System.out.print("\nEnter your choice: ");
	}

	
public static void dispatch(int choice)
	{
		switch(choice)
		{
			case 0:
				System.out.println("Bye!");
				System.exit(0);
				break;
	
			case 1:
				System.out.println("Insert your accountnumber");
				int nr = scan.nextInt();
				// the program checks if the account number is correct. If yes the //programme ask for the deposit amount and execute it
				if( account1.getNumber()==nr)
					{
	
						System.out.println("Insert the amount to deposit");
						int amount=scan.nextInt();
						account1.deposit(amount);
					}
				else{
					System.out.println( " Wrong account number");
					break;
					}
			case 2:
					System.out.println( "L�gg till koden o odd vill g�ra withdraw");
					break;
			case 3:
					System.out.println("Insert your account number");
					nr = scan.nextInt();
						if( account1.getNumber()==nr)
						{
							System.out.println( account1.toString());
						}
						break;
			case 4:
						System.out.println("Skriv in ett anv�ndarnamn och se om det �r l�mpligt :");
						String anv=scan.next();
						TheFirstUser.setLogin(anv);
						break;
			case 5: 	
						System.out.println("Skriv in ditt l�senord till ditt anv�ndarkonto och se om det �r tillr�ckligt bra :");
						String passwd=scan.next();
						TheFirstUser.setPassword(passwd);
						break;
			case 6: 	
					TheFirstUser.createKontonr();
					System.out.println("Done!");
					break;
			case 7: 
					String Avsluta="stop";
					System.out.println(TheFirstUser.getlogin());
					String namn=TheFirstUser.getlogin();
					
					System.out.println("Skriv in ditt anv�ndarnamn :");
					String seeIfUser=scan.next();
						if(seeIfUser.matches(namn))
							{
							//System.out.println(TheFirstUser.getpassword());
							
									for(int i=0;i<1000;i++)
									{
										System.out.println("skriv nu in ditt l�senord :\n Skriv \"stop\" f�r att Avsluta");
										String seeIfPass=scan.next();
										if(seeIfPass.matches(Avsluta))
										{
											System.out.println("Du valde att avsluta programmet");
											break;
										}
										if(seeIfPass.matches(TheFirstUser.getpassword()))
										{
											//TheFirstUser.SeNmr();
											String kontonmret=TheFirstUser.getKontonr(namn,seeIfPass);
											System.out.println("Ditt kontonummer �r f�ljande :"+kontonmret);
											
										}
										else 
										{
											System.out.println("Du skrev in fel l�senord!");
										}
										
										
									}
							}
					break;
			default:
				System.out.println("Sorry, invalid choice");
		}
	}
}		