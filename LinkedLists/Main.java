
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            LinkedList list = new LinkedList(sc);
            list.createList();
            list.insert(8888);
            list.display();

            Node head = list.getHead();
            
            UpdateList update = new UpdateList(sc, head);
            update.delete();
            System.out.print("Updated (Deleted Node) ");
            list.display();
            list.setHead(update.insert());
            System.out.println("Updated (Inserted Node) ");
            list.display();
        }
    }
}
