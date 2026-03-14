class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class T25_LinkedSearch {
    Node head;

    void insertAtEnd(int data) {
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
    }

    // Display the list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    int search(int key) {
        if (head == null)
            return -1;
        Node temp = head;
        int index = 0;
        while (temp != null && temp.data != key) {
            temp = temp.next;
            index++;
        }

        if (temp == null)
            return -1;

        return index;
    }

    public static void main(String[] args) {
        T25_LinkedSearch list = new T25_LinkedSearch();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        System.out.println("Linked List:");
        list.display();
        int ele = 40;
        int res = list.search(ele);
        if (res == -1)
            System.out.println(ele + " not found");
        else
            System.out.println(ele + " found at index " + res);
    }
}
