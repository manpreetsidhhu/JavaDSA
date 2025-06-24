
import java.util.Scanner;

public class Elements {

    private final int[] arr;
    private final Scanner sc;

    Elements(int[] arr, Scanner sc) {
        this.arr = arr;
        this.sc = sc;
    }

    public void largestElement() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element : " + max);
    }

    public void secondLargest() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                if (res == -1) {
                    res = i;
                } else if (arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        System.out.println("Second Largest element : "+ arr[res]);
    }

    public void smallestElement() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest Element : " + min);
    }

    public void secondSmallest() {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two distinct elements.");
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                if (res == -1) {
                    res = i;
                } else if (arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        System.out.println("Second Smallest Element : " + arr[res]);
    }

    public int immediateSmaller() {
        System.out.print("immidiate smaller element of : ");
        int el = sc.nextInt();
        int smaller = Integer.MIN_VALUE;
        System.out.print("Immidiate smaller element for element " + el + " is : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < el && arr[i] > smaller) {
                smaller = arr[i];
            }
        }
        if (smaller == Integer.MIN_VALUE) {
            System.out.print("NULL ");
            return -1;
        }
        return smaller;
    }

    public int immediateLarger() {
        System.out.print("immidiate larger element of : ");
        int el = sc.nextInt();
        int larger = Integer.MAX_VALUE;
        System.out.print("Immidiate larger element for element " + el + " is : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > el && arr[i] < larger) {
                larger = arr[i];
            }
        }
        if (larger == Integer.MAX_VALUE) {
            System.out.print("NULL ");
            return -1;
        }
        return larger;
    }

}