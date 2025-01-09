package ConditionalStatement;
//Program to calculate the absolute value of a number.
public class Assignment10 {
    public static void main(String[] args) {
        //using ternary operator
int number =-45;


int absolutevalue = (number < 0) ? -number:number;
        System.out.println(absolutevalue);

        //using if -else
        int absoluteValue;

        if(number < 0){
            absoluteValue = -number;

        }else{
            absoluteValue = number;
        }
        System.out.println("Absolute Value is "+absoluteValue);
    }
}
