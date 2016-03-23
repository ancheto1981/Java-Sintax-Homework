import java.util.Scanner;

/**
 * Created by pet on 20.03.2016.
 * Write a program that converts from a base-7 number to its decimal representation.
 */
public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a 7 - base number you want to convert to decimal: ");
        String number = console.next();
        int base = 7;
        Integer decimalNum = Integer.valueOf(number,base);
        System.out.println(decimalNum);

    }
}
