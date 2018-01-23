// Any class that is not in java.lang has to be imported
// Scanner is in java.util

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;

public class ScannerFun {
    public static void main(String[] args) throws Exception {
        /* Syntax for creating a scanner:
         * Scanner [name of Scanner variable] = new Scanner([source you want to scan from / System.in = terminal])
        */
        Scanner myScan = new Scanner(System.in);
        /* Scanner has lots of useful methods to get different types of input:
         * i.e: nextInt() - gets the next token, until a newline is reached, from the terminal and parses for an integer
         *      next() - gets the next token, until a space is reached, and store it in a String
         *      nextLine() - gets the next token, until a newline is reached, and store it in a String
         *      nextDouble() - same as nextInt() but for a double
         *      full list here: https://docs.oracle.com/javase/9/docs/api/java/util/Scanner.html
        */

        /* Syntax to store information that the scanner retrieved:
        * [type of variable] [variable name] = [name of Scanner variable].[method name]
        */
        String userName = myScan.nextLine();

        // The variable userName above can now be used anywhere else in the program

        System.out.println("Your username is: " + userName);

        // Practice Question:
        // Using the myScan variable created above, ask the user for an integer and print out whether or not that
        // integer is greater than 100

        // Common errors w/ Scanners:
        // When getting an int using nextInt(), make sure to clear the Scanner's buffer using [name of Scanner].nextLine()
        System.out.print("Enter your favorite number: ");
        int favoriteNumber = myScan.nextInt();
        System.out.print("Enter your favorite color: ");
        String color = myScan.nextLine();
        System.out.println("\n-------------------");
        System.out.println(favoriteNumber);
        System.out.println(color);

        System.out.println("\n-------------------");

        // Reading from Files:
        Scanner fileScan = new Scanner(new File("info.txt"));
        while (fileScan.hasNext()) {
            System.out.println(fileScan.nextLine());
        }

        // Writing to Files:
        PrintStream output = new PrintStream(new File("output.txt"));
        output.println("Hello");
        output.println("Georgia Tech!");
        output.printf("%s is a %s major", "Daniel", "CS");
        output.flush(); // makes sure everything was written to the file
        output.close(); // closes the file
        System.out.println("Finished printing!");

        // Practice Question:
        // Take the information from the file "numbers.txt" and write out only the even numbers to a file called "evens.txt"
    }
}