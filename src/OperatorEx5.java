public class OperatorEx5 {
    public static void main(String[] args) {

        // 사칙연산

        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        System.out.printf("%d / %f = %f%n", a, (float) b, a / (float) b);

        // 나누는 값이 정수(int)타입인 경우 0으로 나눌 수 없음. -> 0으로 나누면 ArithmeticException발생

    }
}
