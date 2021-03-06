public class OperatorEx22 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double) f;

        System.out.printf("10.0 == 10.0f %b%n", 10.0 == 10.0f);
        System.out.printf("0.1 == 0.1f %b%n", 0.1 == 0.1f);
        // 10.0은 true인데 0.1은 false가 나오는 이유는 실수형은 근사값으로 저장되기 때문에 오차가 발생할 수 있다.
        // 10.0f는 오차 없이 저장할 수 있는 값이라서 double형으로 저장해도 그대로 10.0이지만
        // 0.1f는 저장할 때 2진수로 변환하는 과정에서 오차가 발생하게 된다.
        System.out.printf("f = %19.14f%n", f);
        System.out.printf("d = %19.14f%n", d);
        System.out.printf("d2 = %19.14f%n", d2);
        System.out.printf("d == f   %b%n", d == f);
        System.out.printf("d == d2   %b%n", d == d2);
        System.out.printf("d2 == f   %b%n", d2 == f);
        System.out.printf("(float)d == f    %b%n", (float) d == f);

    }
}
