package task.Week2;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        /* Write a program to calculate SI. 
        Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter amount: ");
        float amount=scan.nextFloat();
        System.out.println("Enter time: ");
        int time=scan.nextInt();
        System.out.println("Enter rate: ");
        float rate=scan.nextFloat();
        float si= amount * time * rate/100;
        System.out.println("Simple interest is "+ si);    
        scan.close();    
    }
}
