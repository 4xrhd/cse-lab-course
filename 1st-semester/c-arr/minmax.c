#include <stdio.h>


void minMax(int arr[],int len,int *min,int *max){

*min=*max=arr[0];
for (int i = 1; i < len; ++i)
{
	if (arr[i] < *min)
	{
		*min = arr[i];
	}if (arr[i] > *max)
	{
		*max = arr[i];
	}
	
}
}
int main()
{
	int arr[]={12,55,6,7,8,9,11,23,56};
	int min,max;
	int len;
	len = sizeof(arr)/sizeof(arr[0]);

	minMax(arr, len , &min , &max);
	printf("min : %d \n",min );
	printf("max : %d \n",max );
	return 0;
}
