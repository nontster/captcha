import org.junit.Assert;
import org.junit.Test;

public class NumberOperandTest {
    @Test
    public void itShouldBe1() {
        NumberOperand numberOperand = new NumberOperand(1);
        Assert.assertEquals("1", numberOperand.toString());
    }

    @Test
    public void itShouldBe5() {
        NumberOperand numberOperand = new NumberOperand(5);
        Assert.assertEquals("5", numberOperand.toString());
    }
}
