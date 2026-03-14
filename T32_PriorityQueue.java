import java.util.Scanner;

class T32_PriorityQueue {
    int[] pq;
    int size;
    int rear;

    T32_PriorityQueue(int s) {
        size = s;
        pq = new int[size];
        rear = -1;
    }

    void insert(int ele) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow...");
            return;
        }

        pq[++rear] = ele;

        for (int i = rear; i > 0; i--) {
            if (pq[i] < pq[i - 1]) {
                int temp = pq[i];
                pq[i] = pq[i - 1];
                pq[i - 1] = temp;
            }
        }
        System.out.println(ele + " is inserted in priority Queue");
    }

    void delete() {
        if (rear == -1) {
            System.out.println("Queue Underflow...");
            return;
        }
        int popped = pq[0];
        for (int i = 0; i < rear; i++) {
            pq[i] = pq[i + 1];
        }
        rear--;
        System.out.println(popped + " is deleted");
    }

    void display() {
        if (rear == -1) {
            System.out.println("Queue is Empty...");
            return;
        }
        for (int i = 0; i <= rear; i++) {
            System.out.print(pq[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T32_PriorityQueue q = new T32_PriorityQueue(10);

        int choice, value;

        do {
            System.out.println("\n1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    q.insert(value);
                    break;

                case 2:
                    q.delete();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
