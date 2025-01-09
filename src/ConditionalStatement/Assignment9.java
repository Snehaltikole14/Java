package ConditionalStatement;
//Program to check if a character is an alphabet or not.
public class Assignment9 {
    public static void main(String[] args) {
      int ch =34;
              if(ch >='A' && ch<='z' || ch>='a'&& ch<='z'){
                  System.out.println("It is an alphabet");

              }else if(ch >=1 && ch <=100){
                  System.out.println("It is an Integer");
              }else{
                  System.out.println("It is not alphabet and Integer");
              }
    }
}

