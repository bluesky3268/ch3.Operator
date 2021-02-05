public class OperatorEx4 {
    public static void main(String[] args) {
        // 부호연산자
        int i = -10;
        i = +i;
        System.out.println(i); // +(-10) = -10

        i = -10;
        i = -i;
        System.out.println(i); // -(-10) = 10
    }
}
