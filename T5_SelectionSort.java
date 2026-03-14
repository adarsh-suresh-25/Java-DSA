// for i = 0 < n-1:
//     minIndex = i
//     for j = i+1 < n:
//         if arr[j] < arr[minIndex]:
//             minIndex = j
//     swap(arr[i], arr[minIndex])

public class T5_SelectionSort {
    public static void printArr(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void selection_sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            System.out.println();
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.print("Pass " + (i + 1) + ": ");
            printArr(arr);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 1, 5 };
        selection_sort(arr);
        System.out.println();
        printArr(arr);
    }
}
