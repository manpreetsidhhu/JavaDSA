
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

            list.setHead(update.insert());
            System.out.print("Updated (Inserted Node) ");
            list.display();

            update.sortedInsert();
            System.out.print("Updated (Sorted Insertion) ");
            list.display();

            Operations LinkedList = new Operations(sc, head);

            int length = LinkedList.length();
            System.out.println("Length of Linked List : " + length);

            int midNode = ((length % 2 == 0) ? (length / 2) + 1 : (length + 1) / 2);
            System.out.println("Middle of Linked List is present at Node " + midNode + " having value : " + LinkedList.middleNode());
            
            LinkedList.nthLastNode();
            LinkedList.removeDuplicates();
            list.display();

            Reverse reverse = new Reverse(sc, head);
            reverse.reverse();
        }
    }
}
