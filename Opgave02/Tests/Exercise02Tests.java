import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise02Tests {
    @Test
    public void FirstAndSecondFibbonacciNumber() {
        int actual = FibonacciNumbers.fibonacciNumber(1);
        assertEquals(1, actual);
        actual = FibonacciNumbers.fibonacciNumber(2);
        assertEquals(1, actual);
    }

    @Test void FibbonacciNumber6() {
        int actual = FibonacciNumbers.fibonacciNumber(6);
        assertEquals(8, actual);
    }
}
