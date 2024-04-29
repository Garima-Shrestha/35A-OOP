package task.Week2;

import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        /* Take the name, roll number, and field of interest from the user and print in the format below: 
        Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scan.nextLine();
        System.out.println("Enter your roll number: ");
        int rollNum=scan.nextInt();
        // Consume the newline character left in the input buffer
        scan.nextLine();
        System.out.println("Enter your field of interest: ");
        String interest=scan.nextLine();
        System.out.print("My name is "+ name);
        System.out.print(" and my roll number is "+ rollNum);
        System.out.println(". My field of interest are "+interest);
    }
}
