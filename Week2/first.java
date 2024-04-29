package task.Week2;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        /*Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int vote=scan.nextInt();
        if (vote>=18){
                System.out.println("You can vote");
        }else{
            System.out.println("You cannot vote");
        }
    }
}
