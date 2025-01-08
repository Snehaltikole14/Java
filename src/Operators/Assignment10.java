package Operators;
//Suppose the values of variables 'a' and 'b' are 6 and 8 respectively,
// write two programs to swap the values of the two variables.
//1 - first program by using a third variable
//2 - second program without using any third variable
//( Swapping means interchanging the values of the two variables
// E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)


public class Assignment10 {
    public static void main(String[] args) {

        //using Temporary Variable
        int a =6;
        int b =8;

        //Before Swapping
        System.out.println("Before swapping "+a+ " and "+b);

        //After Swapping
      int temp = a;
      a = b ;
      b = temp;

        System.out.println("After Swap "+a+ " and "+b);

        //Using Arithmetic Operators

        int num1 = 20;
        int num2 =10;

        System.out.println("Before swapping "+num1+ " and "+num2);

        num1 =num1-num2;
        num2 = num1+num2;
        System.out.println("After swapping "+num1+ " and "+num2);



    }
}
