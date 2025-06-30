
import java.util.Scanner;

public class Printing {
    private Scanner sc;

    Printing(Scanner sc) {
        this.sc = sc;
    }

    public void recursion() {
        System.out.print("Enter a number to print number upto that using recursion (N) : ");
        int n = sc.nextInt();
        System.out.println("Recusion printing N to 1 : ");
        printNto1(n);
        System.out.println("\nRecusion printing 1 to N : ");
        print1toN(n);
        System.out.println();
    }

    public int printNto1(int n) {
        if (n == 0)
            return 0;
        System.out.print(n + " ");
        printNto1(n - 1);
        return n;
    }

    public int print1toN(int n) {
        if (n == 0)
            return 0;
        print1toN(n - 1);
        System.out.print(n + " ");
        return n;
    }
}
