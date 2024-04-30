package task.Week3;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        /* Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();
        if (num%5==0 && num%11==0){
            System.out.println("The number is divisible by both 5 and 11");
        }else{
            System.out.println("The number is not divisible by both 5 and 11");
        }
        scan.close();
    }
}
