package one.ex1.practice;

import java.util.Scanner;

public class Max3Method {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("max3(3, 2, 1) = " + max3(3, 2, 1)); // a>b>c
        System.out.println("max3(3, 2, 2) = " + max3(3, 2, 2)); // a>b=c
        System.out.println("max3(3, 1, 2) = " + max3(3, 1, 2)); // a>c>b
        System.out.println("max3(2, 1, 3) = " + max3(2, 1, 3)); // c>a>b
        System.out.println("max3(3, 3, 2) = " + max3(3, 3, 2)); // a=b>c
        System.out.println("max3(3, 3, 3) = " + max3(3, 3, 3)); // a=b=c
        System.out.println("max3(2, 2, 3) = " + max3(2, 2, 3)); // c>a=b
        System.out.println("max3(2, 3, 1) = " + max3(2, 3, 1)); // b>a>c
        System.out.println("max3(2, 3, 2) = " + max3(2, 3, 2)); // b>a=c
        System.out.println("max3(1, 3, 2) = " + max3(1, 3, 2)); // b>c>a
        System.out.println("max3(2, 3, 3) = " + max3(2, 3, 3)); // b=c>a
        System.out.println("max3(3, 3, 3) = " + max3(3, 3, 3)); // c>b>a

    }

    private static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
