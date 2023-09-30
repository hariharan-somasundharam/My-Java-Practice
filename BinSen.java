import java.util.*;
class BinSen
{
	int n,se,c=0,count=1;
	int a[]=new int[250];
	
	Scanner d=new Scanner(System.in);
	void input()
	{

		Random r=new Random();
		n=d.nextInt();
		for(int i=0;i<n;i++)
			a[i]=r.nextInt(1000);
		for(int i=0;i<n;i++)
			System.out.println((i+1)+".-->"+a[i]);
		
	}
	void sort()
	{
		int min,t;
		for(int i=0;i<n;i++)
		{
			min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			if(min!=1)
			{
				t=a[i];
				a[i]=a[min];
				a[min]=t;
			}
		}
		System.out.println("Sorted value:");
		for(int i=0;i<n;i++)
			System.out.println((i)+"-->"+a[i]);
		System.out.println("Enter the Search Value:");
		se=d.nextInt();
	}
	void logic()
	{
		int f,l,mid;
		f=0;
		l=n-1;
		while(f<=l)
		{
			mid=(f+l)/2;
			if(a[mid]==se)
			{
				c++;
				break;
			}
			else if(a[mid]>se)
				l=mid-1;
			else
				f=mid+1;
			count++;
		}
	}
	void out()
	{
		if(c>0)
			System.out.println("Element Found");
		else
			System.out.println("Element Not Found");
		System.out.println("Basic Operation:"+count);
	}
}
class Naandhan
{
	public static void main(String []srg)
	{
		BinSen p=new BinSen();
		p.input();
		p.sort();
		long s=System.nanoTime();
		p.logic();
		long h=System.nanoTime();
		p.out();
		System.out.println("Time Complexity:"+(h-s));
		
	}
}