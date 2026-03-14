public class T33_Recursion {
    public static void printReverseRecursion(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printReverseRecursion(n - 1);
    }

    public static void printReverseForLoop(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // printReverseForLoop(20);
        printReverseRecursion(10);
    }
}
