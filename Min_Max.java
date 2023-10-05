import java.util.Scanner;
class Min_Max
{
	int min,max,c=0;
	void divide(int a[],int st,int end)
	{
		if(st==end)
		{
			min=a[st];
			max=a[end];
		}
			
		else
		{
			int mid=(st+end)/2;
			divide(a,st,mid);
			int m1=min;
			int m2=max;
			divide(a,mid+1,end); c++;
			if(m1<min)
				min=m1;
			if(m2>max)
				max=m2;
		}
	}
	void out()
	{
		System.out.println("Minimum Value:"+min);
		System.out.println("Maximum Value:"+max);
		System.out.println("No.of Times Basic Operation Works:"+c);
	}
}
class Hari
{
	public static void main(String []arg)
	{
		int a[]=new int [20];
		int n,i,st,end;
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the Input size:");
		n=d.nextInt();
		System.out.println("Enter the Elements:");
		for(i=0;i<n;i++)
			a[i]=d.nextInt();
		st=0;
		end=n-1;
		
		Min_Max m=new Min_Max();
		long s=System.nanoTime();
		m.divide(a,st,end);
		long p=System.nanoTime();
		m.out();
		System.out.println("Time Complexity:"+(p-s));
		
	}
}