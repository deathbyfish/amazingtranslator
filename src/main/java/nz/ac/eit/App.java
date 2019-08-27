package nz.ac.eit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is the number to translate?" );
        System.out.println("Please state the number in english");
        System.out.println("This is another test")
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        int intUI = Integer.parseInt(userInput);
        if(intUI == 69){
            System.out.println("Nice");
        } else{
            System.out.println("The number to translate is: " + intUI);
        }
    }
}

//This is new branch 1
