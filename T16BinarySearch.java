public class T16BinarySearch {
    static int binary_search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (key > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 9, 16, 24, 36, 49, 61 };
        int index = binary_search(arr, 10);
        System.out.println("element found at " + index);
    }
}
