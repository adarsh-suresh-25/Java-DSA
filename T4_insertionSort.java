// for i = 1 to i<n:
//     key = arr[i]
//     j = i - 1
//     while j >= 0 and arr[j] > key:
//          arr[j+1] = arr[j]
//          j--
//     arr[j+1] = key

public class T4_insertionSort {
    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 3, 6, 2, 4 };
        insertion_sort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
