import java.util.Scanner;

public class Missing_In_Array {

    int missingNumber(int n, int arr[]) {
        int[] freq = new int[n];
        for (int i : arr) {
            if (i >= 1 && i <= n) {
                freq[i - 1]++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (freq[i] == 0) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Missing_In_Array m = new Missing_In_Array();

        Scanner d = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = d.nextInt();
        int arr[] = new int[n - 1];
        System.out.println("Enter the Array Elements:");

        for (int i = 0; i < n - 1; i++) {
            arr[i] = d.nextInt();
        }

        int missing = m.missingNumber(n, arr);

        System.out.println("Missing Element: " + missing);
    }
}
