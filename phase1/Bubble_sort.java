package phase1;
import java.util.Scanner;

public class Bubble_sort {
	public static void sort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {2,5,4,6,4,7,4,3,2,6};
		sort(a);
		for (int n:a)
		{
			System.out.println(n+" ");
		}

	}

}
