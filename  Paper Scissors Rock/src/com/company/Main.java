package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

	Scanner scanner= new Scanner(System.in);
    System.out.println("enter n : ");
    int n = scanner.nextInt();
    Random random = new Random();
    String [] plays={"rock","paper","scissors"};
    int repeat;
    String userChoice, computerChoice;
    do {
       n--;
        System.out.println(" \n Do your play : rock  , paper  or scissors ? \n");
        userChoice = scanner.next();
        computerChoice = plays[random.nextInt(2)];
        System.out.println("Your play :" + userChoice + " \n Computer play :" + computerChoice+"\n");
        if (userChoice.equals(computerChoice)) {
             System.out.println(" tie!!!\n");
        } else {
            switch (userChoice) {
                case "rock":
                    if (computerChoice.equals("scissors")) {
                            System.out.println("\n***YOU WIN **\n");

                    } else {
                            System.out.println("\n***COMPUTER WIN **\n");
                    }
                    break;

                case "paper":
                    if (computerChoice.equals("rock")) {
                            System.out.println("\n***YOU WIN **\n");

                    }   else {
                            System.out.println("\n***COMPUTER WIN **\n");
                    }
                         break;

                case "scissors":
                    if (computerChoice.equals("paper")) {
                            System.out.println("\n***YOU WIN **\n");

                    } else {
                            System.out.println("\n***COMPUTER WIN **\n");
                    }
                         break;
                default:
                          System.out.println("Invalid play ");
            }

        }
        System.out.println("Repeat the Game ? \n 1/yes \n 2/No \n  Response :  ");
        do{repeat=scanner.nextInt();}
        while (repeat!=2 && repeat!=1);
    }

    while(repeat==1 && n > 0 );
    System.out.println("\n Process finished");
    }
}
