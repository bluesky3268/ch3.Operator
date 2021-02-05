public class OperatorEx15 {
    public static void main(String[] args) {
        char lowerCase = 'a';
        char upperCase = (char) (lowerCase - 32);
        // char형과 int형과의 연산의 결과는 int형이므로 연산 후 다시 char형으로 형변환을 꼭 해줘야 함.
        System.out.println(upperCase);
    }
}
