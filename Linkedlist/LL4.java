public class LL4 {
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
    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
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
        LL4 list = new LL4();
        list.insertAtStart(20);
        list.insertAtStart(10);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.display();
    }
}
