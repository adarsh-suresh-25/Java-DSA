class T9_CountSort {
    public static void count_sort(int arr[]) {
        int n = arr.length;

        // findind max from arr
        int max = arr[0];
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }

        // making count arr and filling 0 in all place
        int count[] = new int[max + 1];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        // counting ele of arr and filling according to index of count array
        for (int ele : arr) {
            count[ele]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int res[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            res[--count[arr[i]]] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = res[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 0, 2, 3, 0, 3 };
        count_sort(arr);

        for (int ele : arr) {
            System.err.print(ele + " ");
        }
    }
}