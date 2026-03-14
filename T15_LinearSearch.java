public class T15_LinearSearch {
    static int linear_search(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 1, 9, 3, 2, 0, 9 };
        int index = linear_search(arr, 9);
        System.out.println("element found at " + index);
    }
}
