
public class Captcha {
    private int left;
    private int right;
    private int operator;
    private int pattern;
    static final int STRING_FIRST_PATTERN=1;
    static final int INT_FIRST_PATTERN =2;
    private final String[] numberString = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public Captcha(int pattern, int left, int operator, int right) {
        this.left = left;
        this.right = right;
        this.operator = operator;
        this.pattern = pattern;
    }

    public String getLeft() {

        if(this.pattern == INT_FIRST_PATTERN)
            return String.valueOf(this.left);

        return numberString[this.left - 1];
    }

    public String getRight() {

        if(this.pattern == INT_FIRST_PATTERN)
            return numberString[this.right-1];

        return String.valueOf(right);
    }

    public String getOperator() {
        String[] operatorString = {"+", "*", "-"};

        return operatorString[this.operator - 1];

    }
}
