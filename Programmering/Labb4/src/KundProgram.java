import java.util.Scanner;
public class KundProgram
{

public static void main (String [] args)
{	
	Scanner input=new Scanner(System.in);
	String namnet,login,passwd,seeIfUser,seeIfPass,kontonmret,Avsluta="stop";
	Kund user1;
	
	System.out.println("Write your name.");
	namnet=input.nextLine();
	user1=new Kund(namnet);
	
	
	
	System.out.println("Write a username "+namnet+"");
	login=input.nextLine();
	user1.setLogin(login);
	System.out.println("write your pwd : ");
	passwd=input.nextLine();
	user1.setPassword(passwd);
	user1.createKontonr();
	System.out.println("Enter your username :");
	seeIfUser=input.nextLine();
		if(seeIfUser.equals(login))
			{
				
			System.out.println("skriv nu in ditt l�senord :\n Skriv stop f�r att Avsluta");
					for(int i=0;i<1000;i++)
					{
						seeIfPass=input.nextLine();
						if(seeIfPass.equals(Avsluta))
						{
							System.out.println("Du valde att avsluta programmet");
							break;
						}
						if(seeIfPass.equals(passwd))
						{
							kontonmret=user1.getKontonr(login,passwd);
							System.out.println("Ditt kontonummer �r f�ljande :"+kontonmret);
							break;
						}
						else if(!seeIfPass.equals(passwd))
						{
							System.out.println("Du skrev in fel l�senord! \nf�rs�k igen :");
						}
						
						
					}
			}
		else
		{
			System.out.println("Du skrev in fel anv�ndarnamn");
		}

}


}