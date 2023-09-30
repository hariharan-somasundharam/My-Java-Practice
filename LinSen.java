import java.io.DataInputStream;
class linear
{
  int a[]=new int[5];
  int n,se;
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
    System.out.println("enter search element:");
    se=Integer.parseInt(d.readLine());
  }
  void logic()
  {
     int c=0;
     for(int i=0;i<n;i++)
     {
       if(se==a[i])
           c++;
     }
     if(c>0)
       System.out.println("ssss");
     else
         System.out.println("no");  
  }
}
class m
{
 public static void main(String a1[])throws Exception
  {
    linear l=new linear();
    l.input();
    l.logic();
  }
}