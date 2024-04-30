package task.Week3;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        /* Write a JAVA program to check whether a year is a leap year or not. 
        Hint: if year%4==0; if year%100!==0 ; year%400==0;  */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int year=scan.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("The year is leap year");
        }else{
            System.out.println("The year is not a leap year");
        }
        scan.close();
    }
}
