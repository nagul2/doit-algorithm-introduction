package one.ex1.repeat.practice;

import java.util.Scanner;

/**
 * +와 -를 번갈아 출력2
 * for문은 "+-"를 n/2회 출력하기 때문에 반복문이 Alternative1에 비해 절반으로 줄어듦
 * 홀수일 때만 +를 출력하는 if문을 추가
 * - 여기서는 반복할 때마다 if문의 판단을 실행할 필요가 없음
 *
 * 또한 for문의 카운터용 변수의 시작값을 1로 바꾸는 것도 유연하게 대응할 수 있음
 */
public class Alternative2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;

		System.out.println("+와 -를 번갈아 n개 출력합니다.");
		do {
			System.out.print("n값: ");
			n = scanner.nextInt();

		} while (n <= 0);

		// 짝수일 때
		for (int i = 0; i < n / 2; i++) {
			System.out.print("+-");
		}

		// 홀수일 때
		if (n % 2 != 0) {
			System.out.print("+");
		}
		System.out.println();

		// 카운터용 변수가 1일 때도 유연하게 대응이 가능함
		// int i = 1, i <= n으로만 변경해도 됨

		// 짝수일 때
		for (int i = 1; i <= n / 2; i++) {
			System.out.print("+-");
		}

		// 홀수일 때
		if (n % 2 != 0) {
			System.out.print("+");
		}
	}
}
