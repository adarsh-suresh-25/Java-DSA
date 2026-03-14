import java.util.Arrays;

public class T17_MedianOfArray {
    static double median(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int idx = n / 2;
        if (n % 2 == 0) {
            return (arr[idx] + arr[idx - 1]) / 2.0;
        } else {
            return arr[idx];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 5, 7, 20, 4, 19, 26 };
        System.out.println("Median is: " + median(arr));
    }
}
