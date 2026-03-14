class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class T29_DoublyLinkedList {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

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

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("Linked List is Empty...");
            return;
        }
        System.out.println(head.data + " is deleted");
        head = head.next;
        head.prev = null;
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("Linked List is Empty...");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println(temp.data + " is deleted");
        temp.prev.next = null;
    }

    public void printForward() {
        if (head == null) {
            System.out.println("Linked List is Empty...");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    public void printBackward() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.prev;
        }
        System.out.println("null\n");
    }

    public static void main(String[] args) {

        T29_DoublyLinkedList list = new T29_DoublyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Forward Traversal:");
        list.printForward();

        System.out.println("Backward Traversal:");
        list.printBackward();

        list.deleteFromBeginning();
        System.out.println("After deleting from beginning:");
        list.printForward();

        list.deleteFromEnd();
        System.out.println("After deleting from end:");
        list.printForward();
    }
}