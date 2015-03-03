import java.util.Scanner;

public class Labovning1
{
	public static void main(String [] args)
	{
		final int coverage = 3;

		Scanner tangetbord = new Scanner(System.in);

		int yside, xside, area, colour;

		System.out.println("skriv in y sidan: ");
			yside = tangetbord.nextInt();

		System.out.println("skriv in x sdian: ");
			xside = tangetbord.nextInt();


		area = yside * xside;
		System.out.println("This is the area " + area);

		colour = area/3;
		System.out.println("The amount amount of colour is: " + colour);

	}
}

