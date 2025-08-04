package one.ex1.repeat.question;

import java.util.Scanner;

/**
 * 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성
 * 예를 들어 135를 입력하면 '그 수는 3자리입니다'라고 출력하고, 1314를 입력하면 '그 수는 4자리입니다.'라고 출력
 */
public class Q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;

		do {
			System.out.print("양의 정수를 입력해 주세요: ");
			n = scanner.nextInt();
		} while (n <= 0);

		int result = 0;
		while (n > 0) {
			n /= 10;
			result++;
		}
		System.out.println("그 수는 " + result + "자리입니다.");
	}

	// public static void main(String[] args) {
	// 	Scanner stdIn = new Scanner(System.in);
	//
	// 	System.out.println("양의 정숫값의 자릿수를 구합니다.");
	//
	// 	int n;
	// 	do {
	// 		System.out.print("정숫값 : ");
	// 		n = stdIn.nextInt();
	// 	} while (n <= 0);
	//
	// 	int no = 0;         // 자릿수
	// 	while (n > 0) {
	// 		n /= 10;         // n을 10으로 나눕니다
	// 		no++;
	// 	}
	//
	// 	System.out.println("그 수는 " + no + "자리입니다.");
	// }
}
