package one.ex1.repeat.practice;

import java.util.Scanner;

/**
 * 효율적으로 변경
 */
public class PrintStars2 {
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

		// *를 w개 출력하면서 n/w번 실행 -> 즉, for문에서 *를 w개 출력하는 것을 n/w번으로 실행함
		// n 값이 w값의 배수일 때 이 단계에서 출력을 완료함
		// n = 15, w = 5 이면 *****를 3번 출력함
		// n = 15, w = 4 이면 *****를 2번 출력함
		for (int i = 0; i < n / w; i++) {
			System.out.println("*".repeat(w));
		}

		// *를 n % w번 출력하고 줄바꿈 함 -> 즉, n값이 w값의 배수가 아니라면 남아 있는 마지막 줄을 줄 바꿈을 함
		// n값을 w값으로 나눈 나머지를 구하여 변수 rest에 넣고 *를 rest개 출력한다음 다음 줄 바꿈을 함
		// n = 14, w = 5이면 rest에는 4가 저장됨
		// n 값이 w의 배수이면 rest는 0 이므로 *를 출력하거나 줄 바꿈 하지 않음
		int rest = n % w;
		if (rest != 0) {
			System.out.println("*".repeat(rest));
		}

	}
}
