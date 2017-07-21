/**
 * Created by nontster on 18/7/2017 AD.
 */
public class NumberOperand extends Operand {

    public NumberOperand(int operand) {
        super(operand);
    }

    @Override
    public String toString() {
        return String.valueOf(this.operand);
    }
}
