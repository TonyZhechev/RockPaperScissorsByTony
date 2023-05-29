package RockPaperScissorsByTony;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSCISORS {public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Choose [r]ock, [s]cissors or [p]aper : ");

        int playerPoints = 0;
        int computerPoints = 0;


        for (int i = 1; i <= 10; i++) {


            String playerMove = scanner.nextLine();


            if ("r".equals(playerMove) || "rock".equals(playerMove)) {
                playerMove = ROCK;

            } else if ("p".equals(playerMove) || "paper".equals(playerMove)) {
                playerMove = PAPER;

            } else if ("s".equals(playerMove) || "scissors".equals(playerMove)) {
                playerMove = SCISSORS;

            } else {
                System.out.println("Invalid Input. Try Again...");
                i = i - 1;
                continue;
            }
            System.out.printf("My chose is: %s\n", playerMove);


            Random random = new Random();
            int computerRandomNumber = random.nextInt(3);

            String computerMove = "";

            switch (computerRandomNumber) {
                case 0:
                    computerMove = ROCK;
                    break;
                case 1:
                    computerMove = SCISSORS;
                    break;
                case 2:
                    computerMove = PAPER;
                    break;
                default:
                    System.out.println("The computer is not responding. Try again...");
                    i = i - 1;
                    continue;
            }
            System.out.printf("The computer chose %s\n", computerMove);

            if (playerMove.equals(ROCK) && computerMove.equals(SCISSORS) ||
                    playerMove.equals(PAPER) && computerMove.equals(ROCK) ||
                    playerMove.equals(SCISSORS) && computerMove.equals(PAPER)) {
                playerPoints++;

                System.out.println("You get a point!");

            } else if (playerMove.equals(ROCK) && computerMove.equals(PAPER) ||
                    playerMove.equals(PAPER) && computerMove.equals(SCISSORS) ||
                    playerMove.equals(SCISSORS) && computerMove.equals(ROCK)) {
                computerPoints++;

                System.out.println("The computer get a point!");

            } else {
                System.out.println("Nobody get a point!");

            }

        }
        System.out.println();
        System.out.println("!!! GAME OVER !!!");
        System.out.println();

        if (playerPoints > computerPoints) {
            System.out.println("Congratulations! You win the game!");


        } else if (computerPoints > playerPoints) {
            System.out.println("Ha-Ha-Ha! You lose!");


        } else {
            System.out.println("The game is draw!");

        }
        System.out.println();
        System.out.printf("Your points: %d || Computer points: %d", playerPoints, computerPoints);
    }
}}
