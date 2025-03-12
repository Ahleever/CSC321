
//Oliver Montero
//Lab 09 in C
//

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

int main(void)
{
	int guess = 0, x = 3, y, i;
	srand(time(NULL));
	y = 1 + (rand() % 20);
	printf("Rand = %d\n", y);

	while(guess < 1 || guess > 20)
	{
		printf("Enter a number between 1 and 20:\n");
		scanf("%d", &guess);
		if(guess < 1 || guess > 20)
		{
			printf("Number out of range, choose between 1 and 20: \n");
		}
	}

	if (guess != y)
	{
		printf("You did not guess the right number. The random number was %d\n", y);
		if(guess < y)
		{
			printf("Your guess was lower than the number\n");
		}
		else
		{
			printf("Your guess was higher than the number\n");
		}
	}
	else
	{
		printf("Wow! You guessed the random number. It was %d\n", y);
		for (i = 0; i < y; i++)
		{
			printf("%d. Winner Winner!\n", i + 1);
		}
	}
	return EXIT_SUCCESS; 
}
