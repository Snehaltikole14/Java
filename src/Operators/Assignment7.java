package Operators;
//- **Assignment - 07**
//Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the
// conditions 'a < 50' and 'a < b' are true.

public class Assignment7 {
    public static void main(String[] args) {
        int a =55;
        int b=70;
        if(a < 50 && a < b){
            System.out.println("both the conditions 'a < 50' and 'a < b' are true.");
        }
        else {
            System.out.println("This Conditions are false");
        }

    }
}
