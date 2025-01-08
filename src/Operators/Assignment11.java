package Operators;

import java.util.Scanner;

//Write a program to convert Fahrenheit into Celsius.
//Formula :- (fahrenheit - 32) * 5 / 9;
public class Assignment11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Fahrenhit :-");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Convert Fahrenhit into celsius:- " + celsius+"C");


    }
}
