//Oliver Montero
//
import java.util.Scanner;
public class omontero4
{
	public static void main(String[] args)
	{
		int x = 0;
		System.out.println("Choose an option: ");
		System.out.println("Option 1");
		System.out.println("Option 2");
		System.out.println("Option 3");
		System.out.println("Option 4");
		
		Scanner kb = new Scanner(System.in);
		x = kb.nextInt();

		System.out.println("You chose option " + x);
		if (x == 1)
		{
			System.out.println("Went with the easy choice.");
		} else if (x == 2)
		{
			System.out.println("Gotta use the restroom.");
		}else if (x == 3)
                {
                        System.out.println("German vs British three.");
                }else if (x == 4)
                {
                        System.out.println("We will evolve to have 4 fingers one day.");
                } else
		{
			System.out.println("Nah, gotta choose a number listed.");
		}
	}
}
