import java.util.*;
class Warshall
{
	int w[][]=new int [30][30];
	int D[][]=new int [30][30];
	int n,i,j,k;
	void input()
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Limit:");
		n=d.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				w[i][j]=d.nextInt();
		}
		System.out.println("Given Matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(" "+w[i][j]);
			System.out.print("\n");
		}
	}
	void logic()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				for(k=0;k<n;k++)
				{
					D[j][k]=(w[j][i]&w[i][k]);
					if(w[j][k]<D[j][k])
						w[j][k]=D[j][k];
				}
			}
		}
	}
	void out()
	{
		System.out.println("Resultant Matrix::");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(" "+w[i][j]);
			System.out.print("\n");
		}
	}
}
class Hari
{
	public static void main(String []arg)
	{
		Warshall m=new Warshall();
		m.input();
		m.logic();
		m.out();
	}
}