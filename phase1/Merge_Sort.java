package phase1;

public class Merge_Sort {
	public static void  sort(int a[],int b[],int c[])
	{
		int i = 0,j = 0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
		}
		while(i<a.length)
		{
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			j++;
			k++;
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int a[]= {3,6,4,1};
	int b[]= {6,8,7,5};
	int c[]=new int[a.length + b.length];
	merge(a,b,c);
	for(int n:c)
	{
		System.out.println(c+ " ");
	}
		
		}
		private static void merge(int[] a, int[] b, int[] c) {
			// TODO Auto-generated method stub
			
		}

}
