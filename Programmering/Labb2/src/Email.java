import java.util.Scanner;

public class Email 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		
		String name;
		Scanner input = new Scanner(System.in);

		System.out.print("Skriv ditt hela ditt namn: "); //Här skriver man in sitt namn som sedan används för mailen.
			name = input.nextLine(); //Scanner som tar emot namnet och sparar till name.
			
		create_email(name);
		
			
		
	}
		private static String create_email(String name)
			
			{
			
			
				int pos1 = name.indexOf(" "); //Deklarerar variablen pos1 för att hitta mellanslaget.
			
				String fname = name.substring(0,3); //Letar upp det 3 första bokstäverna i förnamnet.
				String sname = name.substring(pos1+1,pos1+5); // 4 första bokstäverna i efternamnet.
	
				System.out.print(fname + sname + "@student.hh.se"); //Skriver ut emailadressen
				return sname;
				
			}
	}
	