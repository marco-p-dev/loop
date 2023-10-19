//  Author: Marco Palomino
//    Date: 19 October 2023
// Summary: A simple Java program that takes two integers
//          (start and end) and computes the sum of all the
//          integers from start to end.


// Needed for input.
import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the start integer: ");
        // Read the start number
        int start = input.nextInt();

        System.out.print("Enter the end integer: ");
        // Read the end number
        int end = input.nextInt();

        if (start < end) {
            int total = 0;

            while (start<=end) {
                total = total + start;
                start = start + 1;
            }
        
            System.out.printf("The total is: %d%n", total);
        }
        else {
            System.out.println("Error: The start number must be smaller than the end number.");
        }
    } // End of main
} // End of Practical02