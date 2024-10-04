import java.util.*;
public class Minimum_Jump {
    int minJumps(int[] arr) {
        int n = arr.length;

       
        if (n == 1) return 0;
        if (arr[0] == 0) return -1;

        int maxReach = arr[0]; 
        int steps = arr[0];  
        int jumps = 1;         

        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps;

           
            maxReach = Math.max(maxReach, i + arr[i]);

            
            steps--;

            
            if (steps == 0) {
    
                jumps++;

                
                if (i >= maxReach) return -1;

                
                steps = maxReach - i;
            }
        }

        return -1; 
    }

    public static void main(String []arg){
        Minimum_Jump m = new Minimum_Jump();

        Scanner d = new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int n = d.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++)
            arr[i]=d.nextInt();

        int jumps = m.minJumps(arr);
        System.out.println("Minimum Jumps:"+jumps);

    }
}
