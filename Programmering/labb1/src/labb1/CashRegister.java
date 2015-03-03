package labb1;
import java.util.Scanner;
public class CashRegister {

 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
int pris, betalt, pengartbx, hundra, femtio, tjugo, tio, fem;
	   
	System.out.println("Ange priset p� varan:");
	pris = input.nextInt();
	System.out.println("Ange hur mycket du betalde:");
	betalt = input.nextInt();
	input.close();	 
	pengartbx = betalt - pris;
  
	hundra = (pengartbx - pengartbx%100)/100;
	pengartbx = pengartbx-hundra*100;
  
	femtio = (pengartbx - pengartbx%50)/50;
	pengartbx -= femtio*50;
  
	tjugo = (pengartbx - pengartbx%20)/20;
	pengartbx -= tjugo*20;
  
	tio = (pengartbx - pengartbx%10)/10;
	pengartbx = pengartbx -tio*10;
  
	fem = (pengartbx - pengartbx%5)/5;
	pengartbx -= fem*5;
  

  System.out.println("Du f�r " + hundra+" Hundralappar "+femtio+" Femtiolappar "+tjugo+" Tjugolappar "+tio+" Tior "+fem+" Femmor "+pengartbx+" enkronor");
 }

}
