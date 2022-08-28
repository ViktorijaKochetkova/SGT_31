package HomeWork.rockPaperScissors;
public class Play{
    private String rock;
    private String paper;
    private String scissors;
    private String player1;
    private String player2;


    public String rockPaperScissors(){
        String win1 = "Player 1 Win!";
        String win2 = "Player 2 Win!";
        String tie = "Tie";
        String invalid = "Invalid enter";
        if (player1.equals(player2)) {
            System.out.println(tie);
            return tie;
        } else if (player1.equals(rock) && player2.equals(paper)) {
            System.out.println(win2);
            return win2;
        } else if (player1.equals(paper) && player2.equals(rock)) {
            System.out.println(win1);
            return win1;
        } else if (player1.equals(scissors) && player2.equals(paper)) {
            System.out.println(win2);
            return win2;
        } else if (player1.equals(paper) && player2.equals(scissors)) {
            System.out.println(win1);
            return win1;
        } else if (player1.equals(scissors) && player2.equals(rock)) {
            System.out.println(win2);
            return win2;
        } else if (player1.equals(rock) && player2.equals(scissors)) {
            System.out.println(win1);
            return win1;
        } else {
            System.out.println(invalid);
            return invalid;
        }


    }
   }
