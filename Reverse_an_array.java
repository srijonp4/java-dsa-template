
// Reverse an array
import java.util.Scanner;

public class Reverse_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // call the functions and try the code here
        without_using_extra_array(arr);
        sc.close();
    }

    public static void using_extra_array(int[] arr) {
        int[] rev = new int[arr.length];
        int c = 0;// counter for rev array
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[c] = arr[i];
            c++;// this goes to the next index of the rev array
        }
        print(rev);
    }

    public static void without_using_extra_array(int[] arr) {
        int n = arr.length;
        // we only go till n/2 because with i we can figure out n-i-1
        for (int i = 0; i < n / 2; i++) {
            // we swap element at the left most index and right most index
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        print(arr);
    }

    public static void using_recursion(int[] arr, int s, int e) {
        if (s >= e)
            return;// terminating condition
        // then we perform swap
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        // call for thee next indexes
        using_recursion(arr, s + 1, e - 1);

    }

    // to print the array
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

}
