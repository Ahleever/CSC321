//Oliver Montero
//CSC321
//lab 6 

public class ExpressionsInJava
{
	public static void main(String[] args)
	{	
		int x = 5;
		int y = 2;
		double a = 5.0;
		double b = 2.0;

		System.out.println("Integers:");
		System.out.println("x+y*x/y-x= " + (x+y*x/y-x));
		System.out.println("-x-y/x*y+x= "+ (-x-y/x*y+x));
		System.out.println("x+y-x/y= "+ (x+y-x/y));

		System.out.println("\nDoubles:");
		System.out.println("x+y*x/y-x = " + (a+b*a/b-a));
		System.out.println("-x-y/x*y+x= "+ (-a-b/a*b+a));
		System.out.println("x+y-x/y= "+ (a+b-a/b));
	}

}
