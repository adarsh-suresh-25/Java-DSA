public class T20_Sparsematrix {

    static boolean isSparseMatrix(int[][] matrix, int rows, int cols) {
        int zeroCount = 0, nonZeroCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0)
                    zeroCount++;
                else
                    nonZeroCount++;
            }
        }

        return zeroCount > nonZeroCount;
    }

    public static void main(String[] args) {
        int sparseMatrix[][] = {
                { 0, 0, 3, 0, 4 },
                { 0, 0, 5, 7, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 2, 6, 0, 0 }
        };
        boolean res = isSparseMatrix(sparseMatrix, 4, 5);
        System.out.println(res);
    }
}