
import java.util.Scanner;

public class Operations {

    private Scanner sc;
    private Node head;

    public Operations(Scanner sc, Node head) {
        this.sc = sc;
        this.head = head;
    }

    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void nthLastNode() {
        System.out.print("Nth Node from End : ");
        int n = sc.nextInt();
        if (n < 0 || n > length()) {
            System.out.println("Invalid Input | Index is out of Bounds");
            return;
        }
        Node slow = head;
        Node fast = head;
        while (n != 0) {
            fast = fast.next;
            n--;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("Nth Node from End of LinkedList is : " + slow.data);
    }

    public int middleNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public Node reverse() {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public Node recReverse1(Node headerNode) {
        if (headerNode == null || headerNode.next == null) {
            return headerNode;
        }
        Node restHead = recReverse1(headerNode.next);
        Node restTail = headerNode.next;
        restTail.next = headerNode;
        headerNode.next = null;
        head = restHead;
        return head;
    }

    public Node recReverse2(Node headerNode) {
        return recReverse2(headerNode, null);
    }

    public Node recReverse2(Node curr, Node prev) {
        if (curr == null) {
            head = prev;
            return head;
        }
        Node next = curr.next;
        curr.next = prev;
        return recReverse2(next, curr);
    }

    public void removeDuplicates() {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        System.out.print("Duplicates removed from ");
    }
}
