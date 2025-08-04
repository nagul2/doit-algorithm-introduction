package one.ex1.repeat.question;

import java.util.Scanner;

/**
 * 두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성
 * 변수 b에 입력한 값이 a값 이하면 변수 b값을 다시 입력
 * 출력 예시
 * a값: 6
 * b값: 6
 * a보다 큰 값을 입력하세요!
 * b값: 8
 * b - a는 2 입니다.
 */
public class Q9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("a값: ");
		int a = scanner.nextInt();
		int b;
		do {
			System.out.print("b값: ");
			b = scanner.nextInt();

			if (a >= b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		} while (a >= b);

		System.out.println("b - a는" + (b - a) + "입니다.");

	}
/*
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();

		int b;
		while (true) {
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
			if (b > a) break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}

		System.out.println("b - a는 " + (b - a) + "입니다.");
	}
	*/
}
