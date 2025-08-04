package one.ex1.repeat.question;

import java.util.Scanner;

/**
 * 1 ~ 10의 합은(1 + 10) * 5와 같이 구할 수 있다.
 * 이를 '가우스의 덧셈'이라고 하는데 이 방법을 이용하여 1부터 n 까지의 정수 합을 구하는 프로그램을 작성
 */
public class Q7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		int n = scanner.nextInt();
		int i = 1;

		int sum = ((i + n) * n) / 2;

		// 이것도 가능하지만 위의 방법이 더 많이 사용함
		// int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

	static int sumof(int a, int b) {
		int min;		// a, b의 작은 쪽의 값
		int max;		// a, b의 큰 쪽의 값

		if (a < b) {
			min = a;  max = b;
		} else {
			min = b;  max = a;
		}

		int sum = 0;		// 총합
		for (int i = min; i <= max; i++)
			sum += i;
		return sum;
	}
}
