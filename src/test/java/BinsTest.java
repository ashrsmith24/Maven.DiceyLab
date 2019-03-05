import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    @Test
    public void testConstruction() {
        // given
        Bins bins = new Bins();
        int expectedNumberOfTosses = 0;

        for (int tossValue = 1; tossValue <= 6; tossValue++) {
            int actualNumberOfTosses = bins.getNumberOfTosses(tossValue);
            Assert.assertEquals(expectedNumberOfTosses, actualNumberOfTosses);
        }
    }

    @Test
    public void testStore() {
        // given
        Bins bins = new Bins();
        Integer valueToBeStored = 2;
        int expectedNumberOfTosses = 10;

        // when
        for (int i = 0; i < expectedNumberOfTosses; i++) {
            bins.store(valueToBeStored);
        }
        int actualNumberOfTosses = bins.getNumberOfTosses(valueToBeStored);

        // then
        Assert.assertEquals(expectedNumberOfTosses, actualNumberOfTosses);
    }
}
