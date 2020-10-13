import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChoiceTest {
    @Test
    public void rockBeatsScissors() {
        Choice rock = Choice.ROCK;
        Choice scissors = Choice.SCISSORS;

        // Does Rock beat scissors?
        String expectedResultForRock = "Win";
        String actualResultForRock = rock.gameResult(scissors);

        assertEquals(expectedResultForRock, actualResultForRock);

        // Does Scissors lose to Rock?
        String expectedResultForScissors = "Loss";
        String actualResultForScissors = scissors.gameResult(rock);

        assertEquals(expectedResultForScissors, actualResultForScissors);
    }
}
