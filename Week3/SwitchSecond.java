package task.Week3;

import java.util.Scanner;

public class SwitchSecond {
    public static void main(String[] args) {
        /* Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs 
        and performs the corresponding arithmetic operation using a switch case statement. */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=scan.nextInt();
        System.out.println("Enter second number: ");
        int num2=scan.nextInt();
        System.out.println("Enter an operator(+,-,*,/): ");
        char ope=scan.next().charAt(0);
        int add, sub, mul, div;
        switch (ope) {
            case '+':
                add=num1+num2;
                System.out.println("Addition: "+add);
                break;
            case '-':
                sub=num1-num2;
                System.out.println("Substraction: "+sub);
                break;
            case '*':
                mul=num1*num2;
                System.out.println("Multiplication: "+mul);
                break;
            case '/':
                div=num1/num2;
                System.out.println("Division: "+div);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        scan.close();
    }
}
