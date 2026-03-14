import java.util.Scanner;

class T31_DEqueue {
    int arr[];
    int front, rear, size;

    T31_DEqueue(int n) {
        size = n;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return (front == 0 && rear == size - 1);
    }

    boolean isEmpty() {
        return (front == -1);
    }

    void insertFront(int value) {
        if (isFull()) {
            System.out.println("Deque Overflow");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else if (front > 0) {
            front--;
        } else {
            System.out.println("Cannot insert at front");
            return;
        }

        arr[front] = value;
        System.out.println(value + " inserted at front");
    }

    void insertRear(int value) {
        if (isFull()) {
            System.out.println("Deque Overflow");
            return;
        }

        if (rear == -1) {
            front = rear = 0;
        } else {
            rear++;
        }

        arr[rear] = value;
        System.out.println(value + " inserted at rear");
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque Underflow");
            return;
        }

        System.out.println(arr[front] + " deleted from front");

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }

    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque Underflow");
            return;
        }

        System.out.println(arr[rear] + " deleted from rear");

        if (front == rear) {
            front = rear = -1;
        } else {
            rear--;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.print("Deque elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        T31_DEqueue dq = new T31_DEqueue(5);

        int choice, value;

        do {
            System.out.println("\n1 Insert Front");
            System.out.println("2 Insert Rear");
            System.out.println("3 Delete Front");
            System.out.println("4 Delete Rear");
            System.out.println("5 Display");
            System.out.println("6 Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    dq.insertFront(value);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    dq.insertRear(value);
                    break;

                case 3:
                    dq.deleteFront();
                    break;

                case 4:
                    dq.deleteRear();
                    break;

                case 5:
                    dq.display();
                    break;

                case 6:
                    System.out.println("Program End");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
