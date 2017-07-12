package com.InClassLabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Learn your squares and cubes!");
        System.out.println();

        String userInput;

        do {
            System.out.println("Enter an integer: ");
            int userNum = scan.nextInt();
            System.out.println("Number" + "\tSquared" + "\tCubed");
            for (int i = 1; i <= userNum; i++) {
                System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
            }
            scan.nextLine();
            System.out.println("Continue? Y/N:");
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("n")){
                System.out.println("Goodbye.");
            }
        } while (userInput.equalsIgnoreCase("y"));

    }
}
