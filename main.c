#include <stdio.h>
#include <conio.h>
int main()
{
   int num1, num2, sum;
   printf("Enter first number: \n");
   scanf("%d", &num1);
   printf("Enter second number: \n");
   scanf("%d", &num2);

   sum = num1 + num2;
   printf("Sum of the entered numbers are: %d", sum);
   getch();
   return 0;
}