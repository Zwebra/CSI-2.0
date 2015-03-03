package labb1;

public class Supris {
	public static void main(String []args){
	int x, y;
	x = 10;
	y = 5;
	int helkvot = x / y;
	double kvot = (double) x / y;
	
	System.out.println("Heltalkvoten är: " + helkvot);
	System.out.println("Kvoten är: " + kvot);
	int rest = x%y;
	System.out.println("Resten är: " + rest);
	
	}
}
