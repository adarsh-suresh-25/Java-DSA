// algorithm - lemen language to design solution of a problem
// 1. Take two numbers as input a,b
// 2. check if a>b -> print a
// 3. else print b
// 4. terminate

import java.util.Scanner;

class T1_max_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        if (a > b)
            System.out.println("Max is " + a);
        else
            System.out.println("Max " + b);

        sc.close();
    }
}