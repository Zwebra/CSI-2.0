import java.util.*;
public class FunnyGame {
	public static void main (String []args){
				Scanner input = new Scanner (System.in);
				Random slumpGen=new Random();
				System.out.println("Skriv in ett positivt nummer upp till 100: ");
				int n = input.nextInt();
				int slump = slumpGen.nextInt(n);
				int mintal = 0;
				
				while(slump != mintal){
				System.out.print("Gissa ett tal mellan 0-"+n+": ");
				mintal=input.nextInt();
				 if(slump == mintal){
				System.out.println("Du gissade r�tt");
				
				}
				else if(mintal > slump){
				System.out.println("Du gissade f�r h�gt!!!!!!!!!");
				}
				else	{
					System.out.println("Du gissade f�r l�gt!!!!!! ");
				 }
				}
				input.close();
			}
		

	}

