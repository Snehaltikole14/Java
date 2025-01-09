package ConditionalStatement;
//Program to find the minimum of three numbers.

public class Assignment5 {
    public static void main(String[] args) {
        int a =26;
        int b= 67;
        int c = 34;
        int min = (a < b ) ? (a < c ? a : c)
                : (b < c ? b : c);
        System.out.println(min);

    }
}
