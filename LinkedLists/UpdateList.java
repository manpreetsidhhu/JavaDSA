
import java.util.Scanner;

public class UpdateList {

    private Scanner sc;
    private Node head;

    public UpdateList(Scanner sc, Node head) {
        this.sc = sc;
        this.head = head;
    }

    public Node delete() {
        System.out.print("Enter the position where to delete a node : ");
        int x = sc.nextInt();
        if (x < 1) {
            System.out.println("Invalid Position");
            return head;
        } else if (x == 1) {
            if (head == null) {
                System.out.println("List is empty");
                return null;
            }
            System.out.println("Deleted node at position 1 with value : " + head.data);
            head = head.next;
            return head;
        }
        int count = 1;
        Node temp = head;
        while (count < x - 1 && temp != null) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return head;
        }
        System.out.println("Deleted node at position " + x + " with value : " + temp.next.data);
        temp.next = temp.next.next;
        return head;
    }

    public Node insert() {
        System.out.print("Enter the value to insert into the linked list: ");
        int val = sc.nextInt();
        System.out.print("Enter the position to insert into the linked list: ");
        int pos = sc.nextInt();
        if (pos < 1) {
            System.out.println("Invalid position");
            return head;
        }
        if (pos == 1) {
            System.out.println("Inserted Node with value " + val + " at position " + pos + " in Linked List");
            Node temp = new Node(val);
            temp.next = head;
            return temp;
        }
        int count = 1;
        Node temp = head;
        while (count < pos - 1 && temp != null) {
            temp = temp.next;
            count++;
        }
        Node newNode = new Node(val);
        if (temp == null) {
            System.out.println("Position Out of Bounds");
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public Node sortedInsert(){
        System.out.print("Enter the value to insert into the linked list: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if(head==null||head.data>data){
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next!=null&& temp.next.data<data){
            temp=temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}
