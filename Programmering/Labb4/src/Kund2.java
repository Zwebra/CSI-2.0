import java.util.Random;
public class Kund2{
    
	 private String namn;
	 private String login;
    private String password;
	 private String kontonr;
    
	 public Kund2(String n)
	    {
	    	namn=n;
		}
    
    public void setLogin(String nylogin)
    {
    	String loginnamn=nylogin;
    	 boolean length = loginnamn.length() >= 5;
   	  boolean special = loginnamn.matches("[A-Za-z0-9 ]*");
   	  		if(length == true && special == true)
		   	{
		   		System.out.println("Ditt anv�ndarnamn �r tillr�ckligt bra :D");
		   		login=loginnamn;
		   	}
		   	else
		   	{
		   		System.out.println("Du f�r byta anv�ndarnamn!");
		   	}
    }

    public void setPassword(String nypassword)
    {
    	String CheckPasswd;
    	CheckPasswd=nypassword;
    	
    	
    	  boolean length = CheckPasswd.length() >= 8;
    	  boolean special = !CheckPasswd.matches("[A-Za-z0-9 ]*");
    	  boolean upper = !CheckPasswd.equals(CheckPasswd.toLowerCase());
    	  boolean lower = !CheckPasswd.equals(CheckPasswd.toUpperCase());
    	  
    	  
    	  if(length == true && special == true && upper == true && lower == true )
    	  		{
    		   System.out.println("Ditt l�sen �r s� j�vla AWESOME!!!!!!!!!!!!!");
			    		
			    password=CheckPasswd;
    		  }
    	  else
    		   {
    		   		System.out.println("Ditt l�sen suger och m�ste kompliteras!!");
    		   }
	 }
    
	 public void createKontonr()
	 {
		
		 Random RN= new Random();
		 int First4,Last5;
		 First4=RN.nextInt(8999)+1000;
		 Last5=RN.nextInt(89999)+10000;
		 int kontonr=First4+Last5;
		 

	 }
	 
	  public String getlogin()
	  {
		return login;
	  }
	  
	   public String getpassword()
	  {
		   	   String text = password;
		   	   String Losen="";
			   for(int i=0;i<text.length();i++)
			   {
			   int ascii_ny=(int)text.charAt(i)-1;
			   
			   Losen+= ((char)ascii_ny);
			   }
			   password=Losen;
	  return password;
	  }

	 
	 public String getKontonr(String inlogin, String inpassword )
	 {
		 
	 return kontonr;
	 }
	 
	 public void SeNmr()
	 {
		 System.out.println(kontonr);
	 }
	
	 
}