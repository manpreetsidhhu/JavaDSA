
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            LinkedList list = new LinkedList(sc);
            list.createList();
            list.createList();

            Node head = list.getHead();
        }
    }
}
