package one.ex1.qeustion;

// 세 값의 대소 관계인 13가지 조합의 중앙값을 구하여 출력하는 프로그램을 작성
// 실습 Median, Max3Method 참고
public class Q4 {
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
    }

    static int mid3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {   // a >= b, b >= c
                return b;
            } else if (c >= a) {    // a >= b, c > b, c >= a
                return a;
            } else {    // a >= b, c > b, a > c
                return c;
            }
        } else if (a > c) { // b > a, a > c
            return a;
        } else if (b > c) {  // b > a, c > a, b > c
            return c;
        } else {    // b > a, c > a, c > b
            return b;
        }

    }
}
