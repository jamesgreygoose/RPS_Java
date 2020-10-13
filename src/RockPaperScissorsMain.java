public class RockPaperScissorsMain {

    public static void main(String[] args) {
        System.out.println("I am going to challenge you to Rock-Paper-Scissors");
        /**
         * Rock Paper Scissors is a 2 player-game
         *
         * We have a Human Player
         * We have a Computer Player
         * We have 3 choices of play "Rock", "Paper", or "Scissors"
         *
         * Rules:
         * Rock beats Scissors
         * Paper beats Rock
         * Scissors beats Paper
         * The same play counts as a draw i.e. Rock and Rock
         *
         */

        /**
         * Objects do we need?
         *
         * Players: Human and Computer
         * - Choice
         * - Name
         * - Score tracking: Wins, Losses, Draws
         * - Human or Computer player?
         * resetChoice()
         * makeChoice()
         * getName()
         * printScorecard()
         *
         * Choices: Rock, Paper or Scissors
         * enum type
         * - Rules / might be state or behaviour
         */
        Player tim = new Player("Tim", false);
        tim.makeChoice(Choice.ROCK);

        Player human = new Player("Meatbag", true);
        human.makeChoice(Choice.PAPER);

        Battle arena = new Battle();

        String resultOfBattle = arena.battle(tim, human);
        tim.resetChoice();
        human.resetChoice();

        System.out.println(resultOfBattle);

        System.out.println(human.getName() + ": " + human.printScorecard());
    }
}
