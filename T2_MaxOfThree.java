// Algorith
// 1 Take three numbers as input a, b, c 
// 2 if a>b then check a>c if yes print a
// 3 else check if b>c if yes then print b
// 4 else --> print c
// 5 Terminated
public class T2_MaxOfThree {
    public static void main(String[] args) {
        int a = 90;
        int b = 80;
        int c = 100;
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        // int max = a;
        // if (b > max) {
        // max = b;
        // }
        // if (c > max) {
        // max = c;
        // }
        // System.out.println(max);
    }
}
