import java.util.Scanner;
class Hari
{
	public static void main(String []arg)
	{
		int i,j,n,source;
		int cost[][]=new int[10][10];
		int dis[]=new int[10];
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the No.of Nodes:");
		n=d.nextInt();
		System.out.println("Enter the Cost Between Adj Nodes:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print("Cost Between ("+i+","+j+")=");
				cost[i][j]=d.nextInt();
				if(cost[i][j]==0)
					cost[i][j]=999;
			}
		}
		System.out.println("Adjacency Matrix::");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				System.out.print(" "+cost[i][j]);
			System.out.print("\n");
		}
		System.out.println("Enter the Source Vertex:");
		source=d.nextInt();
		dijikstra(n,cost,source,dis);
		System.out.println("Shortest Path Cost from (source:"+source+")");
		for(i=1;i<=n;i++)
		{
			if(source!=i)
			{
				System.out.println("("+source+","+i+")="+dis[i]);
			}
	
		}
	}
	static void dijikstra(int n,int cost[][],int source,int dis[])
	{
		int v=0,i,c=1,min;
		int visited[]=new int [10];
		for(i=1;i<=n;i++)
		{
			visited[i]=0;
			dis[i]=cost[source][i];
		}
		visited[source]=1;
		dis[source]=0;
		while(c<=n)
		{
			min=999;
			for(i=1;i<=n;i++)
			{
				if(dis[i]<min&&visited[i]==0)
				{
					min=dis[i];
					v=i;
				}
			}
			visited[v]=1;
			c++;
			for(i=1;i<=n;i++)
			{
				if(dis[i]>dis[v]+cost[v][i])
					dis[i]=dis[v]+cost[v][i];
			}
		}
	}
}