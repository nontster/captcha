import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Home on 7/18/2017 AD.
 */
public class CaptchaTest {
    int dummy_operator = 1;
    int dummy_right = 1;
    int dummy_left = 1;


    @Test
    public void firstPatternLeftOperandShouldBeOne() {


        Captcha captcha = new Captcha(Captcha.STRING_FIRST_PATTERN, 1, dummy_operator, dummy_right);
        String expected = "One";
        Assert.assertEquals(expected, captcha.getLeft());

    }

    @Test
    public void firstPatterLeftOperandShouldBeFive() {

        Captcha captcha = new Captcha(Captcha.STRING_FIRST_PATTERN, 5, dummy_operator, dummy_right);
        String expected = "Five";
        Assert.assertEquals(expected, captcha.getLeft());
    }

    @Test
    public void firstPatternLeftOperandShouldBeNine() {
        Captcha captcha = new Captcha(Captcha.STRING_FIRST_PATTERN, 9, dummy_operator, dummy_right);
        String expected = "Nine";
        Assert.assertEquals(expected, captcha.getLeft());
    }

    @Test
    public void firstPatterRightOperandShouldBe1() {
        Captcha captcha = new Captcha(Captcha.STRING_FIRST_PATTERN, dummy_left, dummy_operator, 1);
        String expected = "1";
        Assert.assertEquals(expected, captcha.getRight()
        );
    }

    @Test
    public void firstPatternRightOperandShouldBe5() {
        Captcha captcha = new Captcha(Captcha.STRING_FIRST_PATTERN, dummy_left, dummy_operator, 5);
        String expected = "5";
        Assert.assertEquals(expected, captcha.getRight());
    }

    @Test
    public void firstPatternRightOperandShouldBe9() {
        Captcha captcha = new Captcha(Captcha.STRING_FIRST_PATTERN, dummy_left, dummy_operator, 9);
        String expected = "9";
        Assert.assertEquals(expected, captcha.getRight());
    }

    @Test
    public void operator1ShouldBePlus() {

        Captcha captcha = new Captcha(Captcha.STRING_FIRST_PATTERN, dummy_left, 1, 1);
        String expected = "+";
        Assert.assertEquals(expected, captcha.getOperator());

    }

    @Test
    public void operator2ShouldBeMultiply() {
        Captcha captcha = new Captcha(Captcha.STRING_FIRST_PATTERN, dummy_left, 2, dummy_right);
        String expected = "*";
        Assert.assertEquals(expected, captcha.getOperator());
    }

    @Test
    public void operator3ShouldBeMinus() {
        Captcha captcha = new Captcha(Captcha.STRING_FIRST_PATTERN, dummy_left, 3, dummy_right);
        String expected = "-";
        Assert.assertEquals(expected, captcha.getOperator());
    }

    @Test
    public void secondPatternLeftOperandShouldBe1() {
        Captcha captcha = new Captcha(Captcha.INT_FIRST_PATTERN, 1, dummy_operator, dummy_right);
        String expected = "1";
        Assert.assertEquals(expected, captcha.getLeft());
    }

    @Test
    public void secondPatternLeftOperandShouldBeFive() {
        Captcha captcha = new Captcha(Captcha.INT_FIRST_PATTERN, 5, dummy_operator, dummy_right);
        String expected  = "5";
        Assert.assertEquals(expected, captcha.getLeft());
    }

    @Test
    public void secondPatternRightOperandShouldBeOne() {
        Captcha captcha = new Captcha(Captcha.INT_FIRST_PATTERN, dummy_left, dummy_operator, 1);
        String expected = "One";
        Assert.assertEquals(expected, captcha.getRight());
    }


}
