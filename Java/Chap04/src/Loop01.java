/*
 * 원본은 반복문 안에서 스캐너를 열지만 파일 노란색으로 표시되는게 거슬려 변형함 
원본의 경우 5개의 숫자를 입력받는 부분이 반복문 안에 있어서 스캐너가 5번 열리는 형태였음
 */

import java.util.Scanner;

public class Loop01 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("5개의 숫자를 입력하세요");
        Scanner s = new Scanner(System.in);

        for (int n = 1; n <= 5; n++) {
            int num = s.nextInt();
            sum += num;
        }
        System.out.println("합계: " + sum);
        s.close();
    }
}
