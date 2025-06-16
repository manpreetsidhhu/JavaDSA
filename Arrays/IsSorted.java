import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element number " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
            boolean isAscending = true;
            boolean isDescending = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    isDescending = false;
                } else if (arr[i] > arr[i + 1]) {
                    isAscending = false;
                }
            }
            if (isAscending) {
                System.out.println("Array is sorted in ascending order.");
            } else if (isDescending) {
                System.out.println("Array is sorted in descending order.");
            } else {
                System.out.println("Array is not sorted.");
            }
        }
    }
}
