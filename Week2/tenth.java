package task.Week2;

public class tenth {
    public static void main(String[] args) {
        /* Write a program to calculate the total marks of four subjects of a student and the total percentage secured. 
        And use the following conditions to generate the final result;
        a. If equal to or more than 70 -> First Class
        b. If more than 59 -> Upper Second Class
        c. If more than 49 -> Second class
        d. If more than 39 -> Third class and if below than 40 the result is fail. 
        Hint: Use ternary operator */

        int nep=100, math=90, science=70, english=85;
        int total=nep+math+science+english;
        System.out.println("total marks: " +total);
        int per=total/4;
        System.out.println("Total Percentage: "+per);
    }
}
