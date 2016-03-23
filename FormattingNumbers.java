import java.util.Locale;
import java.util.Scanner;

/**
 * Created by pet on 17.03.2016.
 * Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500),
 * a floating-point b and a floating-point c and prints them in 4 virtual columns on the console.
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        Integer firstNumber = console.nextInt();
        double secondNumber = console.nextDouble();
        double thirdNumber = console.nextDouble();

        String binFirstNum = Integer.toBinaryString(firstNumber);
        String formatFirstNumber = String.format("%10s",binFirstNum).replace(' ', '0');
        String hexaFirstNumber = Integer.toHexString(firstNumber);
        String hexaNum = String .format("%-10s",hexaFirstNumber);

        System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|", hexaNum.toUpperCase(),formatFirstNumber,secondNumber,
                thirdNumber);

        }

    }

