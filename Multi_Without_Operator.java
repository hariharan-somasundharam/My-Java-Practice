import java.util.Scanner;

public class Multi_Without_Operator {
    public static void main(String []arg)
    {
        int a,b,r=0;
        Scanner d = new Scanner(System.in);
        a = d.nextInt();
        b = d.nextInt();
        if(a!=0 && b!=0)
        {
            if(a<b || a<0)
            {
                for(int i=1;i<=a;i++)
                    r+=b;
                System.out.println("-"+r);
            }
            else if(b<a || b<0)
            {
                for(int i=1;i<=b;i++)
                    r+=b;
                System.out.println("-"+r);
            }
            else if(a==b || a>0 && b>0)
            {
                for(int i=1;i<=b;i++)
                    r+=b;
                System.out.println(r);
            }
        }
        else
            System.out.print(r);
    }
}
