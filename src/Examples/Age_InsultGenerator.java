package Examples;

import java.util.Scanner;

public class Age_InsultGenerator
{

    public static void main(String[] args)
    {
        int age;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        age = input.nextInt();

        if(age >= 1 && age <= 6){
            System.out.println("Don't you have a dipper that needs changing? Get Lost!");
        } else if(age >= 7 && age <= 12){
            System.out.println("So eager to learn yet you know nothing, and will likely never figure anything meaningful out...");
        } else if(age >= 13 && age <= 19){
            System.out.println("I can almost smell the Angst from within this monitor.");
        }else if(age >= 20 && age <= 30){
            System.out.println("Finally a young adult living on your own! Hows the college debit working for you?");
        }else if(age >= 31 && age <= 45){
            System.out.println("Like Bon Jovi said, \nwe're half way there\n" +
                    "Woah, livin' on a prayer");
        }else if(age >= 46 && age <= 60){
            System.out.println("Do you feel like you've achieved something by now? Meet your goals? Frankly you didn't set the bar high.");
        }else if(age >= 61 && age <= 80){
        System.out.println("Im impressed, I didn't think you'd make it this far.");
        }else if(age >= 81 && age <= 150){
        System.out.println("At this point you are just stalling till your inevitable mortality takes its toll.");
        }
}

}
