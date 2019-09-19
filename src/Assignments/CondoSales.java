package Assignments;

import java.util.Scanner;

public class CondoSales {

    public static void main(String[] args)
    {

        int choice;
        int bill;

        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME to the Summerdale Condo's \nPlease pick your ideal vacationing spot! \n1: Park View, $150,000" +
                "\n2: Golf Course View $170,000 \n3: Lake View $210,000");
        choice = input.nextInt();

        switch (choice)
        {
            case 1:
                bill = 150000;
                break;
            case 2:
                bill = 170000;
                break;
            case 3:
                bill = 210000;
                break;
            default:
                bill = 0;
        }

        if (bill > 0)
        {
            System.out.println("Would you like to purchase a garage with your Condo or use public parking? \n1:Garage $5,000" +
                    "\n2:Parking Spot Free");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    bill = bill + 5000;
                    break;
                default:
                    bill = bill;
            }

            System.out.println("The total cost of your Condo is " + bill + " dollars.");
        } else{
            System.out.println("Your entry was Invalid...");

        }


    }
}
