import org.junit.Assert;
import org.junit.Test;

public class FailingTest {
    @Test
    public void failingTest() {
        Assert.assertEquals(1,0);
    }
}
