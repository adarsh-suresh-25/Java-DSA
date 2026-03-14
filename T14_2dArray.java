public class T14_2dArray {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 9 }, { 4, 5, 6, 8 }, { 7, 8, 9, 7 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
