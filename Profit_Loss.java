import java.util.Scanner;
import java.text.DecimalFormat;

public class Profit_Loss {
    public static void main(String []arg)
    {
        Scanner d = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0000");
        System.out.print("Enter the Cost Price: ");
        int cp = d.nextInt();
        System.out.print("Enter the Selling Price: ");
        int sp = d.nextInt();
        if(sp>cp){
            float profit = sp-cp;
            float profitpercent = (profit/cp)*100;
            System.out.println("Profit in Percentage :"+df.format(profitpercent));
        }
        else{
            float loss = cp-sp;
            float losspercent = (loss/cp)*100;
            System.out.println("Loss in Percentage :"+df.format(losspercent));
        }
    }
}
