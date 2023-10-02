import java.util.*;
class Quick
{
	int i,j,t,pivot,c=0;
	int partion(int a[],int st,int end)
	{
		pivot=a[st];
		i=st;
		j=end;
		while(i<j)
		{
			while(++c>0 && pivot>=a[i]&&i<=end)
				i++;
			while(++c>0 && pivot<=a[j]&&j>st)
				j--;
			if(i<j)
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			t=a[st];
			a[st]=a[j];
			a[j]=t;
			
		}
		
		return j;
	}
	void divide(int a[],int st,int end)
	{
		if(st<end)
		{
			j=partion(a,st,end);
			divide(a,st,j-1);
			divide(a,j+1,end);
		}
	}
}
class Naandhan
{
	public static void main(String []srg)
	{
		Quick p=new Quick();
		int n,c=0,i;
		int a[]=new int[250];
		Scanner d=new Scanner(System.in);
		Random r=new Random();
		n=d.nextInt();
		for(i=0;i<n;i++)
			a[i]=r.nextInt(1000);
		for(i=0;i<n;i++)
			System.out.println((i+1)+".-->"+a[i]);
		
		
		long s=System.nanoTime();
		p.divide(a,0,n-1);
		long h=System.nanoTime();
		System.out.println("Sorted Order:");
		for(i=0;i<n;i++)
			System.out.println(a[i]);

		System.out.println("no of times execution:"+p.c);
		System.out.println("Time Complexity:"+(h-s));
		
	}
}