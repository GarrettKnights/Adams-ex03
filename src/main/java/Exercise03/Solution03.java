/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise03;

//Sets up Scanner
import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {

        //Initializes Scanner
        Scanner ScanWords = new Scanner(System.in);

        //Sets up strings we will be using
        String quote;
        String author;

        //Prompts user for quote input
        System.out.println("What is the quote?");
        //Scans user input for quote
        quote = ScanWords.nextLine();
        //Prompts user for author input
        System.out.println("Who said it?");
        //Scans user input for author
        author = ScanWords.nextLine();
        //Prints out final output
        System.out.println("" + author + " says,  \""+quote+"\" ");
    }
}
