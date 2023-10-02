import java.util.Scanner;
class Nearest
{
	int i,j,n,st,sum=0,h=0;
	int cost[][]=new int[30][30];
	int visited[]=new int[30];
	Scanner d=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the No.of Vertices:");
		n=d.nextInt();
		System.out.println("Enter the Edge Weight:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==j)
					cost[i][j]=0;
				else
				{
					System.out.print("Edge Weight of Vertices ("+i+","+j+")=");
					cost[i][j]=d.nextInt();
				 	if(cost[i][j]==0||cost[i][j]==999)
					{
						h++;
						System.out.println("You Have Entered Incomplete Graph");
						break;
					}
				}
			}
			if(j!=n+1)
				break;
		}
		if(h==0)
		{
		System.out.println("Adjacency Matrix::");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				System.out.print(" "+cost[i][j]);
			System.out.print("\n");
		}
		System.out.println("Enter the Source Vertex:");
		st=d.nextInt();
		}
	}
	void logic()
	{
		h=1;
		visited[h]=st;
		if(st==n)
			st=0;
		for(i=st+1;i<=n;i++)
		{
			if(visited[1]==i)
			{
				sum=sum+cost[visited[h]][i];
				visited[++h]=i;
				break;
			}
			else
			{
				sum=sum+cost[visited[h]][i];
				visited[++h]=i;
				if(i==n)
					i=0;
			}
		}
	}
	void out()
	{
		System.out.println("Path:");
		for(i=1;i<=n+1;i++)
			System.out.print(visited[i]+" ->");
		System.out.print("\n");
		System.out.print("Minimum Distance:"+sum);
		
	}
}
class Naandhan
{
	public static void main(String []arg)
	{
		Nearest p=new Nearest();
		p.input();
		p.logic();
		p.out();
	}
}