package one.ex1.qeustion;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("mid3(1, 2, 3) = " + mid3(3, 2, 1)); // a>b>c, return = b
        System.out.println("mid3(3, 1, 1) = " + mid3(3, 1, 1)); // a>c=b, return = b
        System.out.println("mid3(3, 1, 2) = " + mid3(3, 1, 2)); // a>c>b, return = c
        System.out.println("mid3(3, 1, 3) = " + mid3(3, 1, 3)); // a=c>b, return = a
        System.out.println("mid3(2, 1, 3) = " + mid3(2, 1, 3)); // c>a>b, return = a
        System.out.println("mid3(2, 2, 2) = " + mid3(2, 2, 2)); // a=b=c, return = b
        System.out.println("mid3(1, 1, 3) = " + mid3(1, 1, 3)); // c>a=b, return = a
        System.out.println("mid3(2, 3, 1) = " + mid3(2, 3, 1)); // b>a>c, return = a
        System.out.println("mid3(1, 3, 1) = " + mid3(1, 3, 1)); // b>a=c, return = c
        System.out.println("mid3(1, 3, 2) = " + mid3(1, 3, 2)); // b>c>a, return = c
        System.out.println("mid3(1, 3, 3) = " + mid3(1, 3, 3)); // b=c>a, return = b
        System.out.println("mid3(1, 2, 3) = " + mid3(1, 2, 3)); // c>b>a, return = b

        long start = System.nanoTime();

        int result = 0;
        for (long i = 0; i < 1_000_000_000L; i++) {
            result += mid3(3, 2, 1);
        }


        long end = System.nanoTime();
        System.out.println("mid3 실행 시간: " + (end - start) + " ns");
        System.out.println("결과 누적값(최적화 방지용): " + result);
    }

    // 중앙값을 구하는 메서드는 아래처럼 구할 수 있지만 Median 클래스보다 효율이 떨어짐, 그 이유를 작성
    // >> Median은 if 안에 또 if를 써서 조건을 한번만 판단하고 넘어감
    // >> 하지만 이 메서드는 조건을 묶어놔서 이미 통과한 조건도 다시 확인할 수 있어서 효율이 떨어짐
    static int mid3(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a)) return a;
        else if ((a > b && c < b) || (a < b && c > b)) return b;
        return c;
    }
}
