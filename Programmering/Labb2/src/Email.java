import java.util.Scanner;

public class Email 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		
		String name;
		Scanner input = new Scanner(System.in);

		System.out.print("Skriv ditt hela ditt namn: "); //H�r skriver man in sitt namn som sedan anv�nds f�r mailen.
			name = input.nextLine(); //Scanner som tar emot namnet och sparar till name.
			
		create_email(name);
		
			
		
	}
		private static String create_email(String name)
			
			{
			
			
				int pos1 = name.indexOf(" "); //Deklarerar variablen pos1 f�r att hitta mellanslaget.
			
				String fname = name.substring(0,3); //Letar upp det 3 f�rsta bokst�verna i f�rnamnet.
				String sname = name.substring(pos1+1,pos1+5); // 4 f�rsta bokst�verna i efternamnet.
	
				System.out.print(fname + sname + "@student.hh.se"); //Skriver ut emailadressen
				return sname;
				
			}
	}
	