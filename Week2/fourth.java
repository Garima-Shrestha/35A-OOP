package task.Week2;

public class fourth {
public static void main(String[] args) {
    /*Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */
    /* Write the ternary operator for question no. 1 */

    int validAge=18;
    int age=21;
    String result= validAge<age ? "You are eligible to vote!":"You are not eligible to vote!";
    System.out.println(result);
    }
}
