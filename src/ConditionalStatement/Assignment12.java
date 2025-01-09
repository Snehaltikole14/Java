package ConditionalStatement;
//Program to check if a number is a power of two.

public class Assignment12 {
    public static void main(String[] args) {
        int number = 16; // Change this number to test

        if (number > 0 && (number & (number - 1)) == 0) {
            System.out.println(number + " is a power of two.");
        } else {
            System.out.println(number + " is not a power of two.");
        }
    }


}
