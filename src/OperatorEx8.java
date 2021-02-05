public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;
        // long c = a * b; // 2,000,000,000,000
        /*
         * 이렇게 하면 전혀 다른 엉뚱한 값이 나오는 이유는 형변환에는 문제가 없지만,
         * 
         * 결과값이 int형의 범위(약 21억)을 넘었기 때문이다.
         * 
         * 이미 엉뚱한 값이 나온 뒤 long 타입에 넣어도 값은 엉뚱한 값 그대로 저장된다.
         */
        long c = (long) a * b;
        System.out.println(c);
    }
}
