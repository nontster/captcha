/**
 * Created by nontster on 18/7/2017 AD.
 */
public class Operator {

    private int operator;

    public Operator(int operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        String[] operatorString = {"+", "*", "-"};

        return operatorString[this.operator - 1];
    }
}
