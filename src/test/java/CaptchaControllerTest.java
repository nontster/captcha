import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class CaptchaControllerTest {
    @Test
    public void verifyThatGetPatternHasBeenCalledOnce() throws Exception {
        // Arrange
        SpyCho spyCho = new SpyCho(new Random());
        CaptchaController captchaController = new CaptchaController();
        // Act
        captchaController.getCaptcha(spyCho);
        // Assert
        Assert.assertTrue(spyCho.verifyThatGetPatternHasBeenCalledOnce());
    }

    @Test
    public void verifyThatGetOperandHasBeenCalledTwice() throws Exception {
        // Arrange
        SpyCho spyCho = new SpyCho(new Random());
        CaptchaController captchaController = new CaptchaController();
        // Act
        captchaController.getCaptcha(spyCho);
        // Assert
        Assert.assertTrue(spyCho.verifyThatGetOperandHasBeenCalledTwice());
    }

    @Test
    public void verifyThatGetOperationHasBeenCalledOnce() throws Exception {
        // Arrange
        SpyCho spyCho = new SpyCho(new Random());
        CaptchaController captchaController = new CaptchaController();
        // Act
        captchaController.getCaptcha(spyCho);
        // Assert
        Assert.assertTrue(spyCho.verifyThatGetOperationHasBeenCalledOnce());
    }
}

class SpyCho extends Cho {
    private Captcha captcha;
    int patternSignal = 0;
    int operandSignal = 0;
    int operatorSignal = 0;

    public Captcha getCaptcha() {
        return this.captcha;
    }

    public SpyCho(Random random) {
        super(random);
    }

    @Override
    public int getPattern() {
        patternSignal++;
        return super.getPattern();
    }

    @Override
    public int getOperand() {
        operandSignal ++;
        return super.getOperand();
    }

    @Override
    public int getOperator() {
        operatorSignal++;
        return super.getOperator();
    }

    public boolean verifyThatGetPatternHasBeenCalledOnce(){
        return patternSignal == 1;
    }

    public boolean verifyThatGetOperandHasBeenCalledTwice(){
        return operandSignal == 2;
    }

    public boolean verifyThatGetOperationHasBeenCalledOnce(){
        return operatorSignal == 1;
    }
}
