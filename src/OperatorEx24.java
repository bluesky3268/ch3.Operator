public class OperatorEx24 {
    public static void main(String[] args) {
        int x = 0;
        char ch = ' ';

        x = 15;
        System.out.printf("x = %2d, 10 < x && x < 20 = %b%n", x, 10 < x && x < 20);

        x = 6;
        // 1.
        // || 와 && 중에서는 &&가 우선순위가 높다. 그래서 괄호를 해주지 않았을 경우에는
        // x%2==0 || (x%3 == 0 && x % 6 != 0 ) 자동적으로 이렇게 연산을 하게된다.
        // 그래서 2로 나눈 나머지가 0이 아니거나(3으로 나눈 몫이 0이고 6으로 나눈 몫이 0이 아니면) true
        // ()안 식은 false지만 앞의 식이 true이기 때문에 true로 반환
        System.out.printf("x = %2d, x %% 2 == 0 || x %% 3 == 0 && x %%6 != 0 = %b%n", x,
                x % 2 == 0 || x % 3 == 0 && x % 6 != 0);
        // 2.
        // 2로 나눈 나머지가 0이거나 3으로 나눈 나머지가 0이고, 6으로 나눈 나머지가 0이 아니면 true
        // 6으로 나눈 나머지가 0이기때문에 false로 반환
        System.out.printf("x = %2d, (x %% 2 == 0 || x %% 3 == 0) && x %%6 != 0 = %b%n", x,
                (x % 2 == 0 || x % 3 == 0) && x % 6 != 0);

        ch = '1';
        System.out.printf("ch = '%c', '0' <= ch && ch <= '9' = %b%n", ch, '0' <= ch && ch <= '9');

        ch = 'a';
        System.out.printf("ch = '%c', 'a' <= ch && ch <= 'z' = %b%n", ch, 'a' <= ch && ch <= 'z');
        ch = 'A';
        System.out.printf("ch = '%c', 'A' <= ch && ch <= 'Z' = %b%n", ch, 'A' <= ch && ch <= 'Z');
        ch = 'q';
        System.out.printf("ch = '%c', ch =='q' || ch == 'Q' = %b%n", ch, ch == 'q' || ch == 'Q');
    }
}
