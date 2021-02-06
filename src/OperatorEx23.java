public class OperatorEx23 {
    public static void main(String[] args) {
        // 문자열비교
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
        System.out.printf("str1 == \"abc\" ? %b%n", str1 == "abc");
        System.out.printf("str2 == \"abc\" ? %b%n", str2 == "abc");
        // 연산자 == 은 객체를 비교하기 때문에 str2와 "abc"의 내용은 같지만 객체가 다르기 때문에 false를 반환함
        // 그래서 문자열을 비교할 때는 항상 equals()를 사용해야 함.
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));

    }
}
