
import java.util.Scanner;

public class RopeCutting {
    private Scanner sc;

    public RopeCutting(Scanner sc) {
        this.sc = sc;
    }

    public int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public int maxPieces(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;
        int res = max(
                maxPieces(n - a, a, b, c),
                maxPieces(n - b, a, b, c),
                maxPieces(n - c, a, b, c));
        if (res == -1)
            return -1;
        return res + 1;
    }

    public void ropePieces(){
        System.out.print("Enter total rope length (n): ");
        int n = sc.nextInt();
        System.out.print("Enter cut lengths a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = maxPieces(n, a, b, c);
        System.out.println("Maximum number of pieces: " + result);
    }
}
