import java.util.Scanner;

public class labovning2
	{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		int radius ;
		final double PI = 3.14159;
  		System.out.println("skriv in radius: ");
 			radius = input.nextInt();

 		double area = PI * radius * radius;


 		System.out.println("The area of a circle with radius " + radius + " is " + area);

}
}