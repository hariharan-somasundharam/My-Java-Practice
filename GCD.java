import java.io.*;
import java.util.Scanner;
class Harish
{
public static void main(String []arg)
{
	int a,b,c;
	Scanner d=new Scanner(System.in);
	a=d.nextInt();
	b=d.nextInt();
	while(b!=0)
	{
		c=b;
		b=a%b;
		a=c;
	}
	System.out.println("GCD:"+a);
	
}
}