import java.util.*;
class Mains
{
    void logic() 
    {
        int N,X,R;
        Scanner d=new Scanner(System.in);
        
        
        N=d.nextInt();
        X=d.nextInt();
        if(X==0 || N==0)
        {
         System.out.print(" "); 
          
        }
        else
            System.out.print((int)Math.pow(X,N));
        
    }
}
class Main 
{
    public static void main(String []arg)
    {
        Mains m=new Mains();
        m.logic();
    }
}
