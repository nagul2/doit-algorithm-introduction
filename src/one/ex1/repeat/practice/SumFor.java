package one.ex1.repeat.practice;

import java.util.Scanner;

// 하나의 변수를 사용하는 반복문은 while 문보다 for 문을 사용하는 것이 좋다
public class SumFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		int n = scanner.nextInt();

		int sum = 0;	// 합

		for (int i = 1; i <= n ; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
