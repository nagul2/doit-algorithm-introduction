package one.ex1.repeat.practice;

import java.util.Scanner;

/**
 * +와 -를 번갈아 출력
 * 2가지 문제점
 * 1. 반복할 때마다 if문을 실행해야 함
 * - for문을 반복할 때마다 if문을 실행하며 i값이 홀수인지 알아내기 위해 if문을 모두 n번 실행해야 함
 *
 * 2. 변경시 유연하게 대응하기 어려움
 * - 카운터용 변수인 i값은 0부터 n-1까지 1씩 증가하는데, i값을 0부터 시작하지 않고 1부터 n까지 증가시키려면 for문 전체를 수정해야함
 */
public class Alternative1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;

		System.out.println("+와 -를 번갈아 n개 출력합니다.");
		do {
			System.out.print("n값: ");
			n = scanner.nextInt();

		} while (n <= 0);

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
		System.out.println();

		// 2번 예시: for문을 0이아닌 1부터 시작하려면 전부 변경해야함
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {	// 홀수, 조건식은 짝수일 때를 구하지만 i값이 1부터 시작이기 때문에 print()문 순서를 바꿔야함
				System.out.print("-");
			} else {			// 짝수
				System.out.print("+");
			}
		}
	}
}
