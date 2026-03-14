class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class T30_SinglyCircularLL {
    Node last;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
        System.out.println(data + " is Linked in the beginning");
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        System.out.println(data + " is Linked in the End");
    }

    void deleteFromBeginning() {
        if (last == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        System.out.println(last.next.data + " is deleted");
        if (last.next == last) {
            last = null;
            return;
        }
        last.next = last.next.next;
    }

    void deleteFromEnd() {
        if (last == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        System.out.println(last.data + " is deleted");
        if (last.next == last) {
            last = null;
            return;
        }
        Node temp = last.next;
        while (temp.next != last) {
            temp = temp.next;
        }
        temp.next = last.next;
        last = temp;
    }

    void display() {
        if (last == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.print("back to front\n");
    }

    public static void main(String[] args) {
        T30_SinglyCircularLL obj = new T30_SinglyCircularLL();
        obj.insertAtBeginning(1);
        obj.display();
        obj.insertAtEnd(2);
        obj.insertAtBeginning(0);
        obj.display();
        obj.insertAtEnd(3);
        obj.display();
        obj.deleteFromBeginning();
        obj.display();
        obj.deleteFromEnd();
        obj.display();
    }
}