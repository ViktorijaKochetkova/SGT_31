package HomeWork.rockPaperScissors;

import java.util.Scanner;

public class RockPaperScissor extends Play {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Player`s 1 choice: ");
        String player1 = scanner.nextLine().trim().toLowerCase();
        System.out.println("Please enter Player`s 2 choice: ");
        String player2 = scanner.nextLine().trim().toLowerCase();
        Play play1 = new Play();
        System.out.println(play1.rockPaperScissors());
    }
}

