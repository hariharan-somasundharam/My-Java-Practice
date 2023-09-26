import java.util.*;
class Depth
{
	int h[][]=new int[30][30];
	int visited[]=new int[30];
	int stack[]=new int[30];
	int forward[]=new int[30];
	int backward[]=new int[30];
	int i,j,n,st,rear=0,top=0,count=0,fp=0,bp=0;
	void input()
	{
		Scanner d=new Scanner(System.in);
		n=d.nextInt();
		System.out.println(n+"x"+n+" Matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("("+i+","+j+"):");
				h[i][j]=d.nextInt();
			}
		}
		System.out.println("MATRIX:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(" "+h[i][j]);
			System.out.print("\n");
		}
	}
	void logic()
	{
		
		Scanner d=new Scanner(System.in);
		System.out.print("Enter Vertex:");
		st=d.nextInt();
		stack[top]=st;
		forward[rear++]=st;
		visited[st]=1;
		for(i=top;i>=0&&top<n;)
		{
			for(j=0;j<n;j++)
			{
				if(++count>0&&h[stack[i]][j]==1&&visited[j]!=1)
				{
					stack[++top]=j;
					visited[j]=1;
					forward[rear++]=j;
					i=top;
					break;
				}
			}
			if(top>=0&&count++>0&&j==n)
			{
				backward[bp++]=stack[top--];
				i=top;
			}
		}
		
	}
	void out()
	{
		System.out.println("Forward Path:");
		for(i=0;i<n;i++)
			System.out.print(" "+forward[i]+"-");
		System.out.println("\nBackward Path:");
		for(i=0;i<n;i++)
			System.out.print(" "+backward[i]+"-");
		System.out.println("\nBasic Operation:"+count);
	}
}
class Naandhan
{
	public static void main(String []arg)
	{
		Depth m=new Depth();
		m.input();
		long s=System.nanoTime();
		m.logic();
		long p=System.nanoTime();
		m.out();
		System.out.println("Time Complexity:"+(p-s));
		
	}
}