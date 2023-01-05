import java.util.*;
import java.lang.*;
class selectionsort
{
	public static void swap(int a[],int b,int c)
	{
		int temp=a[b];
		a[b]=a[c];
		a[c]=temp;
	}
	public static void sort(int a[],int l)
	{
		for(int i=0;i<l;i++)
		{
			int min=i;
			for(int j=i+1;j<l;j++)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			swap(a,i,min);
		}
		for(int i=0;i<l;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String args[])
	{
		int a[]={7,4,10,8,3,1};
		int l=a.length;
		sort(a,l);
                System.out.println("hi Karthik");
	}
}
