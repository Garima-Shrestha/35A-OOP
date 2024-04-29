package task.Week2;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        /* Write a program to take two integer inputs from the user and print the sum and product of them. */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1=scan.nextInt();
        System.out.println("Enter second integer: ");
        int num2=scan.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of two integers: "+sum);
        int product=num1*num2;
        System.out.println("Product of two integers: "+product);
        scan.close();
    }
}
