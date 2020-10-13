import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ComputerChoiceTest {
    @Test
    public void whenComputerMakesAChoice_itShouldReturnANonEmptyString() {
        final ComputerChoice computerChoice = new ComputerChoice();
        final String actualChoice = computerChoice.makeChoice();

        assertFalse(actualChoice.isEmpty());
    }
}
