import java.util.*;
public class Cesar
{
	
	public static void main (String[]args)
	{
		String meningen;
		String NyaMeningen="";
		Scanner input =new Scanner(System.in);
		System.out.println("Skriv in meningen :");		//H�r skriver man in meningen man vill kryptera
			meningen=input.nextLine();
		
		int [] key = new int[6]; //Crypterings nyckeln
		key[0]=3;
		key[1]=1;
		key[2]=7;
		key[3]=4;
		key[4]=2;
		key[5]=5;
		
		int spacecheck; 
		int counter=0; 
		
		char temp;
		char ordet;		
		
		
		for(int i=0; i<=meningen.length()-1;i++) 
		{
			temp=meningen.charAt(i);
			spacecheck=(int) temp;
	
			if (spacecheck==32)
			{
				counter--;	
			}
				if(counter==6)
				{
					counter=0;
				}
			ordet=encrypt_character(temp,key[counter]);	
		NyaMeningen+=ordet;		
		counter++;	
			
		}
		System.out.println(NyaMeningen);
		 String NyaMeningen2="";
		 
		 counter=0;
		 
		for (int o=0;o<=NyaMeningen.length()-1;o++)
		{
			temp=NyaMeningen.charAt(o);
			spacecheck=(int)temp;
			if (spacecheck==32)
			{
				counter--;				
			}
			if(counter==6)
			{
				counter=0;
			}
			
			ordet=decrypt_character(temp,key[counter]);
			NyaMeningen2+=ordet;
			
			
			counter++;
		}
		System.out.println(NyaMeningen2);
		
	}

	public static char encrypt_character ( char tkn, int key)
		{
			if((int)tkn==32)
			{return tkn;}
			else
			{
			int tempsiffra=((int)tkn);
			char tebaxChar= (char)(tempsiffra+key);
			return tebaxChar;
			}
		} 
	public static char decrypt_character ( char tkn, int key)
		{
		if((int)tkn==32)
			{return tkn;}
			else{
				System.out.println(tkn+""+key);
			int tempsiffra=((int)tkn);
			char tebaxChar= (char)(tempsiffra-key);
			return tebaxChar;
		}
	} 
}