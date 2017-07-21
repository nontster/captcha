import java.util.Collections;

public class DotOperand extends Operand {

    public DotOperand(int operand) {
        super(operand);
    }

    @Override
    public String toString() {
        return String.join("", Collections.nCopies(this.operand, "."));
    }
}
