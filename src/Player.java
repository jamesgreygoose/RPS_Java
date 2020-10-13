/**
 * A Player:
 *
 * State
 * - Choice
 * - Name
 * - Score tracking: Wins, Losses, Draws
 * - Human or Computer player?
 *
 * Behaviours
 * resetChoice()
 * makeChoice()
 * getName()
 * printScorecard()
 * getChoice()
 * addWin()
 * addLoss()
 * addDraw()
 */
public class Player {
    private Choice choice;
    private final String name;

    private int wins = 0;
    private int losses = 0;
    private int draws = 0;

    private final boolean isHuman;

    public Player(String name, boolean isHuman) {
        this.name = name;
        this.isHuman = isHuman;
    }

    public int resetChoice() {
        choice = null;
        return 0;
    }

    public Choice getChoice() {
        return choice;
    }

    public int makeChoice(Choice playersChoice) {
        choice = playersChoice;
        return 1;
    }

    public String getName() {
        return name;
    }

    public void addWin() {
        wins += 1;
    }

    public void addLoss() {
        losses += 1;
    }

    public void addDraw() {
        draws += 1;
    }

    public String printScorecard() {
        return "Your score is, wins: " + wins + ", draws: " + draws + ", losses: " + losses;
    }
}
