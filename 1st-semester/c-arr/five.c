#include <stdio.h>

int  main(int argc, char const *argv[])
{
	int arr[5][5]={
{3,4,12,10,4},
{5,6,12,4,1},
{3,6,7,8,10},
{12,4,6,2,10},
{12,01,20,10,1}
	} ;
	int sum=0;
int count=5;
//row
	for (int i = 0; i < count; ++i)
	{
		for (int j = 0; j < count; ++j)
		{
			sum =sum +arr[i][j];
			
		}
		printf("%d  ",sum );
		sum = 0 ;
		}
			printf("\n\n");


// sum of colums


		for (int i = 0; i < count; ++i)
	{
		for (int j = 0; j < count; ++j)
		{
			sum =sum +arr[j][i];
			
		}
		printf("%d  ",sum );
		sum = 0 ;
		}

	return 0;
}