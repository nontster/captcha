/**
 * Created by nontster on 18/7/2017 AD.
 */
public class OperandFactory {
    public static Operand createLeft(int pattern, int value) {

        switch(pattern){
            case 1:
                return new StringOperand(value);
            case 2:
                return new NumberOperand(value);
            case 3:
                return new DotOperand(value);
            case 4:
                return new NumberOperand(value);
            case 5:
                return new DotOperand(value);
            case 6:
                return new StringOperand(value);
            default:
                return new StringOperand(value);
        }
    }

    public static Operand createRight(int pattern, int value) {

        switch (pattern){
            case 1:
                return new NumberOperand(value);
            case 2:
                return new StringOperand(value);
            case 3:
                return new NumberOperand(value);
            case 4:
                return new DotOperand(value);
            case 5:
                return new StringOperand(value);
            case 6:
                return new DotOperand(value);
            default:
                return new NumberOperand(value);
        }
    }
}
