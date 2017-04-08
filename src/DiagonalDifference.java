/**
 * Created by ARPITHA RAO on 26-01-2016.
 */
import java.util.Scanner;
public class DiagonalDifference {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declare three 2 Dimensional Arrays
        int[][] matrix = new int[4][4];
        int sum1 = 0;
     int sum2 = 0;

        // Input Matrix
        System.out.println("Enter matrix order 4*4");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getInt(sc, "");
            }
        }

        // Compute Sum of main diagonal elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum1 += matrix[i][j];
                }
            }
        }
     System.out.println("Sum of Principal Diagonal Elements is " + sum1);

        // Compute Sum of anti-diagonal elements
        for (int i = 0, j = matrix[i].length - 1; i < matrix.length; i++, j--) {
            sum2 += matrix[i][j];
        }
     int difference = 0;
     difference = Math.abs(sum1-sum2);

        System.out.println("Sum of Secondary Diagonal Elements is " + sum2);
     System.out.println("Difference of Diagonal Elements is " + difference);
    }

    public static int getInt(Scanner sc, String prompt) {
        int integer = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                integer = sc.nextInt();
                isValid = true;
            } else {
                System.err.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();
        }
        return integer;
    }
}
