package LetsProgram;

public class Assignment3 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows / 2 + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < rows - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows / 2 -1; i >= 0; i--) {
            {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < rows - 2 * i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
