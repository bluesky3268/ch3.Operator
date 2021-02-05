public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // byte c = a + b; 이렇게 하면 형변환 에러발생함.
        byte c = (byte) (a + b);
        /*
         * 같은 byte타입인데 형변환 에러가 발생하는 이유 -> 연산을 할 때 int형으로 변환한 다음 연산을 한다. 그래서 a+b의 연산결과는
         * int형이다. int형 값을 다시 byte형에 넣으려고 하니깐 형변환 에러가 발생한 것. 그래서 명시적 형변환을 해 줘야 함.
         */
        System.out.println(c);
    }
}
