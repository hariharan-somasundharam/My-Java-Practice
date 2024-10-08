import java.util.Scanner;

// Node class for circular linked list
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Delete_Reverse_Circular_Linked_List {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        if (head == null)
            return head;

        Node prev = null;
        Node cur = head;
        Node next = head;

        do {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        } while (cur != head);

        head.next = prev;
        return head = prev;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        if (head == null)
            return head;

        Node prev = null;
        Node cur = head;

        do {
            if (cur.data == key) {
                if (prev == null) {
                    Node temp = head;
                    do {
                        temp = temp.next;
                    } while (temp.next != head);
                    temp.next = head.next;
                    return head = head.next;
                } else {
                    prev.next = cur.next;
                    return head;
                }
            }
            prev = cur;
            cur = cur.next;
        } while (cur != head);

        return head; // If the key is not found, return the head
    }

    // Function to print the circular linked list
    void printList(Node head) {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Function to create a circular linked list from an array
    Node createCircularList(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node last = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            last.next = newNode;
            last = newNode;
        }
        last.next = head; // Make it circular
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Delete_Reverse_Circular_Linked_List listOps = new Delete_Reverse_Circular_Linked_List();

        // Input for the circular linked list
        System.out.print("Enter the number of elements in the circular linked list: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the circular linked list:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create the circular linked list
        Node head = listOps.createCircularList(arr);
        System.out.println("Circular linked list created:");
        listOps.printList(head);

        // Reverse the circular linked list
        head = listOps.reverse(head);
        System.out.println("Reversed circular linked list:");
        listOps.printList(head);

        // Input for deletion
        System.out.print("Enter the value to delete from the circular linked list: ");
        int key = scanner.nextInt();
        head = listOps.deleteNode(head, key);
        System.out.println("Circular linked list after deletion:");
        listOps.printList(head);

        scanner.close();
    }
}
