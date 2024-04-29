package task.Week2;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        /*Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter length: ");
        int length=scan.nextInt();
        System.out.println("Enter width: ");
        int width=scan.nextInt();
        System.out.println("Enter height: ");
        int height=scan.nextInt();
        System.out.println("Enter side: ");
        int side=scan.nextInt();
        int area= (int) (0.5*width*height);
        System.out.println("Area of triangle: "+ area);
        int volumeCuboid=length*width*height;
        System.out.println("Volume of Cuboid "+ volumeCuboid);
        int volumeCube=side*side*side;
        System.out.println("Volume of Cube: "+ volumeCube);
        scan.close();
    }
}
