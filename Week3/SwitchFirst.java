package task.Week3;

import java.util.Scanner;

public class SwitchFirst {
    public static void main(String[] args) {
        /* Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. 
        Use a switch case statement to handle different grades. */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Grade(A,B,C,D,E): ");
        char grade=scan.next().charAt(0);
        switch (grade) {
            case 'A': // Handling 'A' here
            case 'a': // Handling 'a' here
                System.out.println("GPA: 4.0");
                break;
            case 'B': // Handling 'B' here
            case 'b': // Handling 'b' here
                System.out.println("GPA: 3.0");
                break;
            case 'C': // Handling 'C' here
            case 'c': // Handling 'c' here
                System.out.println("GPA: 2.0");
                break;   
            case 'D': // Handling 'D' here
            case 'd': // Handling 'd' here
                System.out.println("GPA: 1.0");
                break;  
            case 'E': // Handling 'E' here
            case 'e': // Handling 'e' here
                System.out.println("GPA: 0.0");
                break;   
            default:
                System.out.println("Invalid grade");
                break;
        }
        scan.close();
    }
}
