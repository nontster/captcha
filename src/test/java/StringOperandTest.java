import org.junit.Assert;
import org.junit.Test;

public class StringOperandTest {
    @Test
    public void itShouldBeOne() {
        StringOperand stringOperand = new StringOperand(1);
        Assert.assertEquals("One", stringOperand.toString());
    }

    @Test
    public void itShouldBeFive() {
        StringOperand stringOperand = new StringOperand(5);
        Assert.assertEquals("Five", stringOperand.toString());
    }

    @Test
    public void itShoundBeNine() {
        StringOperand stringOperand = new StringOperand(9);
        Assert.assertEquals("Nine", stringOperand.toString());
    }
}
