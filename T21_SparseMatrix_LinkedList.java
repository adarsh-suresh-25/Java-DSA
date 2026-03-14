class Node {
    int row;
    int col;
    int element;
    Node next;

    Node(int element, int row, int col) {
        this.element = element;
        this.row = row;
        this.col = col;
        this.next = null;
    }
}

public class T21_SparseMatrix_LinkedList {
    Node head;

    public void addNode(int ele, int row, int col) {
        Node newNode = new Node(ele, row, col);
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

    void convertToSparse(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    addNode(matrix[i][j], i, j);
                }
            }
        }
        displaySparse();

    }

    void displaySparse() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.row + " " + temp.col + " " + temp.element);
            System.out.println();
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 0, 0, 3, 0, 4 },
                { 0, 0, 5, 7, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 2, 6, 0, 0 }
        };

        T21_SparseMatrix_LinkedList obj = new T21_SparseMatrix_LinkedList();
        obj.convertToSparse(matrix, 4, 5);

    }
}