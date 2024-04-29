package task.Week2;

import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        /* Write a program to calculate the total marks of four subjects of a student and the total percentage secured. 
        And use the following conditions to generate the final result;
        a. If equal to or more than 70 -> First Class
        b. If more than 59 -> Upper Second Class
        c. If more than 49 -> Second class
        d. If more than 39 -> Third class and if below than 40 the result is fail. 
        Hint: Use ternary operator */

        Scanner scan=new Scanner(System.in);
        int nep=scan.nextInt();
        int math=scan.nextInt();
        int science=scan.nextInt();
        int english=scan.nextInt();

        int total=nep+math+science+english;
        System.out.println("total marks: " +total);
        int per=total/4;
        System.out.println("Total Percentage: "+per);

        String result = per >= 70 ? "First Class"
                        : per > 59 ? "Upper Second Class"
                        : per > 49 ? "Second Class"
                        : per > 39 ? "Third Class"
                        : "Fail";
         System.out.println("Result: " + result);

    }
}
