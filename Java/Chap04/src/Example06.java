import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("등급을 A ~ F 사이로 입력하세요.");
        char input_grade = s.next().charAt(0);
        char grade = Character.toUpperCase(input_grade);
        // String grade = s.next();
        // 이게 지금 배운걸로 맞는 접근, charAt는 뒤의 내용
        // String grade = s.next().toUpperCase(); 
        // 이렇게 하면 그냥 대문자로 변환해서 받을 수 있음

        switch (grade) {
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("좋음");
                break;
            case 'D':
                System.out.println("좀 더 열심히");
                break;
            case 'F':
                System.out.println("미흡");
                break;
            default:
                System.out.println("잘못된 등급");
        }
        s.close();
    }
}
