import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ChoTest {
    @Test
    public void verifyThatNextIntHasBeenCalledOnceWithParameterEqualTo2() throws Exception {
        // Arrange
        SpyRandom spyRandom = new SpyRandom();
        Cho cho = new Cho(spyRandom);
        // Act
        cho.getPattern();
        // Assert
        Assert.assertTrue(spyRandom.verifyThatNextIntHasBeenCalledOnceWithParameterEqual2());
    }

    @Test
    public void verifyThatNextIntHasBeenCallOnceWithParameterEqualTo9() throws Exception {
        // Arrange
        SpyRandom spyRandom = new SpyRandom();
        Cho cho = new Cho(spyRandom);
        // Act
        cho.getOperand();
        // Assert
        Assert.assertTrue(spyRandom.verifyThatNextIntHasBeenCalledOnceWithParameterEqual9());
    }

    @Test
    public void verifyThatNextIntHasBeenCalledOnceWithParameterEqualTo3() throws Exception {
        // Arrange
        SpyRandom spyRandom = new SpyRandom();
        Cho cho = new Cho(spyRandom);
        // Act
        cho.getOperator();
        // Assert
        Assert.assertTrue(spyRandom.verifyThatNextIntHasBeenCalledOnceWithParameterEqual6());
    }

    class SpyRandom extends Random {
        int signal = 0;
        int bound = 0;

        public int nextInt(int bound) {
            signal++;
            this.bound = bound;
            return 0;
        }

        public boolean verifyThatNextIntHasBeenCalledOnceWithParameterEqual2() {
            return signal == 1 && bound == 2;
        }

        public boolean verifyThatNextIntHasBeenCalledOnceWithParameterEqual9() {
            return signal == 1 && bound == 9;
        }

        public boolean verifyThatNextIntHasBeenCalledOnceWithParameterEqual6() {
            return signal == 1 && bound == 6;
        }
    }
}
