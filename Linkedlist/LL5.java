import java.util.List;
public class LL5 {
    Node head;
    public void insertAtStart(int val) {
        Node newNode = new Node(val);

        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }

    // Insert at END
    public void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }
    public void insertBeforeK(int val, int k) {
        if (k == 1) {
            insertAtStart(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < k; i++) {
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.prev = temp.prev;
        newNode.next = temp;
        temp.prev.next = newNode;
        temp.prev = newNode;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Node class
    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
         LL5 list = new LL5();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        // Insert 10 before 3rd position
        list.insertBeforeK(10, 4);

        list.display();
    }
}
