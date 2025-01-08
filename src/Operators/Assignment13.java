package Operators;
//Write a program to calculate the sum of the first and the second last digit of a 5 digit number.
//E.g.- NUMBER : 12345 OUTPUT : 1+4=5

public class Assignment13 {
    public static void main(String[] args) {
        int digit = 12345;
        int second_last_digit = (digit/10)%10;

        int firstdigit = digit;
        while (firstdigit >= 10) {

            firstdigit/=10;
        }
int sum = firstdigit +second_last_digit;
        System.out.println("Sum of the "+firstdigit+ " and "+second_last_digit+" :- "+sum);
    }
}
