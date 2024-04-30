package task.Week3;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        /*Write a JAVA program to check whether a number is negative, positive, or zero. */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();
        if(num>0){
            System.out.println("The given number is positive");
        }else if(num<0){
            System.out.println("The given number is negative");
        }else{
            System.out.println("The given number is zero");
        }
        scan.close();
    }
}
