/* Name: Tanner Klock
   Date: February 12th, 2024
   Filename: ScoreArray.java
   Description: This program takes 8 scores from 0 to 100, Displays them as well as the average
 */
// Imports
import java.util.*;

public class ScoreArray {
    public static void main(String[] args) {
        // Constants
        int MAX_SCORE = 100;
        int MIN_SCORE = 0;
        // Input
        Scanner input = new Scanner(System.in);
        // Condition for while loop
        boolean full;
        // Variables
        int averageScore = 0;
        int highestScore = 0;
        int lowestScore = 0;
        // Declared and initialized scores array
        int[] scores = new int[8];
        // Declare variable to count for loops
        int count;
        // Input and validation loops
        for (count = 0; count < scores.length; count++) {
            // Temporary storage variable before making changes to array
            int temp;
            full = false;
            // While the index in the array hasn't been filled it will loop to get input
            while (!full) {
                System.out.print("Please enter a score from 0 to 100: ");
                // Try to get next int
                try {
                    temp = input.nextInt();
                    // Verify the integer is within the correct range
                    if (temp < MIN_SCORE || temp > MAX_SCORE) {
                        System.out.println("Error: Please enter a numeric value from 0 to 100");
                    } else {
                        // If input is good it will be added to the index and set to full to exit while loop
                        scores[count] = temp;
                        full = true;
                    }
                // If input isn't an integer catch exception and get new input
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a integer from 0 to 100");
                    input.next();
               }
            }
        }
        // Output loop
        for (count = 0; count < scores.length; count++) {
            System.out.println("Score " + (count+1) + " = " + scores[count]);
            // Add score to average
            averageScore = averageScore + scores[count];
            // Check if it's the highest or lowest score
            if (scores[count] < lowestScore || count == 0) {
                lowestScore = scores[count];
            }
            if (scores[count] > highestScore) {
                highestScore = scores[count];
            }
        }
        averageScore = averageScore/scores.length;
        System.out.println("The average score is " + averageScore);
        System.out.println("The highest score is " + highestScore);
        System.out.println("The lowest score is " + lowestScore);
    }
}