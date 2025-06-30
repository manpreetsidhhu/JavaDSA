
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            Printing print = new Printing(sc);
            print.recursion();
            Addition add = new Addition(sc);
            add.addition();
            RopeCutting rope = new RopeCutting(sc);
            rope.ropePieces();
        }
    }
}
