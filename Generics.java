import java.io.*;
import java.util.*;
class Harish
{
	public static void main(String hh[])
	{
	   //TO PERFORM INTEGER DATA TYPE
		System.out.println("INTEGER  DATATYPE::");
		 int m[]=new int[10];
		int n;
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the n value:");
		n=d.nextInt();
		System.out.println("Enter the Element one by one:");
		for(int i=0;i<n;i++)
			m[i]=d.nextInt();
		Integer h[]=new Integer[n];
		for(int i=0;i<n;i++)
			h[i]=m[i];
		Hari<Integer>ha=new Hari<Integer>(h);
		 ha.display();
		
		//TO PERFORM FLOAT DATA TYPE
		System.out.println("FLOAT DATATYPE::");
		float s[]=new float[10];
		int y;
		//Scanner d=new Scanner(System.in);
		System.out.println("Enter the n value:");
		y=d.nextInt();
		System.out.println("Enter the Element one by one:");
		for(int i=0;i<y;i++)
			s[i]=d.nextFloat();
		Float p[]=new Float[y];
		for(int i=0;i<y;i++)
			p[i]=s[i];
		joel<Float>hb=new joel<Float>(p);
		hb.print();


	  //TO PERFORM ARRAYLIST CONCEPT
		System.out.println("ARRAYLIST::");
		int w;
		ArrayList<Integer>x=new ArrayList<Integer>();
		System.out.println("Enter the n value:");
		w=d.nextInt();
		System.out.println("Enter the element one by one:");
		for(int i=0;i<w;i++)
			x.add(d.nextInt());
		Integer r[]=new Integer[w];
		x.toArray(r);
		joel<Integer>ob=new joel<Integer>(r);
		ob.print();

	}
}
class Hari<T>
{
	T h[];
	
	Hari(T h[])
	{
		this.h=h;
		
	}
	void display()
	{
		Arrays.sort(h);
		for(int i=0;i<h.length;i++)
			System.out.println(h[i]);
		System.out.println("Maximum in Array:"+h[h.length-1]);
	}
	
}
class joel<T1>
{
	T1 h[];
	joel(T1 h[])
	{
		this.h=h;
	}
void print()
	{
		Arrays.sort(h);
		for(int i=0;i<h.length;i++)
			System.out.println(h[i]);
		System.out.println("Maximum in Array:"+h[h.length-1]);
	}

	
}