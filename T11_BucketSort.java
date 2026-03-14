import java.util.*;

public class T11_BucketSort {

    public static void bucketSort(float[] arr, int n) {

        if (n <= 0)
            return;

        // 1. Create empty buckets
        ArrayList<Float> buckets[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        // 2. Put array elements into buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (arr[i] * n);
            buckets[bucketIndex].add(arr[i]);
        }

        // 3. Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // 4. Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float value : buckets[i]) {
                arr[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = { 0.92f, 0.25f, 0.78f, 0.22f, 0.13f, 0.83f };
        int n = arr.length;

        bucketSort(arr, n);

        System.out.println("\n\nAfter Bucket Sort:");
        for (float value : arr) {
            System.out.print(value + " ");
        }
    }
}
