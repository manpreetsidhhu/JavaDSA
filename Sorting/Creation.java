import java.util.InputMismatchException;
import java.util.Scanner;

public class Creation {

    private final Scanner sc;

    public Creation(Scanner sc) {
        this.sc = sc;
    }

    public int[] createArray() {
        int size = 0;
        while(true){
            try {
                System.out.print("Enter Size of array : ");
                size = sc.nextInt();
                if (size <= 0) {
                    throw new IllegalArgumentException("Array size must be positive.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter an Integer.");
                sc.next();
            }
        }

        int[] arr = new int[size];
        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            while (true) { 
                try {
                    System.out.print(i + ") ");
                    arr[i] = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                    sc.next();
                }
            }
        }
        return arr;
    }
}
