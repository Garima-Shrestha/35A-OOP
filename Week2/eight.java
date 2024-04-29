package task.Week2;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        /* Take side of a square from user and print area and perimeter of it. 
        Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.*/

        /*Side of square */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        int sideSquare=scan.nextInt();
        int areaSquare=sideSquare*sideSquare;
        System.out.println("Area of square: "+ areaSquare);
        int perSquare=4*sideSquare;
        System.out.println("Perimeter of square: "+ perSquare);

        /*Simple Interest */
        
        System.out.println("Enter amount: ");
        float amount=scan.nextFloat();
        System.out.println("Enter time: ");
        int time=scan.nextInt();
        System.out.println("Enter rate: ");
        float rate=scan.nextFloat();
        float si= amount * time * rate/100;
        System.out.println("Simple interest is "+ si); 


        /*Area of triangle and Volume of Cube and Cuboid. */
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
