package one.ex1.repeat.question;

import java.util.Scanner;

/**
 * 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성
 * a와 b의 대소 관계에 상관없이 합을 구해야 함
 * 예를 들어 a가 3, b가 5이면 12를, a가 6, b가 4이면 15를 반환해야 함
 */
public class Q8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a와 b를 포함하여 그 사이에 있는 모든 정수의 총합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = scanner.nextInt();
		System.out.print("b의 값 : ");
		int b = scanner.nextInt();

		int sum = sumOf1(a, b);

		System.out.println(a + "부터 " + b + "까지의 합은 " + sum + "입니다.");
	}

	static int sumOf1(int a, int b) {

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}

	static int sumOf2(int a, int b) {
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
