import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nontster on 18/7/2017 AD.
 */
public class OperandFactoryTest {
    final int dummy_value = 1;

    @Test
    public void firstPatternLeftShouldBeInstanceOfStringOperand() {

        Assert.assertTrue(OperandFactory.createLeft(1, dummy_value) instanceof StringOperand);
    }

    @Test
    public void firstPatternRightShouldBeInstanceOfNumberOperand() {
        Assert.assertTrue(OperandFactory.createRight(1,dummy_value) instanceof NumberOperand);
    }

    @Test
    public void secondPatternLeftShouldBeInstanceOfNumberOperand() {
        Assert.assertTrue(OperandFactory.createLeft(2,dummy_value) instanceof NumberOperand);
    }

    @Test
    public void secondPatternRightShouldBeInstanceOfStringOperand() {
        Assert.assertTrue(OperandFactory.createRight(2, dummy_value) instanceof StringOperand);
    }

    @Test
    public void thirdPatternLeftShouldBeInstanceOfDotOperand() {
        Assert.assertTrue(OperandFactory.createLeft(3,dummy_value) instanceof DotOperand);
    }

    @Test
    public void thirdPatternRightShouldBeInstanceOfNumberOperand() throws Exception {
        Assert.assertTrue(OperandFactory.createRight(3,dummy_value) instanceof NumberOperand);
    }

    @Test
    public void forthPatternLeftShouldBeInstanceOfNumberOperand() throws Exception {
        Assert.assertTrue(OperandFactory.createLeft(4, dummy_value) instanceof  NumberOperand);
    }

    @Test
    public void forthPatternRightShouldBeInstanceOfDotOperand() throws Exception {
        Assert.assertTrue(OperandFactory.createRight(4,dummy_value) instanceof DotOperand);
    }

    @Test
    public void fifthPatternLeftShouldBeInstanceOfDotOperand() throws Exception {
        Assert.assertTrue(OperandFactory.createLeft(5,dummy_value) instanceof DotOperand);
    }

    @Test
    public void fifthPatternRightShouldBeInstanceOfStringOperand() throws Exception {
        Assert.assertTrue(OperandFactory.createRight(5,dummy_value) instanceof StringOperand);
    }

    @Test
    public void sixthPatternLeftShouldBeInstanceOfStringOperand() throws Exception {
        Assert.assertTrue(OperandFactory.createLeft(6,dummy_value) instanceof StringOperand);
    }

    @Test
    public void sixthPatternRightShouldBeInstanceOfDotOperand() throws Exception {
        Assert.assertTrue(OperandFactory.createRight(6,dummy_value) instanceof DotOperand);
    }
}
