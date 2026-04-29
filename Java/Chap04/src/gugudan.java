public class gugudan {
    public static void main(String[] args) {

        for (int i = 2; i <= 4; i++) {
            
            for (int j = i; j <= 9; j += 3) {
                System.out.print(j + "단\t\t");
            }

            System.out.println();
            

            for (int k = 1; k <= 9; k++) {
                for (int l = i; l <= 9; l += 3) {
                    System.out.print(l + " * " + k + " = " + (l * k) + "\t");
                }

                System.out.println();
            }

            System.out.println();
        }
    }
}