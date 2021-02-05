public class OperatorEx18 {
    public static void main(String[] args) {
        // Math.round()를 사용해서 반올림하기

        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);
    }
}
