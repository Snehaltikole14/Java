package ConditionalStatement;
//Program to find the maximum of two numbers.

public class Assignment3 {
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 45;
        //Using Ternary Operator
      int max = (num1 > num2) ? num1:num2;
        System.out.println("max Number is " +max);

        //using If - Else

        if(num1 > num2){
            System.out.println("Max Number is " +num1);
        }else if(num1 <num2){
            System.out.println("Max Number is "+num2);
        }

     }

    }

