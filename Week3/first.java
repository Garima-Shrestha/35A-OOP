package task.Week3;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        /* Write a JAVA program to find the maximum between three numbers. */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=scan.nextInt();
        System.out.println("Enter second number: ");
        int num2=scan.nextInt();
        System.out.println("Enter third number: ");
        int num3=scan.nextInt();
        
        if(num1>num2 && num1>num3){
            System.out.println("num1 is the largest");
        }else if(num2>num3){
            System.out.println("num2 is the largest");
        }else{
            System.out.println("num3 is the largest");
        }
    }
}
