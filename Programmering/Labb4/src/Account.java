public class Account {
	private double balance;
	private String name; 
	private long number;
 
 
 
	public Account(double initBal, String initName, long initNumber)
		{ 
		balance = initBal;
		name = initName; 
		number = initNumber; 
		} 

	public void withdraw(double amount)
		{ 
		if (balance >= amount)
		{
			balance -= amount;
		}else{
			System.out.println("Insufficient funds");
		}
	} 

	public void deposit(double amount)
	{
		if (amount <=0)
  	{
			System.out.println("Don't write negative numbers!");
  	}else{
			balance += amount;
		}
	} 
 
	public double getBalance()
	{ 
		return balance;
	} 
 
	public double getNumber() 
	{ 
		return number; 
	}
	public double chargeFee()
	{
		int avdraget = 10;
		balance-=avdraget;
		
		return balance;
	} 
	public void changeName(String newName )
	{ 
		String thenewname=newName;
		name=thenewname;
	}
	public String toString()
	{ 
		String info;
		info=balance+""+name+""+number;
		System.out.println("Your balance is: "+balance +"\n Account holders name: "+name+"\n Your account number is: "+number);
		return info;
	} 

}