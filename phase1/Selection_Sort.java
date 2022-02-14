package phase1;

public class Selection_Sort {
	public static void sort(int a[])
	{
		for(int i=0;i<a.length-1;i++) 
		{
			int minIndex=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[minIndex])minIndex=j;
			}
			if(i!=minIndex)
			{
				int temp=a[minIndex];
				a[minIndex]=a[i];
				a[i]=temp;
			}
		}

	}
	public static void main(String[] args) {
		int a[]= {8,2,7,4,6,5,8,1};
		sort(a);
		for(int n:a)
		{
			System.out.println(n+ " ");
		}
	}

}
