package com.InClassLabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Learn your squares and cubes!");
        System.out.println();

        String userInput = "y";
        int userNum;

        do {
            System.out.println("Enter an integer less than 100: ");
            userNum = scan.nextInt();

            if ((userNum < 1) || (userNum > 100)) {
                System.out.println("The integer you entered was too large.");
            }
            else {
                squaresAndCubes(userNum);
                scan.nextLine();
                System.out.println("Continue? Y/N:");
                userInput = scan.nextLine();
                if (userInput.equalsIgnoreCase("n")) {
                    System.out.println("Goodbye.");
                }
            }
        } while (userInput.equalsIgnoreCase("y"));

    }


    public static void squaresAndCubes(int userNum) {
        System.out.println("Number" + "\tSquared" + "\tCubed");
        for (int i = 1; i <= userNum; i++) {
            System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
        }
    }

}