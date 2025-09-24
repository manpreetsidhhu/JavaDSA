import java.util.Scanner;

public class Reverse {

    private Node head;
    private Scanner sc;

    public Reverse(Scanner sc, Node head) {
        this.head = head;
        this.sc = sc;
    }

    public void reverse() {
        LinkedList list = new LinkedList(sc);
        Operations LinkedList = new Operations(sc, head);
        int n = 0;
        while (n < 1 || n > 3) {
            System.out.println("select a reversing method : \n1) Iterative Reverse\n2) Recursive Reverse\n3) Recursive Reverse (Approach 2)");
            n = sc.nextInt();
            if (n < 1 || n > 3) {
                System.out.println("Invalid Input");
            }
        }
        switch (n) {
            case 1 -> {
                list.setHead(LinkedList.reverse());
                System.out.print("Reversed (iterative) (Method 1) ");
            }
            case 2 -> {
                list.setHead(LinkedList.recReverse2(head));
                System.out.print("Reversed (recursive) (Method 2) ");
            }
            case 3 -> {
                list.setHead(LinkedList.recReverse1(head));
                System.out.print("Reversed (recursive) (Method 3) ");
            }
            default ->
                System.out.println("Invalid Input");
        }
        list.display();
    }
}
