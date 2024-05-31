import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTest {
    @Test
    public void testPass() {

        Assert.assertTrue(true);
    }

    @Test
    public void testFail() {

        Assert.assertTrue(false);
    }
}
