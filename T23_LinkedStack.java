import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class T23_LinkedStack {
    Node head;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(data + " pushed into stack");
    }

    void pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(head.data + " is popped");
        head = head.next;
    }

    void top() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(head.data + " is top element");
        }
    }

    void is_empty() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    void display() {
        if (head == null) {
            System.out.println("stack is empty");
            return;
        }
        Node temp = head;
        System.out.println("\n\nStack");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        T23_LinkedStack s = new T23_LinkedStack();

        while (true) {
            System.out.println("\n1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. PEEK (TOP)");
            System.out.println("5. IS EMPTY");
            System.out.println("6. EXIT");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    s.top();
                    break;

                case 5:
                    s.is_empty();
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
