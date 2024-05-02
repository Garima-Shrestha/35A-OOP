package task.Week3;

import java.util.Scanner;

public class SwitchFourth {
    public static void main(String[] args) {
        /* Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) 
        based on the user's choice using a switch case. */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a shape(circle, rectangle, square, triangle): ");
        String shape=scan.nextLine();
        switch (shape) {
            case "circle":
                System.out.println("Enter radius: ");
                float r=scan.nextFloat();
                float areaCircle= (float) 3.14*r*r;
                System.out.println("The area of circle is: "+ areaCircle);
                break;
            case "rectangle":
                System.out.println("Enter length: ");
                int length=scan.nextInt();
                System.out.println("Enter breadth: ");
                int breadth=scan.nextInt();
                int areaRec=length*breadth;
                System.out.println("Area of Rectangle: "+ areaRec);
                break;
            case "square":
                System.out.println("Enter side: ");
                int side=scan.nextInt();
                int areaSquare=side*side;
                System.out.println("Area of square: "+ areaSquare); 
                break;
            case "triangle":
                System.out.println("Enter base: ");
                int base=scan.nextInt();
                System.out.println("Enter height: ");
                int height=scan.nextInt();
                int areaTri=(int) (0.5*base*height);
                System.out.println("Area of triangle: "+ areaTri);
                break;
            default:    
                System.out.println("Invalid shape");
                break;
        }
        scan.close();
    }
}
