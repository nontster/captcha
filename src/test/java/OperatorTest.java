import org.junit.Assert;
import org.junit.Test;

public class OperatorTest {
    @Test
    public void operator1ShouldBePlus() {
        Operator operator = new Operator(1);
        String expected = "+";
        Assert.assertEquals(expected, operator.toString());
    }

    @Test
    public void operator2ShouldBeMultiply() throws Exception {
        Operator operator = new Operator(2);
        String expected = "*";
        Assert.assertEquals(expected, operator.toString());
    }
}
