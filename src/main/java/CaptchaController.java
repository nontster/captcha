public class CaptchaController {

    public Captcha getCaptcha(Cho cho) {
        return new Captcha(cho.getPattern(), cho.getOperand(), cho.getOperand(), cho.getOperator());
    }
}
