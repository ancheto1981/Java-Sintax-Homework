import java.util.Scanner;

/**
 * Created by pet on 21.03.2016.
 * Write a program that takes as input an integer – the target – and outputs to the console
 * all pairs of numbers between 1 and 20,
 * which, if added or subtracted, result in the target.
 */
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int target = Integer.parseInt(console.nextLine());

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i< numbers.length; i++){
            for( int j = 0; j < numbers.length; j++){
              if(numbers[i] + numbers[j] == target){
                  System.out.printf("%d + %d = %d\n", numbers[i], numbers[j], target);
              }
              else if (numbers[i] - numbers[j] == target) {
                  System.out.printf("%d - %d = %d\n", numbers[i], numbers[j],target);
              }
            }
        }
    }
}
