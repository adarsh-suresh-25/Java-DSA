public class T21_sparseMatrix_Implement {

    static int countNonZero(int[][] matrix, int rows, int cols) {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != 0)
                    count++;
            }
        }
        return count;
    }

    // Method to convert matrix into sparse (3-tuple) array
    static int[][] convertToSparse(int[][] matrix, int rows, int cols) {
        int nonZero = countNonZero(matrix, rows, cols);
        int[][] sparse = new int[nonZero + 1][3];

        // First row
        sparse[0][0] = rows;
        sparse[0][1] = cols;
        sparse[0][2] = nonZero;

        int k = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    sparse[k][0] = i;
                    sparse[k][1] = j;
                    sparse[k][2] = matrix[i][j];
                    k++;
                }
            }
        }
        return sparse;
    }

    static void displaySparse(int[][] sparse) {
        System.out.println("Sparse Matrix (3-Tuple Form):");
        for (int i = 0; i < sparse.length; i++) {
            System.out.println(
                    sparse[i][0] + " " +
                            sparse[i][1] + " " +
                            sparse[i][2]);

            if (i == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 0, 0, 3, 0, 4 },
                { 0, 0, 5, 7, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 2, 6, 0, 0 }
        };

        int[][] sparseMatrix = convertToSparse(matrix, 4, 5);
        displaySparse(sparseMatrix);
    }
}