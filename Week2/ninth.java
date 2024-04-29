package task.Week2;

import java.util.Scanner;

public class ninth {
    public static void main(String[] args) {
        /* Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        double length=scan.nextDouble();
        System.out.println("Enter breadth of rectangle: ");
        double breadth=scan.nextDouble();
        int area=(int) (length*breadth);
        System.out.println("Area of rectangle: "+ area );
        scan.close();
    }
}
