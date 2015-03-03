import java.util.Scanner;


public class FileExtension {

	@SuppressWarnings("resource")
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String filename;

		
		System.out.println("namet på filen: ");
			filename = input.next();

		GetFileTyp(filename);
	}
	
	
	public static String GetFileTyp(String filename){
		
		String output;
	int pos1 = filename.lastIndexOf(".");
	output = filename.substring(pos1);
	
	System.out.println("Filens typ är: "+output);
	return output;
	
	}
	
}
