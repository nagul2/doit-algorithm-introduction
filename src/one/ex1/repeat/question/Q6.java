package one.ex1.repeat.question;

import java.util.Scanner;

/**
 * SumWhile 에서 While 문이 종료될 때 변수 i 값이 n + 1이 되는지 확인
 * 변수 i 값을 출력하도록 프로그램을 수정
 */
public class Q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		int n = scanner.nextInt();

		int sum = 0;	// 합
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.println("반복문이 종료되면 i의 값은 " + i + "가 됩니다.");
	}
}
