
import java.util.Scanner;

/**
 * Created by pet on 17.03.2016.
 * Write a program that enters 3 points in the plane (as integer x and y coordinates),
 * calculates and prints the area of the triangle composed by these 3 points.
 * Round the result to a whole number.
 * In case the three points do not form a triangle, print "0" as result.
 */
public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("Enter coordinates for point A: ");
        Scanner console = new Scanner(System.in);
        String[] intputA = console.nextLine().split(" ");
        int [] numbersA = new int[intputA.length];
        for(int i = 0;i < intputA.length;i++){
            numbersA[i] = Integer.parseInt(intputA[i]);
        }
        Integer aX = numbersA[0];
        Integer aY = numbersA[1];

        System.out.println("Enter coordinates for point B: ");
        console = new Scanner(System.in);
        String[] intputB = console.nextLine().split(" ");
        int [] numbersB = new int[intputB.length];
        for(int i = 0;i < intputB.length;i++){
            numbersB[i] = Integer.parseInt(intputB[i]);
        }
        Integer bX = numbersB[0];
        Integer bY = numbersB[1];

        System.out.println("Enter coordinates for point A: ");
        console = new Scanner(System.in);
        String[] intputC = console.nextLine().split(" ");
        int [] numbersC = new int[intputC.length];
        for(int i = 0;i < intputC.length;i++){
            numbersC[i] = Integer.parseInt(intputC[i]);
        }
        Integer cX = numbersC[0];
        Integer cY = numbersC[1];

        if (aX.intValue() == bX.intValue()&& aX.intValue() == cX.intValue()) {
            System.out.println("Area = 0");
        }
        else if(bX.intValue() == (aX + 1) && cX.intValue() == (aX + 2) &&
                bY.intValue()== (aY + 1) && cY.intValue() == (aY + 2)){
            System.out.println("Area = 0");
        }
        else {
            Integer area = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
            Integer areaAbs = Math.abs(area);
            System.out.println(areaAbs);
        }

    }
    }

