public class ManageAccounts {

 public static void main(String[] args) {

	 Account konto1 = new Account(1000, "Sally", 001);
	 Account konto2=new Account(500,"Sam",002);

	 //System.out.println("Här kan du se Sams konto: ");

	 konto2.deposit(100);
	 konto2.toString();
	 
	 konto1.withdraw(50);
	 System.out.println(konto1.getBalance());
	 konto1.toString();
	 
	 //test of methods
	 System.out.println("\n -------------- Test Paragraph ----------------");
	 konto2.changeName("Anna");
	 System.out.println(konto2.getBalance());
	 konto2.chargeFee();
	 konto2.toString();
	 
	 konto1.deposit(-30);
 }

 
}