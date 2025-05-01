package one.ex1.practice;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 중앙값을 구하여 출력
// 6-6 퀵 정렬에서도 다룸
public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값: ");
        int a = scanner.nextInt();
        System.out.print("b의 값: ");
        int b = scanner.nextInt();
        System.out.print("c의 값: ");
        int c = scanner.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }


    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) return b;
            else if (a <= c) return a;
            else return c;
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }
}
