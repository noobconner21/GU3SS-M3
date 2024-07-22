package lk.sslablk.guessme;

import java.util.Random;
import java.util.Scanner;

public class MainActivity {

    public static void main(String[] args) {
        System.out.println("==== Hi, Welcome to GU3SS M3 ====\n");
        System.out.println("May I have your name ?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("\n\t\t==== Hello " + name + " ====\n");


        int beginAnswer = 0;

        while (beginAnswer != 1){


            System.out.println("Shall we start ?");
            System.out.println("\t1.Yes");
            System.out.println("\t2.No");

            beginAnswer = scanner.nextInt();

        }

        Random random = new Random();
        int x = random.nextInt( 20)+1;

        System.out.println("Guess the number:");
        int userInput = scanner.nextInt();

        int timeTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish){
            timeTried++;

            if (timeTried<5){

                if (userInput == x){
                    hasWon = true;
                    shouldFinish = true;
                } else if (userInput > x) {
                    System.out.println("Guess lower");
                    userInput = scanner.nextInt();

                } else {
                    System.out.println("Guess higher");
                    userInput = scanner.nextInt();
                }

            }else {
                shouldFinish = true;
            }
        }

        if (hasWon){
            System.out.println("Congratulations!! you have guessed in your " + timeTried + "guess");
        } else {
            System.out.println("\t\t==== Game Over ! ====");
            System.out.println("The number is : " + x );
        }
    }
}
