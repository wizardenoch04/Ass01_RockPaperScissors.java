
import java.util.Scanner;

public class Ass01_RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String playAgain;

        do {
            String playerA;
            String playerB;

            // Get a valid move from Player A
            do {
                System.out.print("Player A, enter R, P, or S: ");
                playerA = input.nextLine().trim().toUpperCase();

                if (!playerA.matches("[RPS]")) {
                    System.out.println("Invalid move. Please try again.");
                }
            } while (!playerA.matches("[RPS]"));

            // Get a valid move from Player B
            do {
                System.out.print("Player B, enter R, P, or S: ");
                playerB = input.nextLine().trim().toUpperCase();

                if (!playerB.matches("[RPS]")) {
                    System.out.println("Invalid move. Please try again.");
                }
            } while (!playerB.matches("[RPS]"));

            // Display the matchup and result
            if (playerA.equals(playerB)) {

                System.out.println("It's a tie!");

            } else if (playerA.equals("R") && playerB.equals("S")) {

                System.out.println("Rock breaks Scissors.");
                System.out.println("Player A wins!");

            } else if (playerA.equals("P") && playerB.equals("R")) {

                System.out.println("Paper covers Rock.");
                System.out.println("Player A wins!");

            } else if (playerA.equals("S") && playerB.equals("P")) {

                System.out.println("Scissors cuts Paper.");
                System.out.println("Player A wins!");

            } else if (playerB.equals("R") && playerA.equals("S")) {

                System.out.println("Rock breaks Scissors.");
                System.out.println("Player B wins!");

            } else if (playerB.equals("P") && playerA.equals("R")) {

                System.out.println("Paper covers Rock.");
                System.out.println("Player B wins!");

            } else {

                System.out.println("Scissors cuts Paper.");
                System.out.println("Player B wins!");
            }

            // Ask whether to play again
            do {
                System.out.print("Play again? (Y/N): ");
                playAgain = input.nextLine().trim();

                if (!playAgain.equalsIgnoreCase("Y")
                        && !playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Please enter Y or N.");
                }

            } while (!playAgain.equalsIgnoreCase("Y")
                    && !playAgain.equalsIgnoreCase("N"));

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        input.close();
    }
}
