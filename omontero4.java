//Oliver Montero
//
import java.util.Scanner;
public class omontero4
{
	public static void main(String[] args)
	{
		int x = 0;
		System.out.println("Choose an option: ");
		System.out.println("Option 1: ");
		System.out.println("Option 2: ");
		System.out.println("Option 3: ");
		System.out.println("Option 4: ");
		
		Scanner kb = new Scanner(System.in);
		x = kb.nextInt();

		System.out.println("You chose option " + x);	
	}
}
