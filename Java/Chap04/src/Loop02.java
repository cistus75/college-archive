import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 1;
        while (choice == 1) {
            int a;

            System.out.println("숫자를 입력하세요");
            a = s.nextInt();

            if (a % 2 == 0) {
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
            System.out.println("계속하고 싶다면 1, 그만두고 싶다면 0을 입력하세요");
            choice = s.nextInt();
        }
        System.out.println("프로그램을 종료합니다.");
        s.close();
    }
}
