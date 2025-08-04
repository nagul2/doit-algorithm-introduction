package one.ex1.algorithm.qeustion;

public class Q1Q2Q3 {
    public static void main(String[] args) {
        System.out.println("max4(1, 2, 3, 4) = " + max4(1, 2, 3, 4));
        System.out.println("max4(4, 3, 2, 1) = " + max4(4, 3, 2, 1));
        System.out.println("max4(2, 3, 4, 1) = " + max4(2, 3, 4, 1));
        System.out.println("max4(3, 3, 4, 2) = " + max4(3, 3, 4, 2));
        System.out.println();

        System.out.println("min3(1, 3, 4) = " + min3(1, 3, 4));
        System.out.println("min3(3, 4, 1) = " + min3(3, 4, 1));
        System.out.println("min3(2, 2, 4) = " + min3(2, 2, 4));
        System.out.println();


        System.out.println("min4(1, 2, 3, 4) = " + min4(1, 2, 3, 4));
        System.out.println("min4(4, 2, 2, 3) = " + min4(4, 2, 2, 3));
        System.out.println("min4(1, 3, 3, 4) = " + min4(1, 3, 3, 4));
        System.out.println("min4(1, 1, 1, 3) = " + min4(1, 1, 1, 3));
    }

    // 네 값의 최대값을 구하는 max4 메서드를 작성
    private static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    // 세 값의 최솟값을 구하는 min3 메서드를 작성
    private static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    // 네 값의 최솟값을 구하는 min4 메서드를 작성
    private static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }
}
