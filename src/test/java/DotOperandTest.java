import org.junit.Assert;
import org.junit.Test;

public class DotOperandTest {
    @Test
    public void itShouldBe1Dot() throws Exception {
        DotOperand dotOperand = new DotOperand(1);
        Assert.assertEquals(".", dotOperand.toString());
    }

    @Test
    public void itShouldBe5Dot() throws Exception {
        DotOperand dotOperand = new DotOperand(5);
        Assert.assertEquals(".....", dotOperand.toString());
    }

    @Test
    public void itShouldBe9Dot() throws Exception {
        DotOperand dotOperand = new DotOperand(9);
        Assert.assertEquals(".........", dotOperand.toString());
    }
}
