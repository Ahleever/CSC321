//Oliver Montero
//Midterm2 in C

#include <stdio.h>
#include <stdlib.h>

void name(int num);

int main(void)
{
	int n;
	printf("Enter the amount of times you want to see me ;): ");
	scanf("%d",&n);
	name(n);
	return EXIT_SUCCESS;
}

void name(int num)
{
	int i;
	for (i = 0; i< num; i++)
	{
		printf("%d. Oliver Montero\n", i + 1);
	}
}
