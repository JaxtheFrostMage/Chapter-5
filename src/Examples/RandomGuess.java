package Examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int choice;
        int rand_pick = rand.nextInt(100) + 1;

        System.out.println("please pick a number between 1 and 10.");
        choice = input.nextInt();

        if (choice == rand_pick){
            System.out.print("lucky Guess");
        } else if(choice > rand_pick){
            System.out.print("incorrect, it was lower " + rand_pick);
        }else if(choice < rand_pick){
            System.out.print("incorrect, it was higher " + rand_pick);
        }
    }
}
