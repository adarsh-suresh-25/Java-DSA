// for i = 0; i < n-1; i++:
//     for j = 0; j < n-i-1;j++:
//         if arr[j] > arr[j+1]:
//             swap(arr[j], arr[j+1])

public class T3_BubbleSort {
    public static void bubble_sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 3, 6, 2, 4 };
        bubble_sort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
