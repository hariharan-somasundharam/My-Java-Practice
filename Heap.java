import java.util.*;
class Heap
{
	int n;
	int a[]=new int[250];
	
	Scanner d=new Scanner(System.in);
	void input()
	{

		Random r=new Random();
		n=d.nextInt();
		for(int i=1;i<n;i++)
			a[i]=r.nextInt(1000);
		for(int i=0;i<n;i++)
			System.out.println((i+1)+".-->"+a[i]);
		
	}
	void sort()
	{
		int m,k,i,j,t;
		for(m=n;m>1;m--)
		{
			for(k=m/2;k>0;k--)
			{
				for(i=k;(2*i)<m;)
				{
					j=2*i;
					if(j<m)
					{
						if(a[j]<a[j+1])
							j=j+1;
					}
					if(a[i]<a[j])
					{
						t=a[i];
						a[i]=a[j];
						a[j]=t;
						i=j;
					}
					else
						break;
				}
			}
			t=a[1];
			a[1]=a[m];
			a[m]=t;
		}
	}
	
	void out()
	{
		System.out.println("Sorted Order:");
		for(int i=1;i<=n;i++)
			System.out.println(a[i]);		
	}
}
class Naandhan
{
	public static void main(String []srg)
	{
		Heap p=new Heap();
		p.input();
		
		long s=System.nanoTime();
		p.sort();
		long h=System.nanoTime();
		p.out();
		System.out.println("Time Complexity:"+(h-s));
		
	}
}