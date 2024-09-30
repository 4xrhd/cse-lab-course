#include <stdio.h>
int main(int argc, char const *argv[])
{
	int x = 10 ,*ptr = &x;
	printf("%d \n \t " , *ptr+10);
	return 0;
}