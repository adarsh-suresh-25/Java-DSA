import java.util.Scanner;

public class T13_Queue {
    int queue[];
    int front;
    int rear;
    int curr_size;
    int total_size;

    T13_Queue(int size) {
        this.total_size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
        curr_size = 0;
    }

    void enqueue(int ele) {
        if (curr_size == total_size) {
            System.out.println("Queue OVERFLOW");
        } else {
            rear = (rear + 1) % total_size;
            queue[rear] = ele;
            curr_size++;
            System.out.println(ele + " enqueued into queue");
        }
    }

    void dequeue() {
        if (curr_size == 0) {
            System.out.println("Queue UNDERFLOW");
        } else {
            System.out.println(queue[front] + "is dequeued from queue");
            front = (front + 1) % total_size;
            curr_size--;
        }
    }

    void display() {
        if (curr_size == 0) {
            System.out.println("Queue is EMPTY");
        } else {
            System.out.println("QUEUE PRINTING....");
            for (int i = 0; i < curr_size; i++) {
                System.out.print(queue[(front + i) % total_size] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        T13_Queue q = new T13_Queue(size);

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
