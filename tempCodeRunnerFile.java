 void insert(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        rear++;
        pq[rear] = value;

        // Sort to maintain priority
        for (int i = rear; i > 0; i--) {
            if (pq[i] < pq[i - 1]) {
                int temp = pq[i];
                pq[i] = pq[i - 1];
                pq[i - 1] = temp;
            }
        }

        System.out.println(value + " inserted");
    }

    void delete() {
        if (rear == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        int value = pq[0];

        for (int i = 0; i < rear; i++) {
            pq[i] = pq[i + 1];
        }

        rear--;
        System.out.println("Deleted element: " + value);
    }

    // Display queue
    void display() {
        if (rear == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Priority Queue elements:");
        for (int i = 0; i <= rear; i++) {
            System.out.print(pq[i] + " ");
        }
        System.out.println();
    }