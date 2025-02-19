//Oliver Montero
//CSC321
//Lab6 C


#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int x = 5;
	int y = 2;
	double a = 5.0;
	double b = 2.0;

	printf("Integers: \n");
	printf("x+y*x/y-x = %d\n", x+y*x/y-x);
	printf("-x-y/x*y+x = %d\n", -x-y/x*y+x);
	printf("x+y-x/y = %d\n", x+y-x/y);

	printf("Doubles: \n");
	printf("x+y*x/y-x = %1f\n", a+b*a/b-a);
	printf("-x-y/x*y+x = %1f\n", -a-b/a*b+a);
	printf("x+y-x/y = %1f\n", a+b-a/b);

	return EXIT_SUCCESS;
}

