package sg.edu.nus.iss;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    public static void main(String[] args) {
        //random number generator
        Random rand = new Random();
        //prog runs once but create a menu; prog guess fr 1-100
        //nextInt bounded by 1-100; 4d generate (10)
        Integer guessNumber = rand.nextInt(100); 

        //instantiate a response
        Integer myGuess = 0;

        //scanner to read the integer
        Scanner input = new Scanner(System.in);

        while (myGuess != guessNumber){
            myGuess = input.nextInt();

            if (myGuess < guessNumber){
                System.out.println("Your number is lower. ");
            } else if (myGuess > guessNumber){
                System.out.println("Your number is higher");            
            } else {
                System.out.println("You got it!");
        //shuts down program
                input.close();
                System.exit(0);
            }
        }

        
    }
}

