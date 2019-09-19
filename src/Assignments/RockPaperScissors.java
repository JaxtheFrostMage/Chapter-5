package Assignments;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){

        int playerPick;

        String result;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Pick Rock, Paper or Scissors. \n1: Rock \n2: paper \n3: Scissors");
        playerPick = input.nextInt();

        int aiPick = rand.nextInt(3) + 1;

        if (playerPick == 1)
        {
            if (aiPick == 1)
            {
                System.out.println("Rock and Rock, Draw!");
            }
            else if (aiPick == 2)
            {
                System.out.println("Paper covers Rock, Computer Wins!");
            }
            else if (aiPick == 3)
            {
                System.out.println("Rock crushes Scissors, Player wins!");
            }
        }
        else if (playerPick == 2)
        {
            if (aiPick == 1)
            {
                System.out.println("paper covers Rock, Player wins!");
            }
            else if (aiPick == 2)
            {
                System.out.println("Paper and Paper, Draw!");
            }
            else if (aiPick == 3)
            {
                System.out.println("Scissors cuts Paper, Computer wins!");
            }
        }
        else if (playerPick == 3)
        {
            if (aiPick == 1)
            {
                System.out.println("Rock crushes Scissors, Computer Wins!");
            }
            else if (aiPick == 2)
            {
                System.out.println("Scissors cuts Paper, Player Wins!");
            }
            else if (aiPick == 3)
            {
                System.out.println("Scissors and Scissors, Draw!");
            }
        }

    }
}
