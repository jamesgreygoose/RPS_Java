/**
 * Allows two Players to battle at Rock-Paper-Scissors
 * And updates their score tracking
 *
 * Behaviours
 * - battle(Player1, Player2) - sees who wins and updates their scores
 */
public class Battle {
    public String battle(Player player1, Player player2) {
        Choice playerOnesChoice = player1.getChoice();
        Choice playerTwosChoice = player2.getChoice();

        // Result is Win, Loss, Draw
        String result = playerOnesChoice.gameResult(playerTwosChoice);

        if (result == "Win") {
            player1.addWin();
            player2.addLoss();

            return player1.getName() + " wins";
        } else if (result == "Loss") {
            player1.addLoss();
            player2.addWin();

            return player2.getName() + " wins";
        } else {
            player1.addDraw();
            player2.addDraw();

            return "Draw";
        }
    };
}
