package Assignments;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int entry1;
        int entry2;
        int entry3;
        String result1 = null;
        String result2 = null;

        System.out.println("Please enter the first numbers.");
        entry1 = input.nextInt();
        System.out.println("Please enter the second numbers.");
        entry2 = input.nextInt();
        System.out.println("Please enter the third numbers.");
        entry3 = input.nextInt();

        if (entry1 > entry2 && entry1 > entry3)
        {
            if (entry2 > entry3) {
                result1 = "ascending order " + entry1 + " " + entry2 + " " + entry3;
                result2 = "descending order " + entry3 + " " + entry2 + " " + entry1;
            }
            else {
                result1 = "ascending order " + entry1 + " " + entry3 + " " + entry2;
                result2 = "descending order " + entry2 + " " + entry3 + " " + entry1;
            }
        }else if (entry2 > entry1 && entry2 > entry3)
        {
            if (entry1 > entry3) {
                result1 = "ascending order " + entry2 + " " + entry1 + " " + entry3;
                result2 = "descending order " + entry3 + " " + entry1 + " " + entry2;
            }
            else {
                result1 = "ascending order " + entry2 + " " + entry3 + " " + entry1;
                result2 = "descending order " + entry1 + " " + entry3 + " " + entry2;
            }
        } else if (entry3 > entry1 && entry3 > entry2)
        {
            if (entry1 > entry2) {
                result1 = "ascending order " + entry3 + " " + entry1 + " " + entry2;
                result2 = "descending order " + entry2 + " " + entry1 + " " + entry3;
            }
            else {
                result1 = "ascending order " + entry3 + " " + entry2 + " " + entry1;
                result2 = "descending order " + entry1 + " " + entry2 + " " + entry3;
            }
        }

        System.out.println(result1 + "\n" + result2);
    }
}
