
import java.util.Scanner;

public class Recursion {
    private Scanner sc;

    Recursion(Scanner sc) {
        this.sc = sc;
    }

    public int printNto1(int n){
        if(n==0) return 0;
        System.out.print(n+ " ");
        printNto1(n-1);
        return n;
    }

    public int print1toN(int n){
        if(n==0) return 0;
        print1toN(n-1);
        System.out.print(n + " ");
        return n;
    }
}
