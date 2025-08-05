package one.ex1.repeat.practice;

import java.util.Scanner;

/**
 * 1, 2, ..., n의 합과 그 값을 구하는 과정을 출력
 * SumVerbose1에 비해서 반복 회수가 n번 -> n-1번으로 줄어듦
 * if문의 판단 횟수가 n번 -> 0번으로 줄어듦
 */
public class SumVerbose2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;

		System.out.println("1부터 n까지의 합을 구합니다.");

		do {
			System.out.print("n값: ");
			n = scanner.nextInt();

		} while (n <= 0);

		int sum = 0;

		for (int i = 1; i < n; i++) {
			System.out.print(i + " + ");
			sum += i;
		}

		System.out.print(n + " = " + (sum += n));
	}
}
