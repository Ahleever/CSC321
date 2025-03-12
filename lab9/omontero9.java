//Oliver Montero
//Lab 09 in Java

import java.util.Scanner;
import java.util.Random;

public class omontero9 
{
	public static void main(String[] args)
	{
		int randy = 0, guess = 0;
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		randy = rand.nextInt(20) + 1;
		System.out.println(randy);

		while(guess < 1 || guess > 20)
		{
			System.out.println("Please choose a number between 1 and 20");
			guess = kb.nextInt();

			if(guess < 1 || guess > 20)
			{
			 	System.out.println("Number must be in the range of 1-20: ");
			}
		}

		if(guess != randy)
		{
			if(guess > randy)
			{
				System.out.println("You didn't guess the right number. Your guess was too high. The random number was " + randy);
			}
			else
			{
				System.out.println("You didn't guess the right number. Your guess was too low. The random number was " + randy);
			}
		}
		else
		{
			System.out.println("Wow! You guess the right number!");
			for (int i = 0; i < randy; i ++)
			{
				System.out.println(i + 1 +". Winner Winner!");
			}
		}
	}
}
