package Assignments;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args){

        int numEntered;
        String result;

        Scanner input = new Scanner(System.in);

        System.out.println("Give a number.");
        numEntered = input.nextInt();


        if (numEntered % 2 == 0)
            result = "Even";
        else
            result = "Odd";

        System.out.println(result);
    }
}
