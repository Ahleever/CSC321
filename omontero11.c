//Oliver Montero
//Lab 11

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double hypotenuse(double base, double height);

int main(void)
{
	double x, y, z;
	printf("Enter the base of the triangle: \n");
	scanf("%lf", &x);
	printf("Enter the height of the triangle: \n");
        scanf("%lf", &y);

	z = hypotenuse(x, y);

	printf("The hypotenuse of the triangle is %lf\n", z);
	return EXIT_SUCCESS;
}

double hypotenuse(double base, double height)
{
	double calc = base * base + height * height;
	return sqrt(calc);
}
