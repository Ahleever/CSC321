//Oliver Montero
//Lab10
import java.util.Scanner;


public class omontero10
{
	public static void main(String[] args)
	{
		double radius, height, sides, ar, vol;
		Scanner kb = new Scanner(System.in);

		System.out.println("Please input the radius of your cylinder:");
		radius = kb.nextDouble();
		System.out.println("Please input the height of your cylinder:");
		height = kb.nextDouble();

		ar = Area(radius, height);
		vol = Volume(radius, height);
		System.out.println("The area of the cylinder is " + ar);
		System.out.println("The volume of the cylinder is " + vol);
	}

	static double Area(double rad, double height)
	{
		double area, pi = 3.14;
		area = 2*pi*rad*(rad + height);
		return area;

	}

	static double Volume(double rad, double height)
	{
		double volume, pi = 3.14;
		volume = pi*rad*rad*height;
		return volume;
	}

}
