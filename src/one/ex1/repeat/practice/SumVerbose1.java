package one.ex1.repeat.practice;

import java.util.Scanner;

/**
 * 1, 2, ..., n의 합과 그 값을 구하는 과정을 출력
 * 해당 방법은 바람직 하지 않음,
 * n값이 10,000이라면 for문은 반복문을 10,000번 수행함
 * 판단식이 성립하지 않아 else 문을 실행하는 경우는 단 한번인데, 이 마지막 과정때문에 10,000번이나 판단해야하는데,
 * 이렇게 마지막 과정을 실행하기 위한 방법을 알고 있는데도 반복할 때마다 항상 조건을 판단하여 실행하는 것은 프로그램의 효율을 떨어뜨린다.
 */
public class SumVerbose1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;

		System.out.println("1부터 n까지의 합을 구합니다.");

		do {
			System.out.print("n값: ");
			n = scanner.nextInt();

		} while (n <= 0);

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i < n) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
			sum += i;
		}

		System.out.println(sum);
	}
}
