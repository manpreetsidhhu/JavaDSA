
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            LinkedList list = new LinkedList(sc);
            list.createList();
            list.insert(55, 68, 89, 784);
            list.insert(85);
            list.display();

            Node head = list.getHead();

            UpdateList update = new UpdateList(sc, head);
            update.delete();
            System.out.print("Updated (Deleted Node) ");
            list.display();

            // list.setHead(update.insert()); // it was for insert() was returning a temp headed linkedlist not the head headed
            update.insert();
            System.out.print("Updated (Inserted Node) ");
            list.display();
        }
    }
}
