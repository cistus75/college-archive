public class Mehod05 {
    public static void cal(int x, double y) {
        System.out.println(2 * x * y);
    }

    public static void main(String[] args) {
        int a = 4;
        double pi = 3.14;
        System.out.println("원의 둘레 공식은  2 * 반지름 * 원주율입니다.");
        System.out.println("2 x "+ a + " x " + pi + " = ");
        cal(a, pi);
    }
}
