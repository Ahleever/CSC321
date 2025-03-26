//Oliver Montero
//Lab 3

import java.util.Scanner;

public class omontero3
{
	public static void main(String[] args)
	{
		int x = 5;
		int userInput = 0;
		int counter = 0;
		
		double y = 5.5;
		double userDouble;
		char z= 'z';
		char userChar;
		float w = 1.1f;
		float userFloat;

		System.out.println("Enter an integer number");
		Scanner kb = new Scanner(System.in);
		userInput = kb.nextInt();

		System.out.println("Enter a decimal number(double)");
                userDouble = kb.nextDouble();

		System.out.println("Enter a letter");
                userChar = kb.next().charAt(0);

		System.out.println("Enter another small decimal(float)");
                userFloat = kb.nextFloat();

		if(userInput > x)
		{
			System.out.println("Your entered " + userInput + ", which is larger than my number " + x);
		}
		else if(userInput < x)
		{
			System.out.println("Your entered " + userInput + ", which is smaller than my number " + x);
		}
		else
                {
                        System.out.println("Your entered " + userInput + ", which is equal to my number " + x);
                }

                if(userDouble > y)
                {
                        System.out.println("Your entered " + userDouble + ", which is larger than my number " + y);
                }
                else if(userDouble < y)
                {
                        System.out.println("Your entered " + userDouble + ", which is smaller than my number " + y);
                }
                else
                {
                        System.out.println("Your entered " + userDouble + ", which is equal to my number " + y);
		}

                if(userChar == z)
                {
                        System.out.println("Your entered " + userChar + ", which is my letter " + z);
                }
                else
                {
                        System.out.println("Your entered " + userChar + ", which is not my letter " + z);
                }

                if(userFloat > w)
                {
                        System.out.println("Your entered " + userFloat + ", which is larger than my number " + w);
                }
                else if(userFloat < w)
                {
                        System.out.println("Your entered " + userFloat + ", which is smaller than my number " + w);
                }
                else
                {
                        System.out.println("Your entered " + userFloat + ", which is equal to my number " + w);
                }

		for(int i = 0; i < 3; i++)
		{
			System.out.println("Learning to code is fun!");
		}

		while(counter < 4)
		{
			System.out.println("Interstellar");
			counter++;
		}
			
	}
}
