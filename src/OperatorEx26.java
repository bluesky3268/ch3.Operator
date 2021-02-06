public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a != 0 || ++b != 0 = %b%n", a != 0 || ++b != 0);
        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a == 0 && ++b != 0 = %b%n", a == 0 && ++b != 0);
        System.out.printf("a = %d, b= %d%n", a, b);
        // 마지막 b의 값이 증가하지 않은 이유는 첫번째 or연산에서 a가 거짓이므로 b는 연산되지 않음.
        // 두번째 연산식 또한 and 연산에서 a가 거짓이기 때문에 b의 연산을 할 필요가 없으므로 연산되지 않음.
        // 그래서 b는 한번도 연산되지 않았기 때문에 증가하지 않고 초기화한 값 그대로 0임.
    }
}
