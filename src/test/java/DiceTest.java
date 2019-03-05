import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void test1() {
        test(20);
    }

    @Test
    public void test2() {
        test(200);
    }

    @Test
    public void test3() {
        test(90);
    }

    public void test(int numberOfTosses) {
        for (int i = 0; i < numberOfTosses; i++) {
            // Given
            Dice dice = new Dice();

            // when
            int result = dice.toss();
            boolean isMoreThan0 = result > 0;
            boolean isLessThan7 = result < 7;

            // then
            Assert.assertTrue(isMoreThan0);
            Assert.assertTrue(isLessThan7);
        }
    }
}
