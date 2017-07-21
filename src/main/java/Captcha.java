public class Captcha {
    static final int STRING_FIRST_PATTERN = 1;
    static final int INT_FIRST_PATTERN = 2;
    private Operand left;
    private Operand right;
    private Operator operator;

    public Captcha(int pattern, int left, int operator, int right) {
        this.left = OperandFactory.createLeft(pattern, left);
        this.right = OperandFactory.createRight(pattern, right);
        this.operator = new Operator(operator);
    }

    public Operand createLeft(int pattern, int value) {

        if (pattern == STRING_FIRST_PATTERN)
            return new StringOperand(value);
        return new NumberOperand(value);
    }

    public Operand getLeft() {
        return this.left;
    }

    public Operand createRight(int pattern, int value) {

        if (pattern == STRING_FIRST_PATTERN)
            return new NumberOperand(value);
        return new StringOperand(value);
    }

    public Operand getRight() {
        return this.right;
    }

    public Operator getOperator() {
        return this.operator;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.getLeft(), this.operator, this.getRight());
    }
}
