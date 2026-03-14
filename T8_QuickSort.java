class T8_QuickSort {
    public static void quickSort(int arr[], int l, int r) {
        if (l < r) {
            int pivotIndex = partition(arr, l, r);
            quickSort(arr, l, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, r);
        }
    }

    public static void swap(int arr[], int a_index, int b_index) {
        int temp = arr[a_index];
        arr[a_index] = arr[b_index];
        arr[b_index] = temp;
    }

    public static int partition(int arr[], int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                swap(arr, ++i, j);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 9, 3, 8, 6 };
        quickSort(arr, 0, 5);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}