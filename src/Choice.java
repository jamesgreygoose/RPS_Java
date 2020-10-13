public enum Choice {
    ROCK,
    PAPER,
    SCISSORS;

    /**
     * Rules:
     * Rock beats Scissors
     * Paper beats Rock
     * Scissors beats Paper
     * The same play counts as a draw i.e. Rock and Rock
     * @param otherChoice - the Other choice
     * @return - Win, Loss, or Draw
     */
    public String gameResult(Choice otherChoice) {
        if (this == ROCK) {
            // Rocks logic
            if (otherChoice == ROCK) {
                return "Draw";
            } else if (otherChoice == PAPER) {
                return "Loss";
            } else {
                // Person must have said Scissors
                return "Win";
            }
        }
        else if (this == PAPER) {
            // Paper logic
            if (otherChoice == ROCK) {
                return "Win";
            } else if (otherChoice == PAPER) {
                return "Draw";
            } else {
                // Person must have said Scissors
                return "Loss";
            }
        }
        else {
            // Must be Scissors
            if (otherChoice == ROCK) {
                return "Loss";
            } else if (otherChoice == PAPER) {
                return "Win";
            } else {
                // Person must have said Scissors
                return "Draw";
            }
        }
    };
}
