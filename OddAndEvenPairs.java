import java.util.Scanner;

/**
 * Created by pet on 20.03.2016.
 * You are given an array of integers as a single line, separated by a space.
 * Write a program that checks consecutive pairs and prints if both are odd/even or not.
 * Note that the array length should also be an even number
 */
public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");

            int lineNumbers = input.length;
            for(int i = 0; i < lineNumbers; i++){
                int firstPair = Integer.parseInt(input[i]);
                int secondPair = Integer.parseInt(input[i + 1]);

                if(lineNumbers % 2 != 0) {
                    System.out.print("Invalid length.");
                    break;
                }
                if(firstPair % 2 == 0 && secondPair % 2 == 0){
                    System.out.println(firstPair + ", " + secondPair + " -> both are even");
                    i++;
                    continue;
                }
                else if(firstPair % 2 != 0 && secondPair % 2 != 0){
                    System.out.println(firstPair + ", " + secondPair + " -> both are odd");
                    i++;
                    continue;
                }
                else {
                    System.out.println(firstPair + ", " + secondPair + " -> both are different");
                    i++;
                }

            }
        }

    }

