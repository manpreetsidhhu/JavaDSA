
import java.util.Scanner;

public class Searching {

    private final int[] arr;
    private int el;
    private final Scanner sc;

    Searching(int[] arr,Scanner sc) {
        this.sc = sc;
        this.arr = arr;
    }

    public void searchElement() {
        System.out.print("Element to be searched : ");
        el = sc.nextInt();
        int j = 0;
        boolean found = false;
        System.out.print("Element " + el + " is found at indexes : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                found = true;
                System.out.print(i + " ");
                j++;
            }
        }
        if (!found) {
            System.out.println("null (element is not present in array)");
        } else {
            System.out.println("\nNumber of occurrences is : " + j);
        }
    }

}
