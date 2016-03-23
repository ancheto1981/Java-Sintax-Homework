import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pet on 21.03.2016.
 * Write a method that returns the first N odd/even elements from a collection. Return as many as you can.
 * Format: [Get <number of elements> <odd/even>]
 */
public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        String[] command = console.nextLine().split(" ");

        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        ArrayList<Integer> resultNumbers = getFirstOddOrEvenElements(numbers, command);
        resultNumbers.forEach(n -> System.out.print(n +" "));
    }

    public static ArrayList<Integer> getFirstOddOrEvenElements(int[] numbers, String[] command) {

        ArrayList<Integer> numbersList = new ArrayList<>();

        for(int i = 0; i < numbers.length && numbersList.size()< Integer.parseInt(command[1]); i++){
            if(numbers[i] % 2 == 0 && command[2].equals("even")){
                numbersList.add(numbers[i]);
            }
            else if(numbers[i] % 2 != 0 && command[2].equals("odd")){
                numbersList.add(numbers[i]);
            }
        }
        return numbersList;
    }
}


