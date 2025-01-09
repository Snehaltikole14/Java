package ConditionalStatement;
//Program to check if a number is a perfect square.

public class Assignment11 {
    public static void main(String[] args) {
        int number = 16;
        int sqrt = (int)Math.sqrt(number);
        if(sqrt * sqrt == number ){
            System.out.println("It is an perfect square");
        }else{
            System.out.println("it is not perfect square");
        }
    }
}
