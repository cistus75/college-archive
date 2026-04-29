public class Example_06 {

    public static void cal(int x, int y) {
        System.out.println(x * y);
    }
        public static void cal(int x) {
        System.out.println(x * x);
    }
        public static void cal(int x, double y) {
        System.out.println(x * y);
    }
        public static void cal(double x) {
        System.out.println(x * x);
    }
        
    public static void main(String[] args) {
        cal(2, 3);
        cal (2, 3.14);
        cal(2);
        cal(2.5);
    }
}