package task.Week3;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        /*Write a JAVA program to check whether a number is even or odd. */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();
        if (num%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
        scan.close();
    }
}
