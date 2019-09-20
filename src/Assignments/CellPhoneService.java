package Assignments;

import java.util.Scanner;

public class CellPhoneService {

    public static void main(String[] args)
    {
        int choice;
        int minutes;
        int texts;
        int gigabytes;
        int bill;


        Scanner input = new Scanner(System.in);

        System.out.println("how many minutes do you want for your plan?");
        minutes = input.nextInt();
        System.out.println("how many texts do you want for your plan?");
        texts = input.nextInt();
        System.out.println("how many gigabytes of data do you want for your plan?");
        gigabytes = input.nextInt();

        bestPlanForCustomer(minutes, texts, gigabytes);

        System.out.println("What plan would you like to purchase? \n1 A: less then 500 min, no text, no data, $49 " +
                "\n2 B: less then 500 min, unlimited text, no data $55 \n3 C: more then 500 min, 100 texts, no data $61 " +
                "\n4 D: more then 500 min, more then 100 text, no data . $70 " +
                "\n5 E: unlimited min, unlimited texts, less then 2 gigabytes $79 " +
                "\n6 F: unlimited min, unlimited texts, more then 2 gigabytes $87 ");
        choice = input.nextInt();

        switch (choice)
        {
            case 1:
                bill = 49;
                break;
            case 2:
                bill = 55;
                break;
            case 3:
                bill = 61;
                break;
            case 4:
                bill = 70;
                break;
            case 5:
                bill = 79;
                break;
            case 6:
                bill = 87;
                break;
            default:
                bill = 0;
        }
        System.out.println("Your bill is " + bill + " dollars have a nice day!");

        }

        public static void bestPlanForCustomer(int minutes, int texts, int gigabytes)
        {
            if(gigabytes <= 0)
            {
                if (minutes <= 500 && texts == 0)
                {
                    System.out.println("Your parameters match with Plan A! \n");
                }
                else if (minutes <= 500 && texts > 100)
                {
                    System.out.println("Your parameters match with Plan B! \n");
                }
                else if (minutes >= 500 && texts <= 100)
                {
                    System.out.println("Your parameters match with Plan C! \n");
                }
                else if (minutes >= 500 && texts >= 100)
                {
                    System.out.println("Your parameters match with Plan D! \n");
                }
            } else if (gigabytes <= 2)
            {
                System.out.println("Your parameters match with Plan E! \n");
            }
            else if (gigabytes > 2)
            {
                System.out.println("Your parameters match with Plan F! \n");
            }
        }

    }

