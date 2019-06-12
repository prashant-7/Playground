#include<stdio.h>
int main()
{
  int n=365,a,b;
  a=n/4;
  b=n%4;
  printf("Quotient: %d", a);
  printf("\nRemainder: %d", b);
  return 0;
}