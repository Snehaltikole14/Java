package Operators;
//Take a 4 digit number. Write a program to display a number whose digits are 2 greater than
// the corresponding digits of the number TAKEN.
//For example, if the number which was taken is 5696, then the displayed number should be 7818.

public class Assignment14 {

        public static void main(String[] args) {
            // Example 4-digit number
            int number = 5696;

            // Variable to store the modified number
            int result = 0;
            int multiplier = 1;

            while (number > 0) {
                // Extract the last digit
                int digit = number % 10;

                // Add 2 to the digit (handle digit overflow by wrapping around)
                int newDigit = (digit + 2) % 10;

                // Build the new number
                result = result + (newDigit * multiplier);
                multiplier *= 10;

                // Remove the last digit from the number
                number /= 10;
            }

            // Display the result
            System.out.println("Modified number: " + result);
        }
    }


