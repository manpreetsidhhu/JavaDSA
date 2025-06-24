
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            Recursion obj = new Recursion(sc);
            System.out.print("Enter a number to print number upto that using recursion (N) : ");
            int n = sc.nextInt();
            System.out.println("Recusion printing N to 1 : ");
            obj.printNto1(n);
            System.out.println("\nRecusion printing 1 to N : ");
            obj.print1toN(n);
            System.out.println();
        }
    }
}
