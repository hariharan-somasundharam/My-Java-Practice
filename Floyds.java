import java.util.*;
class Floyds
{
	int f[][]=new int [30][30];
	int D[][]=new int [30][30];
	int n,i,j,k;
	void input()
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Limit:");
		n=d.nextInt();
		System.out.println("Weigth between Adj Vertices:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				f[i][j]=d.nextInt();
		}
		System.out.println("Given Matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(" "+f[i][j]);
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
					D[i][j]=f[i][k]+f[k][j];
					if(f[i][j]>D[i][j])
						f[i][j]=D[i][j];
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
				System.out.print(" "+f[i][j]);
			System.out.print("\n");
		}
	}
}
class Hari
{
	public static void main(String []arg)
	{
		Floyds m=new Floyds();
		m.input();
		m.logic();
		m.out();
	}
}
