import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CaptchaTest {

    @Test
    @Parameters({
            "1,1,1,9, One + 9",
            "1,1,2,9, One * 9",
            "1,1,3,9, One - 9",
            "2,8,1,3, 8 + Three",
            "2,8,2,3, 8 * Three",
            "2,8,3,3, 8 - Three",
            "3,1,1,9, . + 9",
            "3,5,2,5, ..... * 5",
            "3,9,3,1, ......... - 1",
            "4,1,1,9, 1 + .........",
            "4,5,2,5, 5 * .....",
            "4,9,3,1, 9 - .",
            "5,1,1,9, . + Nine",
            "5,5,2,5, ..... * Five",
            "5,9,3,1, ......... - One",
            "6,1,1,1, One + ."
    })
    public void verifyCaptcha(int pattern, int left, int operator, int right, String expected) {
        Captcha captcha = new Captcha(pattern, left, operator, right);
        Assert.assertEquals(expected, captcha.toString());
    }
}
