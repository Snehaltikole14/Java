package Operators;
//Write a program to print the power of 7 raised to 5.

public class Assignment6 {
    public static void main(String[] args) {
        int base =7;
        int exponent =5;

        // Calculate power using Math.pow
        double result = Math.pow(base,exponent);

        System.out.println("Power of " +base+ " raised to " +exponent+" :- " + result);

    }
}
