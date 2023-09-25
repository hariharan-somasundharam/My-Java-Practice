import java.util.*;
class Linear
{
	int n,se,c=0;
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
		System.out.println("Enter the Search Value:");
		se=d.nextInt();
	}
	void logic()
	{
		for(int i=0;i<n;i++)
		{
			if(a[i]==se)
			{
				c++;
				break;
			}
		}
	}
	void out()
	{
		if(c>0)
			System.out.println("Element Found");
		else
			System.out.println("Element Not Found");
	}
}
class Naandhan
{
	public static void main(String []srg)
	{
		Linear p=new Linear();
		p.input();
		long s=System.nanoTime();
		p.logic();
		long h=System.nanoTime();
		p.out();
		System.out.println("Time Complexity:"+(h-s));
	}
}