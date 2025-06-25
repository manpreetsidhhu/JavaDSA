import java.util.Scanner;

public class BinarySearch {
    private final int[] arr;
    private final Scanner sc;
    private int el;

    BinarySearch(int[] arr, Scanner sc) {
        this.arr = arr;
        this.sc = sc;
    }

    public int binarySearch() {
        if (!new CheckSorted(arr).isSorted()) {
            new UpdateArray(arr,sc).sortArray();
        }
        System.out.print("Enter Element to search : ");
        el = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + (high - low)) / 2;
            if (arr[mid] == el) {
                System.out.print(el + " is present in array at index : ");
                return mid;
            } else if (arr[mid] > el) {
                high = mid - 1;
            } else if (arr[mid] < el) {
                low = mid + 1;
            }
        }
        System.out.print(el + " element is not present in array : ");
        return -1;
    }

}
