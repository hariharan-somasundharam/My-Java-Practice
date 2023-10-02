import java.util.Scanner;
import java.util.Random;
class Quickran
{
	int i,j,t,pivot,c=0,H=0;
	int partion(int a[],int st,int end,int n)
	{
		Random r=new Random();
		int p=r.nextInt(n-1);
		int pi=st+(p%(end-st+1));
		t=a[st];
		a[st]=a[pi];
		a[pi]=t;
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
		}
		t=a[st];
		a[st]=a[j];
		a[j]=t;
return j;
 	}
	void divide(int a[],int st,int end,int n,int k)
	{
		if(st<end)
		{
			j=partion(a,st,end,n);
			if(++H>0&&j==k)
				System.out.println("k th smallest number is="+a[k]);
			else if(++H>0&&k<j-1)
				divide(a,st,j-1,n,k);
			else
			{
				++H;
				divide(a,j+1,end,n,k);
			}
		}
	}
}
class Hari
{
	public static void main(String []srg)
	{
		Quickran p=new Quickran();
		int n,c=0,i;
		int a[]=new int[250];
		Scanner d=new Scanner(System.in);
		Random r=new Random();
		n=d.nextInt();
		for(i=0;i<n;i++)
			a[i]=r.nextInt(100);
		for(i=0;i<n;i++)
			System.out.println((i+1)+".-->"+a[i]);
		int k=d.nextInt();
		if(k<=n&&k>=0)
		{
		long s=System.nanoTime();
		p.divide(a,0,n-1,n,k);
		long h=System.nanoTime();
                System.out.println("sorted array");
                for(i=0;i<n;i++)
                System.out.println(a[i]);

		System.out.println("no of times execution:"+p.H);
		System.out.println("Time Complexity:"+(h-s));
		}
		else 
			System.out.println("k is out range");
	}
}