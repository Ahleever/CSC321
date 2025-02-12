//Oliver Montero
//CSC321
//Lab5


#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
        printf("Hello World\n");

        int a = 5;
        float b = 6.2;
        char c = 'C';
        double d = 7.77;

        printf("Variable a is a Integer = %d, Address = %p\n", a, &a);
        printf("Variable b is a  Float = %f, Address = %p\n", b, &b);
        printf("Variable c is a Character = %c, Address = %p\n", c, &c);
        printf("Variable d is a Double = %1f, Address = %p\n" , d, &d);

	if(c)
	{
	int x = 1;
	}
	//printf("The value of x is %d \n", x);

	int i = 0;
	int arr[10] = {0};
	int counter = 1;

	for(i = 0; i < 10; i++)
	{
		printf("#%d. Address of arr[%d] is %p\n", counter, arr[i], &arr[i]);
		counter++;
	}

        return EXIT_SUCCESS;
}
