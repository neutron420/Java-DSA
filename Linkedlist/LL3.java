public class LL3 {
    Node head;
    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;   // new node points to old head
        node.prev = null;   // first node has no previous

        if (head != null) {
            head.prev = node;  // old head points back to new node
        }

        head = node;  // update head
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        LL3 list = new LL3();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.display();
    }
}
