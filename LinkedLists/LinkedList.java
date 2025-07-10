
import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    private Node head = null;
    private Scanner sc;

    public LinkedList(Scanner sc) {
        this.sc = sc;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; 
        }else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        System.out.print("Linked List : ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public void createList() {
        System.out.print("Enter number of elements to insert in Linked list : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(i + ") ");
            int value = sc.nextInt();
            insert(value);
        }
        display();
    }
}
