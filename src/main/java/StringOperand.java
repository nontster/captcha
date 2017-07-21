/**
 * Created by nontster on 18/7/2017 AD.
 */
public class StringOperand extends Operand {

    public StringOperand(int operand) {
        super(operand);
    }

    @Override
    public String toString() {
        return numberString[this.operand-1];
    }
}
