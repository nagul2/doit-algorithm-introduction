package one.ex1.repeat.practice;

import java.util.Scanner;

/**
 * for문을 반복할 때 마다 if문을 실행하므로 효율적이지 않음
 */
public class PrintStars1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, w;

		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

		do {
			System.out.print("값: ");
			n = scanner.nextInt();
		} while (n <= 0);

		do {
			System.out.print("값: ");
			w = scanner.nextInt();
		} while (w <= 0 || w > n);

		// for 문에서 변수 i값을 w값으로 나눈 나머지가 w-1일 때 줄 바꿈을 함
		// w값이 5라면, i값이 4, 9, 14, ... 일 때 줄 바꿈을 함(별을 출력하고 줄바꿈을 함)
		for (int i = 0; i < n; i++) {
			System.out.print("*");
			if (i % w == w - 1) {
				System.out.println();
			}
		}

		// n값이 w의 배수가 아닐 때 마지막 줄바꿈1
		if (n % w != 0) {
			System.out.println();
		}
	}
}
