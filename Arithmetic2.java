/*
 * Name: Kennedy Keyes
 * Date: March 6, 2021
 * Name of Program: Arithmetic2.java
 * Description: This program will display the sum, average, and product of five
integers.
 */
package arithmetic2;
import java.util.Scanner; // program uses class Scanner
/**
 *
 * @author codingken
 */
public class Arithmetic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare the variables
        int number1; // hold the first integer
        int number2; // hold the second integer
        int number3; // hold the third integer
        int number4; // hold the fourth integer
        int number5; // hold the fifth integer
        
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the first integer: "); /* prompt the user
        to enter the first integer */
        number1 = input.nextInt(); // read first integer from user
        
        System.out.print("Please enter the second integer: "); /* prompt the
        user to enter the second integer */
        number2 = input.nextInt(); // read second integer from user
        
        System.out.print("Please enter the third integer: "); /* prompt the user
        to enter the third integer */
        number3 = input.nextInt(); // read third integer from user
        
        System.out.print("Please enter the fourth integer: "); /* prompt the
        user to enter the fourth integer */
        number4 = input.nextInt(); // read fourth integer from user
        
        System.out.print("Please enter the fifth integer: "); /* prompt the user
        to enter the fifth integer */
        number5 = input.nextInt(); // read fifth integer from user
        
        int sum = number1 + number2 + number3 + number4 + number5; /* add 
        the numbers, then store total in sum */
        int product = number1 * number2 * number3 * number4 * number5;
        // multiply the numbers, then store total in product
        int average = sum / 5; /* divide the sum by 5, then store total in 
        average */
        
        System.out.printf("%nSum is %d%n", sum); // display the sum
        System.out.printf("Product is %d%n", product); // display the product
        System.out.printf("Average is %d%n", average); // display the average
    } // end method main
    
} // end class Arithmetic2
