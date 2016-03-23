import java.util.Locale;
import java.util.Scanner;

/**
 * Created by pet on 20.03.2016.
 * Write a program that reads three floating point numbers from the console and calculates their result
 * with the following formulae:
 *((a2 + b2) / (a2 – b2))(a + b + c) / √c             (a2 + b2 - c3)(a – b)
 * Then calculate the difference between the average of the three numbers and the average of the two formulae.
 * Average (a, b, c) – Average (f1, f2)

 */
public class CalculateExpression {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        double firstNum = console.nextDouble();
        double secondNum = console.nextDouble();
        double thirdNum = console.nextDouble();
        double averageThreeNumbers = (firstNum + secondNum + thirdNum) / 3;

        double squareF1 = (firstNum + secondNum + thirdNum) / Math.sqrt(thirdNum);
        double formula1 = ((firstNum * firstNum) + (secondNum * secondNum)) /
                ((firstNum * firstNum) - (secondNum * secondNum));
        double f1 = Math.pow(formula1,squareF1);

        double squareF2 = firstNum - secondNum;
        double formula2 = ((firstNum * firstNum) + (secondNum * secondNum) - (thirdNum * thirdNum *thirdNum));
        double f2 = Math.pow(formula2, squareF2);

        double averageTwoFormulas = (f1 + f2) / 2;

        double diff = Math.abs(averageThreeNumbers - averageTwoFormulas);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, diff);


    }
}
