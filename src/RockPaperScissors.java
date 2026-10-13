
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "Y";

        while (again.equalsIgnoreCase("Y")) {
            String a = getMove(input, "Player A");
            String b = getMove(input, "Player B");

            if (a.equals(b)) {
                System.out.println(a + " vs " + b + " it's a Tie!");
            } else if ((a.equals("R") && b.equals("S"))
                    || (a.equals("S") && b.equals("P"))
                    || (a.equals("P") && b.equals("R"))) {

                printResult(a);
                System.out.println("Player A wins!");

            } else {
                printResult(b);
                System.out.println("Player B wins!");
            }

            System.out.print("Play again? (Y/N): ");
            again = input.nextLine().trim();

            while (!again.equalsIgnoreCase("Y")
                    && !again.equalsIgnoreCase("N")) {
                System.out.print("Please enter Y or N: ");
                again = input.nextLine().trim();
            }
        }

        System.out.println("Thanks for playing!");
        input.close();
    }

    public static String getMove(Scanner input, String player) {
        String move;

        while (true) {
            System.out.print(player + ", enter R, P, or S: ");
            move = input.nextLine().trim().toUpperCase();

            if (move.equals("R") || move.equals("P")
                    || move.equals("S")) {
                return move;
            }

            System.out.println("Invalid move. Enter R, P, or S.");
        }
    }

    public static void printResult(String winnerMove) {
        if (winnerMove.equals("R")) {
            System.out.println("Rock breaks Scissors.");
        } else if (winnerMove.equals("P")) {
            System.out.println("Paper covers Rock.");
        } else {
            System.out.println("Scissors cuts Paper.");
        }
    }
}