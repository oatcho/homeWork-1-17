package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        String go;
        String choose;
        String doOver = "yes";
        boolean imDone = false;

        while(doOver == "yes") {

            System.out.println("Welcome to my home tiny human, I am the JAVA genie.");
            System.out.println("I'm like a regular genie ...except I can only grant you one of 4 wishes.");
            System.out.println("Though I must warn you, be careful what you wish for...(hit y to continue)");

            go = key.next();
            if (go.equalsIgnoreCase("y")) {

                System.out.println("1) I wish to have 100 million dollars!");
                System.out.println("2) I wish to be famous!");
                System.out.println("3) I wish I could fly!");
                System.out.println("4) I wish for World peace!");
            }

            choose = key.next();
            if (choose.equalsIgnoreCase("1")) {
                System.out.println("Sure enough, $100,000,000.00 appears in your bank out. But the IRS doesn't believe in genies so you spend the rest of your life in jail for money laundering and tax evasion.");
            }
            if (choose.equalsIgnoreCase("2")) {
                System.out.println("Everyone now knows you as the crazy person who claims to have seen a genie. You're committed to a psych ward.");
            }
            if (choose.equalsIgnoreCase("3")) {
                System.out.println("Congratulations, you've just been turned into a pigeon.");
            }
            if (choose.equalsIgnoreCase("4")) {
                System.out.println("Great job, now everyone's dead.");
            }

            System.out.println("Would you like to try again?");

            doOver = key.next();


        }



    }
}
