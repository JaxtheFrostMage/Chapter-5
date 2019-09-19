package Examples;

import java.util.Scanner;

public class Triangle
{

    public static void main(String[] args)
    {
        int loop = 0;
        do {
            int choice;


            Scanner input = new Scanner(System.in);

            System.out.println("What are you solving for? \n1: Right Triangle \n2: Isosceles \n3: Equilateral\n4: End Program\n");
            choice = input.nextInt();

            if (choice == 1) {
                rightTriangle();
            } else if (choice == 2) {
                isoscelesTriangle();
            } else if (choice == 3) {
                equilateralTriangle();
            } else if (choice == 4) {
                System.out.println("Good Bye!");
                loop = loop + 1;
            }else if (choice != 1 ||choice != 2 ||choice != 3 ||choice != 4){
                System.out.println("That was an improper response\n");
            }
        }while(loop == 0);
    }

    public static void rightTriangle()
    {
        Scanner input = new Scanner(System.in);
        String choice = null;
        double side1;
        double side2;
        System.out.println("which side do you wish to solve for? \nA- Side \nB- Side \nC- Side\n");
        choice = input.next();
        if(choice.equalsIgnoreCase("A")){
            System.out.println("Please enter for side B.");
            side1 = input.nextDouble();
            System.out.println("Please enter for side C.");
            side2 = input.nextDouble();
            rightTriangleMath(side1, side2, choice);
        } else if(choice.equalsIgnoreCase("B")){
            System.out.println("Please enter for side A.");
            side1 = input.nextDouble();
            System.out.println("Please enter for side C.");
            side2 = input.nextDouble();
            rightTriangleMath(side1, side2, choice);
        }else if(choice.equalsIgnoreCase("C")){
            System.out.println("Please enter for side A.");
            side1 = input.nextDouble();
            System.out.println("Please enter for side B.");
            side2 = input.nextDouble();
            rightTriangleHypotenuses(side1, side2, choice);
        }else{
            System.out.println("incorrect response.");
        }

    }

    public static void rightTriangleMath(double side1, double side2, String choice)
    {
        double missingSideNotC;
        missingSideNotC = Math.sqrt((side2 * side2) - (side1 * side1));
        System.out.println("side " + choice + " is " + missingSideNotC +"");
        System.out.println("Perimeter is " + (side1 + side2 + missingSideNotC));
        System.out.println("Area is is " + (side1 * missingSideNotC) / 2 + "\n");
    }

    public static void rightTriangleHypotenuses(double side1, double side2, String choice)
    {
        double C;
        C = Math.sqrt((side2 * side2) - (side1 * side1));
        System.out.println("side " + choice + " is " + C +"");
        System.out.println("Perimeter is " + (side1 + side2 + C));
        System.out.println("Area is is " + (side1 * side2) / 2 + "\n");

    }


    public static void isoscelesTriangle()
    {
        Scanner input = new Scanner(System.in);
        double base;
        double equalSides;
        double height;
        System.out.println("what is the length of the bases?");
        base = input.nextInt();
        System.out.println("what is the length of the sides?");
        equalSides = input.nextInt();

        height = Math.sqrt((equalSides * equalSides ) - ((base * base)/2));

        System.out.println("the height of your triangle is " + height);
        System.out.println("Perimeter is " + ((equalSides *2) + base ));
        System.out.println("Area is is " + (equalSides * equalSides) / 2 + "\n");
    }

    public static void equilateralTriangle()
    {
        Scanner input = new Scanner(System.in);
        double sides;
        System.out.println("What is the length of your sides");
        sides = input.nextDouble();

        System.out.println("Perimeter is " + (sides *3));
        System.out.println("Area is is " + (sides * sides) / 2 + "\n");
    }

}
