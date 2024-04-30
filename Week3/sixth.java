package task.Week3;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        /* Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        char charAlpha=scan.next().charAt(0);
        if(charAlpha=='a' || charAlpha=='e' || charAlpha=='i' || charAlpha=='o' || charAlpha=='u' ){
            System.out.println("The alphabet is vowel");
        }else{
            System.out.println("The alphabet is consonant");
        }
        scan.close();
    }
}
