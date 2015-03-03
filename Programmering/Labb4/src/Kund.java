import java.util.Random;
public class Kund{
    
	 private String namn;
	 private String login;
    private String password;
	 private String kontonr;
    
	 public Kund(String n)
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
		   		System.out.println("Your username is okay.");
		   		login=loginnamn;
		   	}
		   	else
		   	{
		   		System.out.println("Your username is not okay.");
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
    		   System.out.println("Your password is okay!");
    		  
    		   String Losenord="";
			    		for(int i=0;i<CheckPasswd.length();i++)
			    		{
					
					   int ascii_ny=(int)CheckPasswd.charAt(i)+1;
					
					   Losenord+=((char)ascii_ny);
					   } 
			    password=Losenord;
    		  }
    	  else
    		   {
    		   		System.out.println("Compliment your PDW");
    		   }
	 }
    
	 public void createKontonr()
	 {
		
		 Random rng= new Random();
		 int First4,Last5;
		 First4=rng.nextInt(8999)+1000;
		 Last5=rng.nextInt(89999)+10000;
		 kontonr=First4+"-"+Last5;
		 

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