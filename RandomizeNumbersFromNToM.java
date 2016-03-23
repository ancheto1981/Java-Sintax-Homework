import java.util.Random;
import java.util.Scanner;

/**
 * Created by pet on 20.03.2016.
 * Write a program that takes as input two integers N and M,
 * and randomizes the numbers between them.
 * Note that M may be smaller than or equal to N.
 */
public class RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter first number: ");
        Integer n = console.nextInt();
        System.out.println("Enter second number: ");
        Integer m = console.nextInt();
        Random rand = new Random();
        if(n < m){
            for(int i = n; i <= m; i++){
               int randomNum = rand.nextInt((m - n) + 1) + n;
                System.out.print(randomNum + " ");
            }
        }
        else if(n == m){
            System.out.println(n);
        }
        else{
            for(int i = m; i <= n; i++){
                int randomNum = rand.nextInt((n - m) + 1) + m;
                System.out.print(randomNum + " ");
            }
        }


    }
}
