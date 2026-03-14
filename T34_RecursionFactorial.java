public class T34_RecursionFactorial {
    public static int factorialRecursion(int n) {
        if (n == 1)
            return n;
        return n * factorialRecursion(n - 1);
    }

    public static int factorialLoop(int n) {
        for (int i = n - 1; i > 0; i--) {
            n = n * i;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursion(5));
    }
}
