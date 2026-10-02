package lab.poker;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class BonusIndependenceTest {
    private boolean bonus(String hand) {
        return new BonusPolicy().qualifies(Hands.of(hand));
    }

    // Add an independence test here.
    @Test void bChangesDecision() {
    assertTrue(bonus("2H 3H 4H 5H 6H"));
    assertFalse(bonus("2C 3D 4H 5S 6C"));
}

}
