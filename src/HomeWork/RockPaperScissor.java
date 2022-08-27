package HomeWork;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String r = "rock";
        String p = "paper";
        String s = "scissors";

        String [] plays = {r,p,s};


        String player1;
        String player2;

        char runAgain = 'y';

        while (runAgain == 'y'){

            System.out.println("Please enter Player`s 1 choice: ");
            player1 = scanner.nextLine().trim().toLowerCase();
            System.out.println("Please enter Player`s 2 choice: ");
            player2 = scanner.nextLine().trim().toLowerCase();

            if (player1.equals(player2)){
                System.out.println("Tie");


            } else if (player1.equals(r) &&  player2.equals(p)) {
                System.out.println("Player 2 win!");
            } else if (player1.equals(p) && player2.equals(r)) {
                System.out.println("Player 1 win!");
            }else if (player1.equals(s) &&  player2.equals(p)) {
                System.out.println("Player 2 win!");
            } else if (player1.equals(p) && player2.equals(s)) {
                System.out.println("Player 1 win!");
            }else if (player1.equals(s) &&  player2.equals(r)) {
                System.out.println("Player 2 win!");
            } else if (player1.equals(r) && player2.equals(s)) {
                System.out.println("Player 1 win!");
            }else{
                System.out.println("Invalid play");}

            System.out.println();
            System.out.println("Do you want to check your personal number again? y/n");
            runAgain = scanner.next().charAt(0);
            scanner.nextLine();

        }
    }
}