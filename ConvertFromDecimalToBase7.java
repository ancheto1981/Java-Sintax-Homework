import java.util.Scanner;

/**
 * Created by pet on 20.03.2016.
 * Write a program that takes an integer number and converts it to base-7.
 */
public class ConvertFromDecimalToBase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number  you want to convert to base 7:");
        Integer number = console.nextInt();
        int base = 7;
        System.out.println(Integer.toString(number,base));

    }
}
