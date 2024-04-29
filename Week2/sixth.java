package task.Week2;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        /* Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
        Finally, calculate the division of the thus obtained sum and product and print the result. */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1=scan.nextInt();
        System.out.println("Enter second integer: ");
        int num2=scan.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of two integers: "+sum);
        int product=num1*num2;
        System.out.println("Product of two integers: "+product);
        double division=(double) sum/product;
        System.out.println("Division of sum and product: "+ division);
        scan.close();
    }
}
