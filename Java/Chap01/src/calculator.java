import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("첫번째 수 입력하기 : ");
        int first_num = input.nextInt();

        System.out.println("두번째 수 입력하기 : ");
        int second_num = input.nextInt();

        System.out.println("연산자 입력하기 : ");
        System.out.println("덧셈 : +, 뺄셈 : -, 곱셈 : *, 나눗셈 : /");
        String operator = input.next();

        if (true) {
            if (operator.equals("+")) {
                System.out.println("결과 : " + (first_num + second_num));
            } else if (operator.equals("-")) {
                System.out.println("결과 : " + (first_num - second_num));
            } else if (operator.equals("*")) {
                System.out.println("결과 : " + (first_num * second_num));
            } else if (operator.equals("/")) {
                System.out.println("결과 : " + (first_num / second_num));
            } else {
                System.out.println("입력이 잘못되었습니다.");
            }
        }
    }
}
