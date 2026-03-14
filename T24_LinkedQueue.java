import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class T24_LinkedQueue {
    Node head;

    void enqueue(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            System.out.println(data + " enqueued into queue");
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println(data + " enqueued into queue");
    }

    void dequeue() {
        if (head == null) {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println(head.data + " is dequeued from queue");
        head = head.next;
    }

    void display() {
        if (head == null) {
            System.out.println("Queue is empty");
        } else {
            Node temp = head;
            System.out.println("\n\nQueue");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        T24_LinkedQueue q = new T24_LinkedQueue();

        while (true) {
            System.out.println("\n1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
