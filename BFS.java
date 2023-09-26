import java.util.*;
class Breadth
{
	int h[][]=new int[30][30];
	int p[]=new int[30];
	int s[]=new int[30];
	int i,j,n,st,rear,front,count=0;
	void input()
	{
		Scanner d=new Scanner(System.in);
		n=d.nextInt();
		System.out.println(n+"x"+n+" Matrix");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print("("+i+","+j+"):");
				h[i][j]=d.nextInt();
			}
		}
		System.out.println("MATRIX:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				System.out.print(" "+h[i][j]);
			System.out.print("\n");
		}
	}
	void logic()
	{
		
		Scanner d=new Scanner(System.in);
		System.out.print("Enter Vertex:");
		st=d.nextInt();
		s[rear++]=st;
		p[st]=1;
		for(i=front;i<rear;i++)
		{
			for(j=1;j<=n;j++)
			{
				count++;
				if(h[s[i]][j]==1&&p[j]!=1)
				{
					s[rear++]=j;
					p[j]=1;
				}
			}
		}
		
	}
	void out()
	{
		System.out.println("QUEUE:");
		for(i=front;i<rear;i++)
			System.out.print("\t"+s[i]);
		System.out.println("Basic Operation:"+count);
	}
}
class Naandhan
{
	public static void main(String []arg)
	{
		Breadth m=new Breadth();
		m.input();
		long s=System.nanoTime();
		m.logic();
		long p=System.nanoTime();
		m.out();
		System.out.println("Time Complexity:"+(p-s));
		
	}
}