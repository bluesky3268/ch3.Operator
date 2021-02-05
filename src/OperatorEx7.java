public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        // byte c = a * b;
        byte c = (byte) (a * b); // OperatorEx6와 같이 명시적 형변환을 해줘야 함.
        System.out.println(c);
        // 결과값이 44가 나온 것은 결과값이 byte의 범위를 넘기때문에 형변환을 하면서 값의 손실이 발생한 것.
    }
}
