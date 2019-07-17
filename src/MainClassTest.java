import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString()
    {

        String expected = this.getClassString();
        String actual = "hello";

        Assert.assertTrue("Hello или hello в подстроке нет", expected.toLowerCase().contains(actual));

    }
}
