public class LL6 {

    Node head;

    // Insert at START
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

    // Insert AFTER a given node
    public void insertAfterNode(Node target, int val) {

        if (target == null) {
            System.out.println("Target node not found");
            return;
        }

        Node newNode = new Node(val);

        newNode.prev = target;
        newNode.next = target.next;

        if (target.next != null) {
            target.next.prev = newNode;
        }

        target.next = newNode;
    }

    // Find node by value
    public Node find(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Node class
    class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        LL6 list = new LL6();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        // Find node with value 3
        Node target = list.find(3);

        // Insert 10 AFTER node 3
        list.insertAfterNode(target, 10);

        list.display();
    }
}
