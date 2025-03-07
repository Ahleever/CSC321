//Oliver Montero
//Midterm

import java.util.Scanner;
public class Midterm
{
	public static void main(String[] args)
	{
		int userNum, choice;
		int num = 3;

		Scanner kb = new Scanner(System.in);
		System.out.println("Please choose a number(1-10):");
		userNum = kb.nextInt();
		while(userNum > 10 || userNum < 0)
		{
		System.out.println("Please choose number between and including 1 and 10:");
		userNum = kb.nextInt();
		}

		if(userNum == num)
		{
			System.out.println("You guessed correctly! You win a prize.");
			System.out.println("Please choose a prize from the list below:");
			System.out.println("1. An iPhone(made in Russia with slave labor)\n2. A Teddy Bear (Stolen from a child)\n3. $20(Taken from a random bank account)\n4. A 64oz Insulated Water Bottle.");
			choice = kb.nextInt();
			while(choice > 4 || choice < 1)
                	{
                	System.out.println("Please choose number between and including 1 and 4:");
                	choice = kb.nextInt();
                	}	
			if(choice == 4)
			{
				System.out.println("Great choice! Please collect your 64oz Insulated Water Bottle :)");
			}
			else
			{
				System.out.println("You have been scammed. Make the moral choice next time.");
			}

		}
		else
		{
			System.out.println("Well, you guessed wrong. Sorry you lost, here's a 40oz Insulated Water Bottle for trying :)\nHint: Musketeers, Amigos, and Kings use me proudly.");
		}
	}
}
