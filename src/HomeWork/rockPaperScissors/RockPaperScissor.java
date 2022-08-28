package HomeWork.rockPaperScissors;

import java.util.Scanner;

public class RockPaperScissor extends Play{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Player`s 1 choice: ");
        String player1 = scanner.nextLine().trim().toLowerCase();
        System.out.println("Please enter Player`s 2 choice: ");
        String player2 = scanner.nextLine().trim().toLowerCase();
        Play play1 = new Play();
        System.out.println(play1.rockPaperScissors(player1,player2));
    }

}
class Play{
    private String rock = "rock";
    private String paper = "paper";
    private String scissors = "scissors";

    public String rockPaperScissors(String player1,String player2) {
        String win1 = "Player 1 Win!";
        String win2 = "Player 2 Win!";
        String tie = "Tie!";
        String invalid = "Invalid enter";
        if (player1.equals(player2)) {
            return tie;
        } else if (player1.equals(rock) && player2.equals(paper)) {
            return win2;
        } else if (player1.equals(paper) && player2.equals(rock)) {
            return win1;
        } else if (player1.equals(scissors) && player2.equals(paper)) {
            return win1;
        } else if (player1.equals(paper) && player2.equals(scissors)) {
             return win2;
        } else if (player1.equals(scissors) && player2.equals(rock)) {
            return win2;
        } else if (player1.equals(rock) && player2.equals(scissors)) {
            return win1;
        } else {
               return invalid;
        }
    }
}


