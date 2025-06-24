
import java.util.Scanner;

public class Creation {

    private final Scanner sc;

    public Creation(Scanner sc) {
        this.sc = sc;
    }

    public int[] createArray() {
        int[] arr;
        System.out.print("Enter Size of array : ");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            System.out.print(i + ") ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
