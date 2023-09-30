import java.io.DataInputStream;
class bul
{
  int a[]=new int[5];
  int n;
  void input() throws Exception
  {
    DataInputStream d=new DataInputStream(System.in);
    System.out.println("enter n elements:");
    n=Integer.parseInt(d.readLine());
      System.out.println("enter elements one by one:");
    for(int i=0;i<n;i++)
    {
      a[i]=Integer.parseInt(d.readLine());
    }
  
  }
  void logic()
  {
    int c;
     for(int i=0;i<n;i++)
    {
       for(int j=0;j<n-1;j++)
      {
         if(a[j]>a[j+1])
         {
           c=a[j+1];
           a[j+1]=a[j];
           a[j]=c;
         }
      }
    }
  }
  void dis()
  {
   for(int i=0;i<n;i++)
   {
     System.out.println(a[i]);
   } 
  }  
}
class m
{
 public static void main(String a1[])throws Exception
  {
    bul l=new bul();
    l.input();
    l.logic();
    l.dis();
  }
}