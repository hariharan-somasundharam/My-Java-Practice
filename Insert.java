import java.util.*;
class Insert
{
	int n,i,j,count=0;
	int a[]=new int[250];
	Scanner d=new Scanner(System.in);
	void input()
	{

		Random r=new Random();
		n=d.nextInt();
		for(i=0;i<n;i++)
			a[i]=r.nextInt(1000);
		for(i=0;i<n;i++)
			System.out.println((i+1)+".-->"+a[i]);
	}
	void logic()
	{
		int c;
		for(i=1;i<n;i++)
		{
			c=a[i];
			for(j=i-1;j>=0&&c<a[j];j--)
			{
				count++;
				a[j+1]=a[j];
			}
			a[j+1]=c;
		}
		System.out.println("Basic Operation:"+count);
	}
	void out()
	{
		System.out.println("Sorted Order::");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
class Naandhan
{
	public static void main(String []srg)
	{
		Insert p=new Insert();
		p.input();
		long s=System.nanoTime();
		p.logic();
		long h=System.nanoTime();
		p.out();
		System.out.println("Time Complexity:"+(h-s));
	}
}