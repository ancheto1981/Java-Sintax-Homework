import java.util.Scanner;

/**
 * Write a program that enters the sides of a rectangle
 * (two integers a and b) and calculates and prints the rectangle's area.
 */
public class RectangleArea {

    public static void main(String[] args) {
        System.out.println("Enter  two numbers separate by space:");
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");

        int[] numbers = new int[input.length];
        int area = 0;

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        area = numbers[0] * numbers[1];
        System.out.println(area);
    }
}

