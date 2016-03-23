import java.util.Scanner;

/**
 * Created by pet on 21.03.2016.
 *Create a method that takes two strings as arguments and returns the sum of their character codes
 *  multiplied (multiply str1.charAt (0) with str2.charAt (0) and add to the total sum).
 *  Then continue with the next two characters. If one of the strings is longer than the other,
 *  add the remaining character codes to the total sum without multiplication.
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] twoWords = console.nextLine().split(" ");

        String firstWord = twoWords[0];
        String secondWord = twoWords[1];

        int sum = CalculateCharValue(firstWord, secondWord);
        System.out.println(sum);

    }

    public static int CalculateCharValue(String firstWord, String secondWord){
        int totalSum = 0;
        int longerLength = Math.max(firstWord.length(),secondWord.length());
        int smallerLength = Math.min(firstWord.length(), secondWord.length());

        String biggestWord = "";

        if(firstWord.length() > secondWord.length()){
            biggestWord = firstWord;
        }
        else {
            biggestWord = secondWord;
        }
        for(int i = 0; i < longerLength; i++){
            if(smallerLength > i){
                totalSum += firstWord.charAt(i) * secondWord.charAt(i);
            }
            else {
                totalSum += biggestWord.charAt(i);
            }
        }
        return totalSum;
    }
}
