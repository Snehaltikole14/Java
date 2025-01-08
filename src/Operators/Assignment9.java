package Operators;
//- **Assignment - 09**
//    If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
//    write a program to calculate his total marks and percentage marks.

public class Assignment9 {
    public static void main(String[] args) {
        int math =78;
        int science = 45;
        int english =62;
        int maxmarks =100;
        int totalmark = math+science+english;
        int totalxmarks = 3*maxmarks;
        double percentage = (totalmark/(double) totalxmarks)*100;

        System.out.println("Total Marks:- "+totalmark);
        System.out.println("Percentage:- "+percentage +"%");

    }
}
