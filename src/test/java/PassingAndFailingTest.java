import org.junit.Assert;
import org.junit.Test;

public class PassingAndFailingTest {

    @Test
    public void passingTest() {
        Assert.assertEquals(0,0);
    }

    @Test
    public void failingTest() {
        Assert.assertEquals(1,0);
    }
}
