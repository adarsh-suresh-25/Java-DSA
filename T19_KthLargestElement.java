import java.util.Arrays;

public class T19_KthLargestElement {

    static int kthLargest(int[] arr, int k) {
        Arrays.sort(arr);// nlogn
        int n = arr.length;
        return arr[n - k];
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 2;
        System.out.println("Kth smallest element: " + kthLargest(arr, k));
    }
}
