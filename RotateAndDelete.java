import java.util.ArrayList;
import java.util.Scanner;

public class RotateAndDelete {
    public static int rotateDelete(ArrayList<Integer> arr) {
        int n = arr.size();
        int indx = 0, sec_indx = 0, last_indx = n - 1;

        while (arr.size() != 1) {
            // Rotate: Move the last element to the front
            int last_ele = arr.get(arr.size() - 1);
            arr.add(0, last_ele);
            arr.remove(arr.size() - 1);

            // Calculate the index to delete
            int delete_indx = last_indx - indx - sec_indx;
            if (delete_indx < 0) {
                delete_indx = 0;
            }

            // Delete the element
            arr.remove(delete_indx);

            indx++;
            sec_indx++;
        }

        return arr.get(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Input the elements of the array
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        // Call the rotateDelete function and print the result
        int result = rotateDelete(arr);
        System.out.println("The last element left is: " + result);
        scanner.close();
    }
}
